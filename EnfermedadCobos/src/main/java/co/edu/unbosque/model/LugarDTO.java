package co.edu.unbosque.model;

import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class LugarDTO {
	
	private String name;
	private MyLinkedList<Vertex<PersonaDTO>> visitantes;
	
	public LugarDTO() {
		// TODO Auto-generated constructor stub
	}

	public LugarDTO(String name, MyLinkedList<Vertex<PersonaDTO>> visitantes) {
		super();
		this.name = name;
		this.visitantes = visitantes;
	}
	
	public LugarDTO(String name) {
		this(name, new MyLinkedList<>());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyLinkedList<Vertex<PersonaDTO>> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(MyLinkedList<Vertex<PersonaDTO>> visitantes) {
		this.visitantes = visitantes;
	}

	@Override
	public String toString() {
		return "Lugar [name=" + name + ", visitantes=" + visitantes + "]";
	}
	
	
	
	

}
