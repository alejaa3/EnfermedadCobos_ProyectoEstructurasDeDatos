package co.edu.unbosque.model;

import co.edu.unbosque.util.simple.MyLinkedList;

public class PersonaDTO {
	
	private String fullName;
	private String birthdate;
	private long id;
	private String nationality;
	private MyLinkedList<EnfermedadDTO> diseases;
	private MyLinkedList<LugarDTO> visited;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String fullName, String birthdate, long id, String nationality,
			MyLinkedList<EnfermedadDTO> diseases, MyLinkedList<LugarDTO> visited) {
		super();
		this.fullName = fullName;
		this.birthdate = birthdate;
		this.id = id;
		this.nationality = nationality;
		this.diseases = diseases;
		this.visited = visited;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public MyLinkedList<EnfermedadDTO> getDiseases() {
		return diseases;
	}

	public void setDiseases(MyLinkedList<EnfermedadDTO> diseases) {
		this.diseases = diseases;
	}

	public MyLinkedList<LugarDTO> getVisited() {
		return visited;
	}

	public void setVisited(MyLinkedList<LugarDTO> visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "PersonaDTO [fullName=" + fullName + ", birthdate=" + birthdate + ", id=" + id + ", nationality="
				+ nationality + ", diseases=" + diseases + ", visited=" + visited + "]";
	}

}
