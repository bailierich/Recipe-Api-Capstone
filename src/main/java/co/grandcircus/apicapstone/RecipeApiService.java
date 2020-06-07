package co.grandcircus.apicapstone;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriUtils;

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

	private URI buildHealthParamList(List<String> health, String q, String appId, String appKey, Double calories) {
		// ?q=" + q + "&app_id=" +appId + "&app_key=" + appKey + "&from=0&to=5"
		
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
