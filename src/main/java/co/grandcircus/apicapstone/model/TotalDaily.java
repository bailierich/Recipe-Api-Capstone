package co.grandcircus.apicapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalDaily {
	
	@JsonProperty("ENERC_KCAL")
	private Energy energy;
	@JsonProperty("FAT")
	private Fat fat;
	@JsonProperty("FASAT")
	private SaturatedFat saturatedFat;
	@JsonProperty("FATRN")
	private TransFat transFat;
	@JsonProperty("FAMS")
	private MonounsaturatedFat monounsaturatedFat;
	@JsonProperty("FIBTG")
	private Fiber fiber;
	@JsonProperty("SUGAR")
	private Sugar sugar;
	@JsonProperty("PROCNT")
	private Protein protein;
	@JsonProperty("CHOLE")
	private Cholesterol cholesterol;
	@JsonProperty("NA")
	private Sodium sodium;
	@JsonProperty("CA")
	private Calcium calcium;
	@JsonProperty("MG")
	private Magnesium magnesium;
	@JsonProperty("K")
	private Potassium potassium;
	@JsonProperty("FE")
	private Iron iron;
	@JsonProperty("Zn")
	private Zinc zinc;
	@JsonProperty("P")
	private Phosphorus phosphorus;
	@JsonProperty("VITA_RAE")
	private VitaA vitaA;
	@JsonProperty("VITC")
	private VitaC vitaC;
	@JsonProperty("THIA")
	private Thiamin thiamin;
	@JsonProperty("RIBF")
	private Riboflavin riboflavin;
	@JsonProperty("NIA")
	private Niacin niacin;
	@JsonProperty("VITB6A")
	private VitaB6 vitaB6;
	@JsonProperty("FOLDFE")
	private FolateEqual folateEqual;
	@JsonProperty("FOLFD")
	private Folate folate;
	@JsonProperty("FOLAC")
	private FolicAcid folicAcid;
	@JsonProperty("VITB12")
	private VitaB12 vitaB12;
	@JsonProperty("VITD")
	private VitaD vitaD;
	@JsonProperty("TOCPHA")
	private VitaE vitaE;
	@JsonProperty("VITK1")
	private VitaK vitaK;
	
	public TotalDaily() {
		
	}
	
	public TotalDaily(Energy energy, Fat fat, SaturatedFat saturatedFat, TransFat transFat,
			MonounsaturatedFat monounsaturatedFat, Fiber fiber, Sugar sugar, Protein protein, Cholesterol cholesterol,
			Sodium sodium, Calcium calcium, Magnesium magnesium, Potassium potassium, Iron iron, Zinc zinc,
			Phosphorus phosphorus, VitaA vitaA, VitaC vitaC, Thiamin thiamin, Riboflavin riboflavin, Niacin niacin,
			VitaB6 vitaB6, FolateEqual folateEqual, Folate folate, FolicAcid folicAcid, VitaB12 vitaB12, VitaD vitaD,
			VitaE vitaE, VitaK vitaK) {
		super();
		this.energy = energy;
		this.fat = fat;
		this.saturatedFat = saturatedFat;
		this.transFat = transFat;
		this.monounsaturatedFat = monounsaturatedFat;
		this.fiber = fiber;
		this.sugar = sugar;
		this.protein = protein;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.calcium = calcium;
		this.magnesium = magnesium;
		this.potassium = potassium;
		this.iron = iron;
		this.zinc = zinc;
		this.phosphorus = phosphorus;
		this.vitaA = vitaA;
		this.vitaC = vitaC;
		this.thiamin = thiamin;
		this.riboflavin = riboflavin;
		this.niacin = niacin;
		this.vitaB6 = vitaB6;
		this.folateEqual = folateEqual;
		this.folate = folate;
		this.folicAcid = folicAcid;
		this.vitaB12 = vitaB12;
		this.vitaD = vitaD;
		this.vitaE = vitaE;
		this.vitaK = vitaK;
	}
	
	public Energy getEnergy() {
		return energy;
	}
	
	public void setEnergy(Energy energy) {
		this.energy = energy;
	}
	
	public Fat getFat() {
		return fat;
	}
	
	public void setFat(Fat fat) {
		this.fat = fat;
	}
	
	public SaturatedFat getSaturatedFat() {
		return saturatedFat;
	}
	
	public void setSaturatedFat(SaturatedFat saturatedFat) {
		this.saturatedFat = saturatedFat;
	}
	
	public TransFat getTransFat() {
		return transFat;
	}
	
	public void setTransFat(TransFat transFat) {
		this.transFat = transFat;
	}
	
	public MonounsaturatedFat getMonounsaturatedFat() {
		return monounsaturatedFat;
	}
	
	public void setMonounsaturatedFat(MonounsaturatedFat monounsaturatedFat) {
		this.monounsaturatedFat = monounsaturatedFat;
	}
	
	public Fiber getFiber() {
		return fiber;
	}
	
	public void setFiber(Fiber fiber) {
		this.fiber = fiber;
	}
	
	public Sugar getSugar() {
		return sugar;
	}
	
	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}
	
	public Protein getProtein() {
		return protein;
	}
	
	public void setProtein(Protein protein) {
		this.protein = protein;
	}
	
	public Cholesterol getCholesterol() {
		return cholesterol;
	}
	
	public void setCholesterol(Cholesterol cholesterol) {
		this.cholesterol = cholesterol;
	}
	
	public Sodium getSodium() {
		return sodium;
	}
	
	public void setSodium(Sodium sodium) {
		this.sodium = sodium;
	}
	
	public Calcium getCalcium() {
		return calcium;
	}
	
	public void setCalcium(Calcium calcium) {
		this.calcium = calcium;
	}
	
	public Magnesium getMagnesium() {
		return magnesium;
	}
	
	public void setMagnesium(Magnesium magnesium) {
		this.magnesium = magnesium;
	}
	
	public Potassium getPotassium() {
		return potassium;
	}
	
	public void setPotassium(Potassium potassium) {
		this.potassium = potassium;
	}
	
	public Iron getIron() {
		return iron;
	}
	
	public void setIron(Iron iron) {
		this.iron = iron;
	}
	
	public Zinc getZinc() {
		return zinc;
	}
	
	public void setZinc(Zinc zinc) {
		this.zinc = zinc;
	}
	
	public Phosphorus getPhosphorus() {
		return phosphorus;
	}
	
	public void setPhosphorus(Phosphorus phosphorus) {
		this.phosphorus = phosphorus;
	}
	
	public VitaA getVitaA() {
		return vitaA;
	}
	
	public void setVitaA(VitaA vitaA) {
		this.vitaA = vitaA;
	}
	
	public VitaC getVitaC() {
		return vitaC;
	}
	
	public void setVitaC(VitaC vitaC) {
		this.vitaC = vitaC;
	}
	
	public Thiamin getThiamin() {
		return thiamin;
	}
	
	public void setThiamin(Thiamin thiamin) {
		this.thiamin = thiamin;
	}
	
	public Riboflavin getRiboflavin() {
		return riboflavin;
	}
	
	public void setRiboflavin(Riboflavin riboflavin) {
		this.riboflavin = riboflavin;
	}
	
	public Niacin getNiacin() {
		return niacin;
	}
	
	public void setNiacin(Niacin niacin) {
		this.niacin = niacin;
	}
	
	public VitaB6 getVitaB6() {
		return vitaB6;
	}
	
	public void setVitaB6(VitaB6 vitaB6) {
		this.vitaB6 = vitaB6;
	}
	
	public FolateEqual getFolateEqual() {
		return folateEqual;
	}
	
	public void setFolateEqual(FolateEqual folateEqual) {
		this.folateEqual = folateEqual;
	}
	
	public Folate getFolate() {
		return folate;
	}
	
	public void setFolate(Folate folate) {
		this.folate = folate;
	}
	
	public FolicAcid getFolicAcid() {
		return folicAcid;
	}
	
	public void setFolicAcid(FolicAcid folicAcid) {
		this.folicAcid = folicAcid;
	}
	
	public VitaB12 getVitaB12() {
		return vitaB12;
	}
	
	public void setVitaB12(VitaB12 vitaB12) {
		this.vitaB12 = vitaB12;
	}
	
	public VitaD getVitaD() {
		return vitaD;
	}
	
	public void setVitaD(VitaD vitaD) {
		this.vitaD = vitaD;
	}
	
	public VitaE getVitaE() {
		return vitaE;
	}
	
	public void setVitaE(VitaE vitaE) {
		this.vitaE = vitaE;
	}
	
	public VitaK getVitaK() {
		return vitaK;
	}
	
	public void setVitaK(VitaK vitaK) {
		this.vitaK = vitaK;
	}
	
	@Override
	public String toString() {
		return "TotalDaily [energy=" + energy + ", fat=" + fat + ", saturatedFat=" + saturatedFat + ", transFat="
				+ transFat + ", monounsaturatedFat=" + monounsaturatedFat + ", fiber=" + fiber + ", sugar=" + sugar
				+ ", protein=" + protein + ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", calcium="
				+ calcium + ", magnesium=" + magnesium + ", potassium=" + potassium + ", iron=" + iron + ", zinc="
				+ zinc + ", phosphorus=" + phosphorus + ", vitaA=" + vitaA + ", vitaC=" + vitaC + ", thiamin=" + thiamin
				+ ", riboflavin=" + riboflavin + ", niacin=" + niacin + ", vitaB6=" + vitaB6 + ", folateEqual="
				+ folateEqual + ", folate=" + folate + ", folicAcid=" + folicAcid + ", vitaB12=" + vitaB12 + ", vitaD="
				+ vitaD + ", vitaE=" + vitaE + ", vitaK=" + vitaK + "]";
	}
}
