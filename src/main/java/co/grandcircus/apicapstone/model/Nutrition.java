package co.grandcircus.apicapstone.model;

import java.util.List;

public class Nutrition {
	
	private String label;
	private String tag;
	private String schemaOrgTag;
	private Double total;
	private Boolean hasRDI;
	private Double daily;
	private String unit;
	private List<SubCategoryNutrition> sub;
	
	public Nutrition() {
		
	}
	
	public Nutrition(String label, String tag, String schemaOrgTag, Double total, Boolean hasRDI, Double daily,
			String unit, List<SubCategoryNutrition> sub) {
		super();
		this.label = label;
		this.tag = tag;
		this.schemaOrgTag = schemaOrgTag;
		this.total = total;
		this.hasRDI = hasRDI;
		this.daily = daily;
		this.unit = unit;
		this.sub = sub;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String getSchemaOrgTag() {
		return schemaOrgTag;
	}
	
	public void setSchemaOrgTag(String schemaOrgTag) {
		this.schemaOrgTag = schemaOrgTag;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Boolean getHasRDI() {
		return hasRDI;
	}
	
	public void setHasRDI(Boolean hasRDI) {
		this.hasRDI = hasRDI;
	}
	
	public Double getDaily() {
		return daily;
	}
	
	public void setDaily(Double daily) {
		this.daily = daily;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public List<SubCategoryNutrition> getSub() {
		return sub;
	}
	
	public void setSub(List<SubCategoryNutrition> sub) {
		this.sub = sub;
	}
	
	@Override
	public String toString() {
		return "Nutrition [label=" + label + ", tag=" + tag + ", schemaOrgTag=" + schemaOrgTag + ", total=" + total
				+ ", hasRDI=" + hasRDI + ", daily=" + daily + ", unit=" + unit + ", sub=" + sub + "]";
	}
}
