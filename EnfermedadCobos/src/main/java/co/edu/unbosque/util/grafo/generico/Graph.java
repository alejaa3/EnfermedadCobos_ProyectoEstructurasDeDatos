package co.edu.unbosque.util.grafo.generico;

import co.edu.unbosque.util.simple.MyLinkedList;

public class Graph {
	private MyLinkedList<Vertex<?>> listOfNodes;
	
	public Graph() {
		listOfNodes= new MyLinkedList<Vertex<?>>();
	}
	
	public void addVertex(Vertex<?> v) {
		listOfNodes.addLast(v);
	}

	public MyLinkedList<Vertex<?>> getListOfNodes() {
		return listOfNodes;
	}

	public void setListOfNodes(MyLinkedList<Vertex<?>> listOfNodes) {
		this.listOfNodes = listOfNodes;
	}

	public static void addBidirectionalEdge(int u, int v){
        
		listOfNodes.get(v).getInfo().addEdge(new Edge(listOfNodes.get(v).getInfo(),
				listOfNodes.get(u).getInfo(), 1));
		listOfNodes.get(u).getInfo().addEdge(new Edge(listOfNodes.get(u).getInfo(),
				listOfNodes.get(v).getInfo(), 1));

    }
    public static void addUnidirectionalEdge(int origin, int destination){
    	
    	listOfNodes.get(origin).getInfo().addEdge(new Edge(listOfNodes.get(origin).getInfo(),
    			listOfNodes.get(destination).getInfo(), 1));

    	
    }
	
	@Override
	public String toString() {
		return "lista de nodos en el grafo: "+listOfNodes+" \n";
	}
	
}
