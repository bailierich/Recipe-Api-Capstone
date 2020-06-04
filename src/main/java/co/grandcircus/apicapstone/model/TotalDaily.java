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

}
