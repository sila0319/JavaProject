package JFrmae;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	//JFrame��� Ŭ������ ������ ContentPaneEx�� ��ӹ޴´�.
	ContentPaneEx(){//ContentPaneEx�� �����ڸ� �����Ѵ�.
		setTitle("JFrame �������ϱ�");//â�̸� �Է�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����ϸ鼭 �޸𸮿����� ������.
		//���ᰡ ȭ�鿡���� �������°�, �޸𸮿�ȭ��Ѵپ������� �� ����� �ִ�.
		Container contentPane = getContentPane();
		//Jframe�� �޼ҵ��̴�. getContentPane �տ� JFrame�̶�� ���� ������.
		//contentPane�� â ȭ���̴�.
		//Container���� ���������� Ŭ�����̴�. 
		contentPane.setBackground(Color.GREEN);//ȭ���� ��׶��� �� �׸�
		contentPane.setLayout(new FlowLayout());
		//������Ʈ�� ���� ������� �迭�ϴ� ����̴�.(FlowLayout���)
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JLabel("����"));
		
		setSize(300, 200);
		//ȭ��â ũ�� ����
		setVisible(true);
		//true�� �Ǿ�� ������ ���̰� �ȴ�.
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
