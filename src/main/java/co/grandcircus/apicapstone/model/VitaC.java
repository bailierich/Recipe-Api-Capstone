package co.grandcircus.apicapstone.model;

public class VitaC {
	
	private String label;
	private Double quantity;
	private String unit;
	
	public VitaC() {
		
	}
	
	public VitaC(String label, Double quantity, String unit) {
		super();
		this.label = label;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		return "VitaC [label=" + label + ", quantity=" + quantity + ", unit=" + unit + "]";
	}
}
