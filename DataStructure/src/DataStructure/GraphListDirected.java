package DataStructure;

import java.util.Iterator;

public class GraphListDirected<V, E> extends GraphList<V, E> {
    public GraphListDirected()
    {
        super(true);
    }

    /**
     * �� ���� ���� ���� ���� �߰�
     */
    public void addEdge(V vLabel1, V vLabel2, E label) {
	    GraphListVertex<V,E> v1 = dict.get(vLabel1);
	    GraphListVertex<V,E> v2 = dict.get(vLabel2);
	    Edge<V,E> e = new Edge<V,E>(v1.label(), v2.label(), label, true);
	    v1.addEdge(e);
    }

    /**
	 * �׷������� �ش� ������ ����
	 * ��� ���� �� ������ ���ϰų� �������� �ٸ� ������ ���ϴ� ������ ��� ����
     */
    public boolean remove(V label) {
        GraphListVertex<V,E> v = dict.get(label);
        if(v == null) return false;

        Iterator<V> vi = iterator();
        while (vi.hasNext()) {
            V v2 = vi.next();
            if (!label.equals(v2)) removeEdge(v2,label);
        }
        dict.remove(label);
        return true;
    }

    /**
     * ù ��° �������� �� ��° ������ ���ϴ� ���� ����
     */
    public boolean removeEdge(V vLabel1, V vLabel2)  
    {
        GraphListVertex<V,E> v1 = dict.get(vLabel1);
        GraphListVertex<V,E> v2 = dict.get(vLabel2);
        Edge<V,E> e = new Edge<V,E>(v1.label(), v2.label(), null, true);
        return v1.removeEdge(e);
    }

    /**
     * �׷��� ������ �� ��ȯ
     */
    @Override
    public int edgeCount() {
        int count = 0;
        Iterator<GraphListVertex<V,E>> i = dict.values().iterator();
        while (i.hasNext())
            count += i.next().degree();
        return count;
    }

    @Override
    public String toString() {
        return "<GraphListDirected: "+dict.toString()+">";
    }

	@Override
	public void DFS(V v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BFS(V v) {
		// TODO Auto-generated method strub
		
	}
	
}