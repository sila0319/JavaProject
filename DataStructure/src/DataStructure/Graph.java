package DataStructure;

import java.util.Iterator;

public interface Graph<V, E> {
	
	/**
	 * �׷����� ���� �߰�
	 * @param vtx
	 * @throws VertexKeyNullException 
	 */
	void add(V vtx);
	
	/**
	 * �� ���� ���̿� ���� �߰�
	 * @param vtx1
	 * @param vtx2
	 * @param edge
	 */
	void addEdge(V vtx1, V vtx2, E edge);
	
	/**
	 * ��� ����, ������ ����
	 */
	void clear();
	
	/**
	 * ���� ���� ����
	 * @param vtx
	 */
	boolean contains(V vtx);
	
	/**
	 * �� ���������� ���� ���� ����
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	boolean containsEdge(V vtx1, V vtx2);
	
	/**
	 * ������ ���� ��ȯ
	 * @param vtx
	 * @return
	 */
	int degree(V vtx);
	
	/**
	 * ������ �� ��ȯ
	 * @return
	 */
	int edgeCount();
	
	/**
	 * ������ �ݺ��� ��ȯ
	 * @return
	 */
	Iterator<Edge<V, E>> edges();
	
	/**
	 * ������ ���� ���� ��ȯ
	 * @param vtx
	 * @return
	 */
	V get(V vtx);
	
	/**
	 * �� ���� ������ ���� ��ȯ
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	Edge<V, E> getEdge(V vtx1, V vtx2);
	
	/**
	 * �׷����� ������ ��Ÿ������ ����
	 * @return
	 */
	boolean isDirected();
	
	/**
	 * �׷����� ������� ����
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * ������ �湮 ����
	 * @param vtx
	 * @return
	 */
	boolean isVisited(V vtx);
	
	/**
	 * ������ �湮 ����
	 * @param e
	 * @return
	 */
	boolean isVisitedEdge(Edge<V, E> e);
	
	/**
	 * ���� �ݺ��� ��ȯ
	 * @return
	 */
	Iterator<V> iterator();
	
	/**
	 * ���� �������� �ݺ��� ��ȯ
	 * @param vtx
	 * @return
	 */
	Iterator<V> neighbors(V vtx);
	
	/**
	 * ���� ����
	 * @param vtx
	 * @return
	 */
	boolean remove(V vtx);
	
	/**
	 * ���� ����
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	boolean removeEdge(V vtx1, V vtx2);
	
	/**
	 * ��� ������ ������ �湮 �÷��׸� ����
	 */
	void reset();
	
	/**
	 * �׷��� ���� ���� �� ��ȯ
	 * @return
	 */
	int size();
	
	/**
	 * �ش� ������ �湮
	 * @param vtx
	 * @return
	 */
	boolean visit(V vtx);
	
	/**
	 * �ش� ������ �湮
	 * @param e
	 * @return
	 */
	boolean visitEdge(Edge<V, E> e);

	/**
	 * 
	 * @param v ���� ����
	 */
	void DFS(V v);

	/**
	 * 
	 * @param v ���� ����
	 */
	void BFS(V v);
}
