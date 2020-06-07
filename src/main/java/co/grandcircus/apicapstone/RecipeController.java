package co.grandcircus.apicapstone;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.apicapstone.dao.RecipeApiDao;
import co.grandcircus.apicapstone.model.Outermost;
import co.grandcircus.apicapstone.model.Result;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeApiService service;
	
	@Autowired
	private RecipeApiDao dao;
	
	@RequestMapping("/")
	public String displayForm() {

		return "index";
	}
	
	@RequestMapping("/recipes")
	public String displaySearchResults(@RequestParam String q, @RequestParam (required = false) List<String> health,
									   @RequestParam (required = false) String calories, Model model) {
	Double calDouble;	
	
	try {
		calDouble = Double.parseDouble(calories);
	}catch(NullPointerException | NumberFormatException parseError) {
		calDouble = null;
	}
	
	Outermost outermost = service.displayRecipesWithThreeParams(q, health, calDouble);
	
	List<Result> results= outermost.getHits();
		
	model.addAttribute("results",results);
		
		
		return "results";
		
	}
	
	@RequestMapping("/recipe-details")
	public String displayRecipeDetails() {
		
		
		
		
		return "recipe-details";
	}
	
	@RequestMapping("/favorites")
	public String displayFavoritesPage() {
		
		
		
		
		
		return "favorites";
		
	}
	
	
	
	
	
	
	

}
