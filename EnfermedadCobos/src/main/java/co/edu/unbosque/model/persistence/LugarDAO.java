package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.LugarDTO;
import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class LugarDAO {
	
	private MyLinkedList<Vertex<Object>> lugares;
	
	public LugarDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void createPlace(LugarDTO place) {
		if(place != null) {
			lugares.add(new Vertex<Object>(place));
		}
	}
	
	public String showPlaces() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lugares.size(); i++) {
			LugarDTO aux = (LugarDTO)lugares.get(i).getInfo();
			sb.append((i+1)+") "+aux.getName()+"\n");
		}
		return sb.toString();
	}

	public MyLinkedList<Vertex<Object>> getLugares() {
		return lugares;
	}

	public void setLugares(MyLinkedList<Vertex<Object>> lugares) {
		this.lugares = lugares;
	}
	
	

	
}
