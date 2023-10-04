package co.edu.unbosque.model;

public class EnfermedadDTO {
	
	private String name;
	
	public EnfermedadDTO() {
		// TODO Auto-generated constructor stub
	}

	public EnfermedadDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EnfermedadDTO [name=" + name + "]";
	}
	
}
