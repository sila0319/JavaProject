package DataStructure;

	public interface List<E> {
	    /*
	     * ��� �߰�
	     * 
	     * @param value �߰� ���
	     * @return �߰� ���� ����
	     */
	    boolean add(E value);

	    /*
	     * Ư�� ��ġ�� ��� �߰�
	     * 
	     * @param index ��ġ ����
	     * @param value �߰� ���
	     */
	    void add(int index, E value);

	    /*
	     * Ư�� ��� ����
	     * ���� ��� ���� ���� �� ���� ó�� �߰ߵ� ��� ����
	     * 
	     * @param Value ������ ���
	     * @return ���� ���� ����
	     */
	    boolean remove(Object value);

	    /*
	     * Ư�� ��ġ ��� ����
	     * 
	     * @param index ��ġ ����
	     * @return ������ ���
	     */
	    E remove(int index);

	    /*
	     * Ư�� ��ġ ��� ��ȯ
	     * 
	     * @param index ��ġ ����
	     * @return ��� ��ȯ
	     */
	    E get(int index);

	    /*
	     * Ư�� ��Ұ� �� ��°���� ��ȯ
	     * 
	     * @param ã�� ���
	     * @return ��ġ ��ȯ, ��ġ�ϴ� ��� ���� ��� -1 ��ȯ
	     */
	    int indexOf(Object value);

	    /*
	     * Ư�� ��Ұ� �ִ��� ����
	     * 
	     * @param value ã�� ���
	     * @return ��� ���� ����
	     */
	    boolean contains(Object value);

	    /*
	     * Ư�� ��ġ�� ��Ҹ� �� ��ҷ� ��ü
	     * 
	     * @param index ��ġ ����
	     * @param value ��ü�� ���
	     */
	    void set(int index, E value);

	    /*
	     * ��� ���� ��ȯ
	     * 
	     * @return ��� ����
	     */
	    int size();

	    /*
	     * ��Ұ� ������� ���� ��ȯ
	     * 
	     * @return ������� ����
	     */
	    boolean isEmpty();

	    /**
	     * ����Ʈ ��� ��� ����
	     * 
	     */
	    void clear();
	}


