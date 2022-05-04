package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		
	setTitle("BorderLayout ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container cP = getContentPane();
	
	cP.setBackground(Color.red);
	BorderLayout bd = new BorderLayout(10,20);//������Ʈ�� ������Ʈ ������ ����
	//BorderLayout bd = new BorderLayout; //������ ���̴� �����̾��ٴ� ���̴�.
	cP.setLayout(bd);
	
	JButton jb1 = new JButton("�߾�");//�̸��� �ִ� ��ư���� ����
	JButton jb2 = new JButton("��");//�̸��� �ִ� ��ư���� ����
	
	cP.add(jb1, bd.CENTER);//jb1�� bd.center�� ����ؼ� �߾ӿ� ��ġ�Ѵ�
	cP.add(jb2, bd.NORTH);//jb2�� bd.north�� ����ؼ� ���� ��ġ�Ѵ�.
	cP.add(new JButton("��"), bd.SOUTH); // bd.south�� ����ؼ� �Ʒ��� ��ġ�Ѵ�
	cP.add(new JButton("��"), bd.WEST);// bd.west�� ����ؼ� ���ʿ� ��ġ����.
	cP.add(new JButton("��"), bd.EAST);//bd.east �� ����ؼ� �����ʿ� ��ġ�Ѵ�. 
	
	//cP.add(new Label("������Ʈ ���� ����: " + bd.getHgap()), bd.NORTH);
	//cP.add(new Label("������Ʈ ���� ����: " + bd.getVgap()), bd.SOUTH);
	//���� �ΰ��� �����Ű�� ������Ʈ ���򰣰ݰ� ���������� ȭ�鿡 �߰Եȴ�. ���� �Ʒ��� 
	setSize(300, 200);//ȭ���� ũ�� ����
	setVisible(true);//��׶������� ���׶������� ����
	
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
