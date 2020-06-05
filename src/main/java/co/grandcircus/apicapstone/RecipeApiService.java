package co.grandcircus.apicapstone;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.apicapstone.model.Outermost;

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

	public URI buildHealthParamList(List<String> health, String q, String appId, String appKey, Double calories) {
		UriComponentsBuilder b = UriComponentsBuilder
				.fromHttpUrl("http://api.edamam.com/search?q=" + q + "app_id=" +appId + "app_key=" + appKey + "from=0&to=5");
		URI uriBuild = null;
		
		if (health == null && calories == null) {
			uriBuild = b.build().toUri();
			return uriBuild;
		} else if (calories == null) {
			for (String string : health) {
				b.queryParam("health", string);
				uriBuild = b.build().toUri();
			}
			return uriBuild;
		} else if (health == null) {
			b.queryParam("calories", calories);
			uriBuild = b.build().toUri();
			return uriBuild;
		} else {
			for (String string : health) {
				b.queryParam("health", string);
				uriBuild = b.build().toUri();
			}
			b.queryParam("calories", calories);
			uriBuild = b.build().toUri();
			return uriBuild;
		}

	}
}
