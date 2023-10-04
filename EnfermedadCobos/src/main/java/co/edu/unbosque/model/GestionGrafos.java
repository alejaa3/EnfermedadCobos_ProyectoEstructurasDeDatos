package co.edu.unbosque.model;

import java.util.Random;

import javax.print.attribute.standard.QueuedJobCount;

import co.edu.unbosque.model.persistence.LugarDAO;
import co.edu.unbosque.model.persistence.PersonaDAO;
import co.edu.unbosque.util.grafo.generico.Edge;
import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class GestionGrafos {

	private PersonaDAO personas;
	private LugarDAO lugares;
	
	public GestionGrafos() {
		personas = new PersonaDAO();
		lugares = new LugarDAO();
	}
	
	public void agregarPersona(String name, String nacimiento, Long id, String nationality, MyLinkedList<EnfermedadDTO> diseases, MyLinkedList<LugarDTO> lugares) {
		PersonaDTO person = new PersonaDTO(name, nacimiento, id, nationality, diseases, lugares);
		personas.createPerson(person);
		agregarLugar(person);
		agregarCamino(person);
		
		
	}
	
	public void agregarLugar(PersonaDTO person) {
		
		for (int i = 0; i < person.getVisited().size(); i++) {
			for (int j = 0; j < lugares.getLugares().size(); j++) {
				String lperson = person.getVisited().get(i).getName();
				LugarDTO aux = (LugarDTO)lugares.getLugares().get(j).getInfo();
				String llugar = aux.getName();
				
				if(!lperson.equals(llugar)) {
					MyLinkedList<Vertex<PersonaDTO>> personas = new MyLinkedList<Vertex<PersonaDTO>>();
					personas.add(new Vertex<PersonaDTO>(person));
					LugarDTO nuevo = new LugarDTO(lperson, personas);
					lugares.createPlace(nuevo);
				}else if(lperson.equals(llugar)) {
					LugarDTO temp = (LugarDTO)lugares.getLugares().get(j).getInfo();
					temp.getVisitantes().add(new Vertex<PersonaDTO>(person));
					lugares.getLugares().get(j).setInfo(temp);
				}
			}
			
		}
		
	}
	
	public void agregarCamino(PersonaDTO person) {
		for (int i = 0; i < personas.getPersonas().size(); i++) {
			PersonaDTO p = (PersonaDTO) personas.getPersonas().get(i).getInfo();
			if(person.equals(p)) {
				for (int j = 0; j < person.getVisited().size(); j++) {
					LugarDTO aux = person.getVisited().get(j);
					personas.getPersonas().get(i).addEdge(new Edge(personas.getPersonas().get(i), new Vertex<LugarDTO>(aux), 1));
				}
				break;
			}
			
		}
		
	}
	
	public void agregarContagiados() {
		Random r = new Random();
		for (int i = 0; i < lugares.getLugares().size(); i++) {
			LugarDTO aux = (LugarDTO)lugares.getLugares().get(i).getInfo();
			for (int j = 0; j < aux.getVisitantes().size(); j++) {
				int pos = r.nextInt(aux.getVisitantes().size() - 0 + 1)- 0;
				if(pos == j) {
					pos++;
					if(pos == aux.getVisitantes().size()) {
						pos = pos - 2;
					}
				}
				aux.getVisitantes().get(j).addEdge(new Edge(aux.getVisitantes().get(i), aux.getVisitantes().get(pos), 1));
			}
			
			
		}
		
		
	}
	
	
	
	
	
}
