package KeyListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyTyped_Test extends JFrame {
	JPanel cP = new JPanel();
	JLabel la = new JLabel("getKEyChar()");
	JLabel la2 = new JLabel("getKeyCode()");
	KeyTyped_Test(){
		super("KeyTypedEvent�� getKeyCode()�� �������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cP);
		cP.setLayout(null);
		cP.addKeyListener(new KeyTypedEvent());
		la.setLocation(50, 10);
		la.setSize(300,100);
		la.setFont(new Font("�ü�ü", Font.BOLD, 30));
		la2.setLocation(50,60); 
		la2.setSize(300, 100);
		la2.setFont(new Font("�ü�ü", Font.BOLD,30));
		cP.add(la);
		cP.add(la2);
		setSize(500,400); 
		setVisible(true);
		cP.requestFocus();
	}
	class KeyTypedEvent extends KeyAdapter{
		public void keyTyped(KeyEvent e) {
			char KeyChar = e.getKeyChar();
				la.setText("KeyChar�� : " + KeyChar);
				int KeyCode = e.getKeyChar();
				la2.setText("KeyChar�� : " + KeyCode);
				if(KeyChar =='Q') System.exit(0);
		}
	}
	public static void main(String[] args) {
		new KeyTyped_Test();
	}
}
