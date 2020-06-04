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

	public Outermost displayRecipesWithThreeParams(String q, List<String> health, Double calories) {

		if ((q != null && !q.isEmpty()) && (health == null || health.isEmpty()) && (calories == null)) {
			String url1 = "https://api.edamam.com/search?q={q}&app_id={appId}&app_key={appKey}&from=0&to=5";
			Outermost response1 = rest.getForObject(url1, Outermost.class, appId, appKey, q);
			return response1;
		} else if ((health != null ) && (q != null) && (calories == null)) {
			String url2 = "https://api.edamam.com/search?q={q}&app_id={appId}&app_key={appKey}&from=0&to=5&health={health}";
			// for loop to create multiple health restrictions in url
			Outermost response2 = rest.getForObject(url2, Outermost.class, appId, appKey, q, health);
			return response2;
		} else if ((q != null) && (calories != null) && (health == null || health.isEmpty())) {
			String url3 = "https://api.edamam.com/search?q={q}&app_id={appId}&app_key={appKey}&from=0&to=5&calories={calories}";
			Outermost response3 = rest.getForObject(url3, Outermost.class, appId, appKey, q, calories);
			return response3;
		} else {
			String url4 = "https://api.edamam.com/search?q={q}&app_id={appId}&app_key={appKey}&from=0&to=5&calories={calories}&health=alcohol-free";
			Outermost response4 = rest.getForObject(url4, Outermost.class, appId, appKey, q, calories, health);
			return response4;
		}
	}
}
