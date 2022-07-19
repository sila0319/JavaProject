package DataStructure;

public class Vertex<E> {
    /*
     * ���� ���� ��
     */
    protected E label;


    /*
     * ���� �湮 ����
     */
    protected boolean visited;

    public Vertex(E label) {
        this.label = label;
        this.visited = false;
    }

    /*
     * �� ��ȯ
     * @return
     */
    public E label() {
        return label;
    }

    /*
     * �ش� ������ �湮
     * ���� �湮 ���θ� ��ȯ�ϸ�, �湮 ������ ���� true ����
     * @return
     */
    public boolean visit() {
        boolean was = visited;
        visited = true;
        return was;
    }

    /*
     * ���� �湮 ���� ��ȯ
     * @return
     */
    public boolean isVisited() {
        return visited;
    }

    /*
     * �湮 ���θ� ����
     */
    public void reset() {
        visited = false;
    }

    /**
     * �� �������� ��
     */
    @Override
    public boolean equals(Object obj) {
        Vertex<?> v = (Vertex<?>) obj;
        return label.equals(v.label());
    }

    @Override
    public String toString() {
        return "<Vertex: "+label+">";
    }
}
