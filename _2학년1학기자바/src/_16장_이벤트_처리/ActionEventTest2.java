package _16��_�̺�Ʈ_ó��;

import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame{
	private JButton button;
	private JLabel label;
	boolean OnOff = true;
	
	public MyFrame2() {
		this.setSize(300,200); //������ â ũ�⼳�� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����"); //������ �̸� 
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListner2()); //��ư�� Ŭ�������� �̺�Ʈ ȣ�� 
		panel.add(button); //��ư�� �߰��Ѵ�.
		panel.add(label);
		this.add(panel);
		this.setVisible(true); //������â�� �����ش�.
	}
	private class MyListner2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			 
			if(OnOff == true) {
				label.setText("��ư�� �������ϴ�.");
				OnOff =false;
			}else if(OnOff == false) {
				label.setText("��ư�� �������ϴ�.");
				OnOff = true;
			}
		}
		
	} 
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame2 t = new MyFrame2();
	}
}