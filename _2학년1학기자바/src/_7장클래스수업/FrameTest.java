package _7��Ŭ��������;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300, 200);//ȭ���� ũ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");//â �̸� ����(Ex: LOL)
		setVisible(true);//����� â�� �����ִ� ��ɾ�
		
	}
}

public class FrameTest {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();//�����ڸ� �θ���.
		MyFrame f2 = new MyFrame();
		MyFrame f3 = f1 = new MyFrame();//???? �����̰�
		
		
	}

}
