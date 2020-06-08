package co.grandcircus.apicapstone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Favorite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String recipeLabel;
	private String uri;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecipeLabel() {
		return recipeLabel;
	}
	public void setRecipeLabel(String recipeLabel) {
		this.recipeLabel = recipeLabel;
	}
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "Favorite [id=" + id + ", recipeLabel=" + recipeLabel + "]";
	}
	
	
	
	
}
