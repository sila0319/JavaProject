package DataStructure;

import java.util.Iterator;

public class GraphListUndirected<V, E> extends GraphList<V, E> {
	public GraphListUndirected() {
		super(false);
	}

	/**
	 * �� ���� ���̿� ������ ���Ѵ�.
	 * �̶� ������ �������̴�.
	 */
	@Override
	public void addEdge(V vlabel1, V vlabel2, E label) {
		GraphListVertex<V, E> v1 = dict.get(vlabel1);
		GraphListVertex<V, E> v2 = dict.get(vlabel2);
		Edge<V, E> e = new Edge<>(v1.label(), v2.label(), label, false);
		v1.addEdge(e);
		v2.addEdge(e);
	}

	/**
	 * �׷������� �ش� ������ ����
	 * �ֺ� ������ ��� ����
	 */
	@Override
	public boolean remove(V label) {
		GraphListVertex<V, E> v = dict.get(label);
		if(v == null) return false;
		
		Iterator<V> vi = neighbors(label);
		while(vi.hasNext()) {
			V vtx = vi.next();
			removeEdge(label, vtx);
		}
		dict.remove(label);
		return true;
	}

	/**
	 * �� ���� ������ ������ ����
	 */
	@Override
	public boolean removeEdge(V vlabel1, V vlabel2) {
		GraphListVertex<V, E> v1 = dict.get(vlabel1);
		GraphListVertex<V, E> v2 = dict.get(vlabel2);
		Edge<V, E> e = new Edge<>(v1.label(), v2.label(), null, false);
		return v2.removeEdge(e) && v1.removeEdge(e);
	}
	
	/**
	 * �׷����� ���� �� ��ȯ
	 */
	@Override
	public int edgeCount() {
		int count = 0;
		Iterator<GraphListVertex<V, E>> i = dict.values().iterator();
		while(i.hasNext())
			count += i.next().degree();
		return count/2;
	}
	
	@Override
	public String toString() {
		return "<GraphListUndirected: "+dict.toString()+">";
	}
	
}