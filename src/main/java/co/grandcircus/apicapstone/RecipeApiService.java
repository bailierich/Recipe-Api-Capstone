package co.grandcircus.apicapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.apicapstone.model.Outermost;

@Service
public class RecipeApiService {
	@Value("${app.id}")
	private String appId;
	@Value("${app.key}")
	private String appKey;
	private RestTemplate rest = new RestTemplate();
	
	public void displayRecipes(String q, List<String> health, Double calories) {
		
		
	
		
		
		String url =  "https://api.edamam.com/search?q={q}&app_id={appId}&app_key={appKey}&from=0&to=5&calories={calories}&health=alcohol-free";
		Outermost response = rest.getForObject(url, Outermost.class,appId,appKey,q);
		
		
		
		
		
	}

}
