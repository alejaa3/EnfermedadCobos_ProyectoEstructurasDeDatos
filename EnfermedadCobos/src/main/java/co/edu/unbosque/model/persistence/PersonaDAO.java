package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class PersonaDAO {
	
	private MyLinkedList<Vertex<Object>> personas;
	
	public PersonaDAO() {
		personas = new MyLinkedList<Vertex<Object>>();
	}
	
	public MyLinkedList<Vertex<Object>> getPersonas() {
		return personas;
	}

	public void setPersonas(MyLinkedList<Vertex<Object>> personas) {
		this.personas = personas;
	}

	public void createPerson(PersonaDTO person) {
		if(person != null) {
			personas.add(new Vertex<Object>(person));
		}
		
	}
	public String showPeople() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < personas.size(); i++) {
			PersonaDTO person = (PersonaDTO) personas.get(i).getInfo();
			sb.append((i+1)+") "+person.getFullName()+"\n");
		}
		return sb.toString();
	}
	
	public void readPerson() {
		
	}
	
	public void updatePerson() {
		
		
	}
	
	public void removePerson() {
		
	}
	
	

}
