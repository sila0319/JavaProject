package DataStructure;

public class Edge<V, E> {
    protected boolean directed;    // ���� ����
    protected V here;            // �� ���� �� ù�� °
    protected V there;            // �� ���� �� �ι� °
    protected E label;            // ��
    protected boolean visited;    // �湮 ����

    public Edge(V vtx1, V vtx2, E label, boolean directed) {
        this.here = vtx1;
        this.there = vtx2;
        this.label = label;
        this.directed = directed;
        visited = false;
    }

    V here() {
        return this.here;
    }

    boolean isDirected() {
        return this.directed;
    }

    boolean isVisited() {
        return this.visited;
    }

    E label() {
        return this.label;
    }

    void reset() {
        this.visited = false;
    }

    void setLabel(E label) {
        this.label = label;
    }

    V there() {
        return this.there;
    }

    boolean visit() {
        return this.visited;
    }

    /*
     * ������ ���Ѵ�.
     * ������ ������ �� �ܼ� ���ϰ�,
     * ���� ������ ���� ���� ���� ���⵵ ���ƾ� �Ѵ�.
     */
    @Override
    public boolean equals(Object obj) {
        Edge<?, ?> e = (Edge<?, ?>) obj;
        return ((here().equals(e.here()) && there().equals(e.there())) ||
               ((here().equals(e.there()) && there().equals(e.here()) && !directed)));
    }

    /*
     * �� �� �� ���� ������ ����, �湮 ���� ������ ��ȯ
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("label : " + label.toString());
        sb.append("\n");
        sb.append(here.toString());

        if(directed) sb.append(" -> ");
        else sb.append(" - ");

        sb.append(there.toString());
        sb.append("\n");
        sb.append("directed : ");
        sb.append(directed);
        sb.append(", visited : ");
        sb.append(visited);

        return sb.toString();
    }
}
