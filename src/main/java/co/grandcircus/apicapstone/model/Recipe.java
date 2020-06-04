package co.grandcircus.apicapstone.model;

import java.util.List;

public class Recipe {

	private String uri;
	private String label;
	private String image;
	private String source;
	private String url;
	private String shareAs;
	private Integer yield;
	private List<String> dietLabels;
	private List<String> healthLabels;
	private List<String> cautions;
	private List<String> ingredientLines;
	private List<Ingredient> ingredients;
	private Double calories;
	private Double totalWeight;
	private Integer totalTime;
	private TotalNutrients totalNutrients;
	private TotalDaily totalDaily;
	private List<Nutrition> digest;
	
	public Recipe() {
		
	}
	
	public Recipe(String uri, String label, String image, String source, String url, String shareAs, Integer yield,
			List<String> dietLabels, List<String> healthLabels, List<String> cautions, List<String> ingredientLines,
			List<Ingredient> ingredients, Double calories, Double totalWeight, Integer totalTime,
			TotalNutrients totalNutrients, TotalDaily totalDaily, List<Nutrition> digest) {
		super();
		this.uri = uri;
		this.label = label;
		this.image = image;
		this.source = source;
		this.url = url;
		this.shareAs = shareAs;
		this.yield = yield;
		this.dietLabels = dietLabels;
		this.healthLabels = healthLabels;
		this.cautions = cautions;
		this.ingredientLines = ingredientLines;
		this.ingredients = ingredients;
		this.calories = calories;
		this.totalWeight = totalWeight;
		this.totalTime = totalTime;
		this.totalNutrients = totalNutrients;
		this.totalDaily = totalDaily;
		this.digest = digest;
	}
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getShareAs() {
		return shareAs;
	}
	
	public void setShareAs(String shareAs) {
		this.shareAs = shareAs;
	}
	
	public Integer getYield() {
		return yield;
	}
	
	public void setYield(Integer yield) {
		this.yield = yield;
	}
	
	public List<String> getDietLabels() {
		return dietLabels;
	}
	
	public void setDietLabels(List<String> dietLabels) {
		this.dietLabels = dietLabels;
	}
	
	public List<String> getHealthLabels() {
		return healthLabels;
	}
	
	public void setHealthLabels(List<String> healthLabels) {
		this.healthLabels = healthLabels;
	}
	
	public List<String> getCautions() {
		return cautions;
	}
	
	public void setCautions(List<String> cautions) {
		this.cautions = cautions;
	}
	
	public List<String> getIngredientLines() {
		return ingredientLines;
	}
	
	public void setIngredientLines(List<String> ingredientLines) {
		this.ingredientLines = ingredientLines;
	}
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public Double getCalories() {
		return calories;
	}
	
	public void setCalories(Double calories) {
		this.calories = calories;
	}
	
	public Double getTotalWeight() {
		return totalWeight;
	}
	
	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	public Integer getTotalTime() {
		return totalTime;
	}
	
	public void setTotalTime(Integer totalTime) {
		this.totalTime = totalTime;
	}
	
	public TotalNutrients getTotalNutrients() {
		return totalNutrients;
	}
	
	public void setTotalNutrients(TotalNutrients totalNutrients) {
		this.totalNutrients = totalNutrients;
	}
	
	public TotalDaily getTotalDaily() {
		return totalDaily;
	}
	
	public void setTotalDaily(TotalDaily totalDaily) {
		this.totalDaily = totalDaily;
	}
	
	public List<Nutrition> getDigest() {
		return digest;
	}
	
	public void setDigest(List<Nutrition> digest) {
		this.digest = digest;
	}
	
	@Override
	public String toString() {
		return "Recipe [uri=" + uri + ", label=" + label + ", image=" + image + ", source=" + source + ", url=" + url
				+ ", shareAs=" + shareAs + ", yield=" + yield + ", dietLabels=" + dietLabels + ", healthLabels="
				+ healthLabels + ", cautions=" + cautions + ", ingredientLines=" + ingredientLines + ", ingredients="
				+ ingredients + ", calories=" + calories + ", totalWeight=" + totalWeight + ", totalTime=" + totalTime
				+ ", totalNutrients=" + totalNutrients + ", totalDaily=" + totalDaily + ", digest=" + digest + "]";
	}
}
