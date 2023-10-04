package co.edu.unbosque.controller;

import co.edu.unbosque.model.LugarDTO;
import co.edu.unbosque.model.PersonaDTO;
import co.edu.unbosque.util.grafo.generico.Edge;
import co.edu.unbosque.util.grafo.generico.Vertex;
import co.edu.unbosque.util.simple.MyLinkedList;

public class Controller {


	public Controller() {

	}

	public void run() {
		
		PersonaDTO person1 = new  PersonaDTO("sebastian", "12-12-2004", 1234L, "colombia", new MyLinkedList<>(), new MyLinkedList<>());
		LugarDTO cali = new LugarDTO("cali", new MyLinkedList<>());
		Vertex<Object> p1 = new Vertex<Object>(person1);
		Vertex<Object> p2 = new Vertex<Object>(cali);
		p1.addEdge(new Edge(p1, p2, 1));
		
		System.out.println(p1.toString());
		

		
	}

}
