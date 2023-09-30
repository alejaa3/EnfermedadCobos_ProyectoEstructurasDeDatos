package co.edu.unbosque.model;

import co.edu.unbosque.util.simple.MyLinkedList;

public class EnfermedadDTO {
	
	private MyLinkedList<EnfermedadDTO> enfermedad;

	public EnfermedadDTO(String...args) {
		enfermedad=new MyLinkedList<EnfermedadDTO>();
		int i=0;
		while(args[i]!=null){
			enfermedad.add(new EnfermedadDTO(args[i]));
			i++;
		}
	}
	
}
