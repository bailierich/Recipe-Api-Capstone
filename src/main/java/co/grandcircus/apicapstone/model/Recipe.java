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
	
}
