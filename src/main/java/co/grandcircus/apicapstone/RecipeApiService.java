package co.grandcircus.apicapstone;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriUtils;

import co.grandcircus.apicapstone.model.Outermost;
import co.grandcircus.apicapstone.model.Recipe;

@Service
public class RecipeApiService {
	@Value("${app.id}")
	private String appId;
	@Value("${app.key}")
	private String appKey;
	private RestTemplate rest = new RestTemplate();

	public Outermost displayRecipesWithThreeParams(String q, List<String> health, Double calories) {

		String url = buildHealthParamList(health, q, appId, appKey, calories).toString();
		Outermost response = rest.getForObject(url, Outermost.class);
		return response;

	}
	
	public List<Recipe> searchById(String appId, String appKey, String r){
		
		String url = buildById(r, appId, appKey).toString();
		Recipe[] response = rest.getForObject(url, Recipe[].class);
		List<Recipe> recipeResponse = Arrays.asList(response);
		return recipeResponse;
		
		
	}
	
	private URI buildById(String appId, String appKey, String r) {
		
		UriComponentsBuilder b = UriComponentsBuilder.fromHttpUrl("https://api.edamam.com/search")
				.queryParam("app_id", appId)
				.queryParam("app_key", appKey)
				.queryParam("r", r);
		
		return b.build().toUri();
		
		
	}

	private URI buildHealthParamList(List<String> health, String q, String appId, String appKey, Double calories) {
	
		
		UriComponentsBuilder b = UriComponentsBuilder.fromHttpUrl("https://api.edamam.com/search")
				.queryParam("app_id", appId)
				.queryParam("app_key", appKey)
				.queryParam("q", q)
				.queryParam("from", 0)
				.queryParam("to", 5);
		
		if (null != health) {
			b = b.queryParam("health", UriUtils.encode(health.get(0), StandardCharsets.UTF_8));
		}
		
		if (null != calories) {
			b = b.queryParam("calories", calories);
		}
		
		return b.build().toUri();
	}
}
