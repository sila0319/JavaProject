package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphListVertex<V, E> extends Vertex<V> {
	
	/**
	 * ������ ������ ���� ����Ʈ
	 */
	protected List<Edge<V, E>> adjacencies;

	public GraphListVertex(V key) {
		super(key);
		adjacencies = new LinkedList<>();	// ��ũ ����Ʈ
	}
	
	/**
	 * ������ ���� ���� ����Ʈ�� ���� �߰�
	 * @param e
	 */
	public void addEdge(Edge<V, E> e) {
		if(!containsEdge(e)) adjacencies.add(e);
	}
	
	/**
	 * ���� ���� ����Ʈ�� ���� ���� ����
	 * @param e
	 * @return
	 */
	public boolean containsEdge(Edge<V, E> e) {
		return adjacencies.contains(e);
	}
	
	/**
	 * ������ �����ϰ� ���� ���� ��ȯ
	 * @param e
	 * @return
	 */
	public boolean removeEdge(Edge<V, E> e){
		return adjacencies.remove(e);
	}
	
	/**
	 * ���� ���� ����Ʈ���� �ش� ������ ������ ��ü ��ȯ
	 * @param e
	 * @return
	 */
	public Edge<V, E> getEdge(Edge<V, E> e) {
		Iterator<Edge<V, E>> edges = adjacencies.iterator();
		while(edges.hasNext()) {
			Edge<V, E> edge = edges.next();
			if(e.equals(edge)) return edge;
		}
		return null;
	}
	
	/**
	 * ���� ��ȯ
	 * @return
	 */
	public int degree() {
		return adjacencies.size();
	}
	
	/**
	 * ���� ���� �ݺ��� ��ȯ
	 * @return
	 */
	public Iterator<V> adjacentVertices() {
		List<V> list = new LinkedList<>();
		Iterator<Edge<V, E>> edges = adjacentEdges();
		while(edges.hasNext()) {
			Edge<V, E> e = edges.next();
			if(label().equals(e.here())) {
				list.add(e.there());
			} else {
				list.add(e.here());
			}
		}
		
		return list.iterator();
	}
	
	/**
	 * ���� �ݺ��� ��ȯ
	 * @return
	 */
	public Iterator<Edge<V, E>> adjacentEdges() {
		return adjacencies.iterator();
	}
	
	public String verticesToString() {
		StringBuffer sb = new StringBuffer();
		for(Edge<V, E> e : adjacencies) {
			if(label().equals(e.here())) sb.append(e.there());
			else sb.append(e.here());
			sb.append(", ");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "<GraphListVertex: "+label()+", Vertices : " + verticesToString() + ">";
	}
}

