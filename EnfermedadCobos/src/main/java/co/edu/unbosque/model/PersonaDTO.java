package co.edu.unbosque.model;

import co.edu.unbosque.util.simple.MyLinkedList;

public class PersonaDTO {
	
	private String name;
	private String surname;
	private String birthdate;
	private long id;
	private String nationality;
	private MyLinkedList<Enfermedad> diseases;
	private MyLinkedList<Lugar> visited;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String name, String surname, String birthdate, long id, String nationality,
			MyLinkedList<Enfermedad> diseases, MyLinkedList<Lugar> visited) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.id = id;
		this.nationality = nationality;
		this.diseases = diseases;
		this.visited = visited;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	public MyLinkedList<Enfermedad> getDiseases() {
		return diseases;
	}

	public void setDiseases(MyLinkedList<Enfermedad> diseases) {
		this.diseases = diseases;
	}

	public MyLinkedList<Lugar> getVisited() {
		return visited;
	}

	public void setVisited(MyLinkedList<Lugar> visited) {
		this.visited = visited;
	}
	
	
	

}
