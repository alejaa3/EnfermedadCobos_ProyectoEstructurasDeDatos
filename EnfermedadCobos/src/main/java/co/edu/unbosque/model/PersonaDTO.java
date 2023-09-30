package co.edu.unbosque.model;

import java.util.Date;

public class PersonaDTO {
	private String name; 
	private Date birthDate;
	private float id;
	private String nationality;
	EnfermedadDTO enfermedades;
	public PersonaDTO(String name, Date birthDate, float id, String nationality, EnfermedadDTO enfermedades) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.id = id;
		this.nationality = nationality;
		this.enfermedades = enfermedades;
	}
	public PersonaDTO() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public float getId() {
		return id;
	}
	public void setId(float id) {
		this.id = id;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public EnfermedadDTO getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(EnfermedadDTO enfermedades) {
		this.enfermedades = enfermedades;
	}
	@Override
	public String toString() {
		return "PersonaDTO [name=" + name + ", birthDate=" + birthDate + ", id=" + id + ", nationality=" + nationality
				+ ", enfermedades=" + enfermedades + "]";
	}
	
	
	
}
