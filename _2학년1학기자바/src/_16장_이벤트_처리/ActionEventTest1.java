package _16��_�̺�Ʈ_ó��;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class MyLinstner1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {//ActionEvent�� ���� e�� Ÿ�Կ� ���� �۵��Ѵ�.
		JButton button= (JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");//�̺�Ʈ�� ����Ǿ����� ������ text����
	}
}

class MyFrame1 extends JFrame{
	private JButton button;
	public MyFrame1() {
		this.setSize(300,200); //������ â ũ�⼳�� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����"); //������ �̸� 
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new MyLinstner1()); //��ư�� Ŭ�������� �̺�Ʈ ȣ�� 
		this.add(button); //��ư�� �߰��Ѵ�.
		this.setVisible(true); //������â�� �����ش�.
	}
}


public class ActionEventTest1 {
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}

}
