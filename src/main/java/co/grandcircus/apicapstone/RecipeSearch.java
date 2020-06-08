package co.grandcircus.apicapstone;

import java.io.Serializable;
import java.util.List;


public class RecipeSearch implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String q;
	private List<String> health;
	private String calories;
	
	
	public RecipeSearch(String q, List<String> health, String calories) {
		super();
		this.q = q;
		this.health = health;
		this.calories = calories;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public List<String> getHealth() {
		return health;
	}
	public void setHealth(List<String> health) {
		this.health = health;
	}
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "RecipeSearch [q=" + q + ", health=" + health + ", calories=" + calories + "]";
	}
	
	
	
}
