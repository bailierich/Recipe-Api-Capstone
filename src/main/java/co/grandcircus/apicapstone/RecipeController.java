package co.grandcircus.apicapstone;

import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;

import co.grandcircus.apicapstone.dao.RecipeApiDao;
import co.grandcircus.apicapstone.entity.Favorite;
import co.grandcircus.apicapstone.model.Outermost;
import co.grandcircus.apicapstone.model.Recipe;
import co.grandcircus.apicapstone.model.Result;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeApiService service;
	
	@Autowired
	private RecipeApiDao dao;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public String displayForm() {

		return "index";
	}
	
	@RequestMapping("/recipes")
	public String displaySearchResults(@RequestParam (required = false) String q, @RequestParam (required = false) List<String> health,
									   @RequestParam (required = false) String calories, Model model) {
		
		RecipeSearch recipeSearch = new RecipeSearch(q,health,calories);
		
		if (q != null) {
			session.setAttribute("recipeSearch",recipeSearch);
		}
		
		if (q == null ) {
		recipeSearch = (RecipeSearch) session.getAttribute("recipeSearch");
		
		q = recipeSearch.getQ();
		health = recipeSearch.getHealth();
		calories = recipeSearch.getCalories();
		}
		
	Double calDouble;	
	
	try {
		calDouble = Double.parseDouble(calories);
	}catch(NullPointerException | NumberFormatException parseError) {
		calDouble = null;
	}
	
	Outermost outermost = service.displayRecipesWithThreeParams(q, health, calDouble);
	
	List<Result> results= outermost.getHits();
	for(Result result: results) {
		String uri = UriUtils.encode(result.getRecipe().getUri(), StandardCharsets.UTF_8);
		result.getRecipe().setUri(uri);
		System.out.println(uri);
	}
		
	model.addAttribute("results",results);
		
		
		return "results";
		
	}
	
	@RequestMapping("/recipe-details")
	public String displayRecipeDetails(@RequestParam String uri, Model model) {
		
		System.out.println(uri);
		List<Recipe> recipe = service.searchById(UriUtils.encode(uri, StandardCharsets.UTF_8));
		
		System.out.println(recipe.get(0));
		
		
		model.addAttribute("recipes",recipe);
		
		return "recipe-details";
	}
	
	@RequestMapping("/add-to-favorites")
	public String addToFavorite(@RequestParam String label, @RequestParam String uri) {
		Favorite favorite = new Favorite();
		favorite.setRecipeLabel(label);
		favorite.setUri(uri);
		dao.save(favorite);
		
		return "redirect:/recipes";
		
	}
	
	@RequestMapping("/favorites")
	public String displayFavorites(Model model) {
		
		List<Favorite> favorites = dao.findAll();
		
		model.addAttribute("favorites",favorites);
		
		return "favorites";
	}
	@RequestMapping("/delete-favorite")
	public String deleteFavorite(@RequestParam Long id) {
		
		dao.deleteById(id);
		
		return "redirect:/favorites";
	}
	
	
	
	
	
	

}
