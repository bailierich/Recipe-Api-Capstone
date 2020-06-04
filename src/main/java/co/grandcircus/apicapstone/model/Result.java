package co.grandcircus.apicapstone.model;

public class Result {

	private Recipe recipe;
	private Boolean bookmarked;
	private Boolean bought;
	
	public Result() {
		
	}
	
	public Result(Recipe recipe, Boolean bookmarked, Boolean bought) {
		super();
		this.recipe = recipe;
		this.bookmarked = bookmarked;
		this.bought = bought;
	}
	
	public Recipe getRecipe() {
		return recipe;
	}
	
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	public Boolean getBookmarked() {
		return bookmarked;
	}
	
	public void setBookmarked(Boolean bookmarked) {
		this.bookmarked = bookmarked;
	}
	
	public Boolean getBought() {
		return bought;
	}
	
	public void setBought(Boolean bought) {
		this.bought = bought;
	}
	
	@Override
	public String toString() {
		return "Result [recipe=" + recipe + ", bookmarked=" + bookmarked + ", bought=" + bought + "]";
	}
}
