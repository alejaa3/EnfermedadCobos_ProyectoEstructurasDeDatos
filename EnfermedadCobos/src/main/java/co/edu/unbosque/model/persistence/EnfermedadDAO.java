package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.EnfermedadDTO;
import co.edu.unbosque.util.simple.MyLinkedList;

public class EnfermedadDAO {
	
	private MyLinkedList<EnfermedadDTO> enfermedades;
	
	public EnfermedadDAO() {
		enfermedades  = new MyLinkedList<EnfermedadDTO>();
	}
	
	public void createEnfermedad(String enfermedad) {
		if(enfermedad != null) {
			enfermedades.add(new EnfermedadDTO(enfermedad));
		}
	}
	
	public String showDiseases() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < enfermedades.size(); i++) {
			sb.append((i+1)+") "+enfermedades.get(i).getName()+"\n");
		} 
		return sb.toString();
	}
	
	

}
