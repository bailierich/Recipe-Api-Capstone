package co.grandcircus.apicapstone;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.grandcircus.apicapstone.model.Outermost;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiCapstoneIntegrationTest {

	@Autowired
	private RecipeApiService service;
	
	@Test
	public void recipeApiServiceReturnsRecipe() {
		Outermost outermost = service.displayRecipesWithThreeParams("chicken", Arrays.asList("vegan", "vegetarian"), 250.00);
		assertThat(outermost.getHits()).hasSizeGreaterThan(0);
	}
}
