package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Queue;

public abstract class GraphList<V, E> implements Graph<V, E> {
	
	protected Map<V, GraphListVertex<V, E>> dict;
	protected boolean directed;
	
	protected GraphList(boolean dir) {
		dict = new HashMap<V, GraphListVertex<V, E>>();
		directed = dir;
	}
	
	/**
	 * ���� ����Ʈ�� ���� �߰�
	 */
	@Override
	public void add(V label) {
		if(dict.containsKey(label)) return;
		GraphListVertex<V, E> v = new GraphListVertex<V, E>(label);
		dict.put(label, v);
	}

	/**
	 * �� ���� ���� ���� �߰�
	 */
	abstract public void addEdge(V vtx1, V vtx2, E edge);

	@Override
	public void clear() {
		dict.clear();
	}

	/**
	 * ���� ���� ����
	 */
	@Override
	public boolean contains(V label) {
		return dict.containsKey(label);
	}

	@Override
	public boolean containsEdge(V label1, V label2) {
		if(!dict.containsKey(label1)) return false;
		else {
			Edge<V, E> e = new Edge<V, E>(label1, label2, null, directed);
			return dict.get(label1).containsEdge(e);
		}
	}

	/**
	 * �ش� ���� ������ �����ϸ�, ������ ���� ��ȯ,
	 * �������� ������ -1 ��ȯ
	 */
	@Override
	public int degree(V label) {
		if(!dict.containsKey(label)) return -1;
		else return dict.get(label).degree();
	}

	/**
	 * ������ ������ ���� ������ ī��Ʈ�ϴ� ����� �ٸ��Ƿ� �߻�ȭ
	 */
	abstract public int edgeCount();

	/**
	 * �׷����� �����ϴ� ������ ��ȯ
	 */
	@Override
	public Iterator<Edge<V, E>> edges() {
		List<Edge<V, E>> list = new LinkedList<>();
		Iterator<GraphListVertex<V, E>> dictIt = dict.values().iterator();
		while(dictIt.hasNext()) {
			GraphListVertex<V, E> vtx = dictIt.next();
			Iterator<Edge<V, E>> vtxIt = vtx.adjacentEdges();
			while(vtxIt.hasNext()) {
				Edge<V, E> e = vtxIt.next();
				if(vtx.label().equals(e.here())) list.add(e);
			}
		}
		return list.iterator();
	}

	/**
	 * ������ ���� ��ȯ
	 */
	@Override
	public V get(V label) {
		if(!dict.containsKey(label)) return null;
		else return dict.get(label).label();
	}

	/**
	 * ���� �� �� ������ ���� ��ȯ
	 */
	@Override
	public Edge<V, E> getEdge(V label1, V label2) {
		if(!dict.containsKey(label1)) return null;
		else {
			Edge<V, E> e = new Edge<V, E>(get(label1), get(label2), null, directed);
			return dict.get(label1).getEdge(e);
		}
	}

	/**
	 * ����, ������ �׷��� ����
	 */
	@Override
	public boolean isDirected() {
		return directed;
	}

	/**
	 * �׷��� ������� ����
	 */
	@Override
	public boolean isEmpty() {
		return dict.isEmpty();
	}

	/**
	 * ������ �湮 ����
	 */
	@Override
	public boolean isVisited(V label) {
		return dict.get(label).isVisited();
	}

	/**
	 * ������ �湮 ����
	 */
	@Override
	public boolean isVisitedEdge(Edge<V, E> e) {
		return e.isVisited();
	}

	/**
	 * ���� �ݺ��� ��ȯ
	 */
	@Override
	public Iterator<V> iterator() {
		return dict.keySet().iterator();
	}

	
	/**
	 * ���� ���� �ݺ��� ��ȭ
	 */
	@Override
	public Iterator<V> neighbors(V label) {
		if(dict.containsKey(label)) return null;
		else return dict.get(label).adjacentVertices();
	}

	/**
	 * ���� ����
	 */
	abstract public boolean remove(V vtx);

	/**
	 * ���� ����
	 */
	abstract public boolean removeEdge(V vtx1, V vtx2);

	/**
	 * ������ �������� �湮 ���θ� ����
	 */
	@Override
	public void reset() {
		// ������ ����
		Iterator<GraphListVertex<V, E>> vl = dict.values().iterator();
		while(vl.hasNext()) {
			GraphListVertex<V, E> vtx = vl.next();
			vtx.reset();
		}
		// ������ ����
		Iterator<Edge<V, E>> es = edges();
		while(es.hasNext()) {
			Edge<V, E> e = es.next();
			e.reset();
		}
	}

	/**
	 * �׷����� ���� ����
	 */
	@Override
	public int size() {
		return dict.size();
	}

	/**
	 * ������ �湮
	 */
	@Override
	public boolean visit(V label) {
		return dict.get(label).visit();
	}

	/**
	 * ������ �湮
	 */
	@Override
	public boolean visitEdge(Edge<V, E> e) {
		return e.visit();
	}
	
	
	@Override
	public void BFS(V v) {
		GraphListVertex<V, E> start = dict.get(v);	// ���� ����
		
		Queue<GraphListVertex<V, E>> queue = new LinkedList<>();	// ť ����
		
		queue.add(start);	// ���� ���� �湮 �� ť �ֱ�
		start.visit();
		
		StringBuffer sb = new StringBuffer();
		
		while(!queue.isEmpty()) {
			GraphListVertex<V, E> gv = queue.poll();
			sb.append(gv.label + " -> ");
			
			Iterator<V> iterator = gv.adjacentVertices();	// �ֺ� ���� ��ȸ
			while(iterator.hasNext()) {
				GraphListVertex<V, E> g = dict.get(iterator.next());
				if(!g.visited) {
					queue.add(g);
					g.visit();
				}
			}
		}
		
		reset();
		System.out.println(sb.toString());
	}
	
	@Override
	public void DFS(V v) {
		GraphListVertex<V, E> start = dict.get(v);	// ���� ���� ���� ���
		
		Stack<GraphListVertex<V, E>> stack = new Stack<>();	// ���� ����
		
		stack.push(start);	// ���� ���� �湮 �� ���� �ױ�
		start.visit();

		StringBuffer sb = new StringBuffer(v + " -> ");
		
		while(!stack.empty()) {	// ������ ������ �� ���� �ݺ�
			GraphListVertex<V, E> gv = stack.peek();
			
			Iterator<V> iterator = gv.adjacentVertices();	// �ֺ� ���� ��ȸ
			boolean check = false;	// ���� �߰��� ������ �ִ��� üũ
			while(iterator.hasNext()) {
				GraphListVertex<V, E> g = dict.get(iterator.next());
				if(!g.visited) {	// �湮���� ���� ���� ���� ���� ��, �湮�ϱ�
					stack.push(g);
					g.visit();
					sb.append(g.label + " -> ");
					check = true;
					break;
				}
			}
			
			if(!check) sb.append("( pop " + stack.pop().label() + " ) ");	// �湮�� ������ ���ٸ� ���� ��
		}
		
		reset();	// �湮 �÷��׸� ����
		System.out.println(sb.toString());
		
	}

}