package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class PersonaDAO {
	
	private MyLinkedList<Vertex<PersonaDTO>> personas;
	
	public PersonaDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void addPerson(PersonaDTO person) {
		if(person != null) {
			personas.add(new Vertex<PersonaDTO>(person));
			
		}
		
	}
	
	public String showPeople() {
		String resp = "";
		for (int i = 0; i < personas.size(); i++) {
			resp += personas.get(i).getInfo();
		}
		return resp;
	}
	
	public String showListPeople() {
		String resp = "";
		for (int i = 0; i < personas.size(); i++) {
			String nombre = personas.get(i).getInfo().getName();
			String apellido = personas.get(i).getInfo().getSurname();
			resp += (i+1)+nombre+" "+apellido+"\n";
		}
		return resp;
	}
	
	public void updatePerson(PersonaDTO person) {
		
	}
	
	public void deletePerson() {
		
	}
	
	

}
