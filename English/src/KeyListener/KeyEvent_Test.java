package KeyListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEvent_Test extends JFrame {
	JPanel cP = new JPanel();
	JLabel la = new JLabel("�ö�!");
	JLabel la2 = new JLabel("��!");
	KeyEvent_Test(){
		super("KeyEvent_Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(cP); 
		cP.setLayout(null);
		cP.addKeyListener(new KeyE_test());
		la.setLocation(50, 50);
		la.setSize(300, 100);
		la.setFont(new Font ("�ü�ü",Font.BOLD,30));
		
		la2.setLocation(50, 100);
		la2.setSize(300,100);
		la2.setFont(new Font("�ü�ü",Font.BOLD,30));
		
		cP.add(la); 
		cP.add(la2);
		setSize(500,400); 
		setVisible(true); 		
		cP.requestFocus();	
	}
	class KeyE_test extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			char KeyChar = e.getKeyChar();
			la.setText("KeyChar�� : " + KeyChar);
			int keyCode = e.getKeyCode();
			la.setText("KeyCode�� : " + Integer.toString(keyCode));
			switch(keyCode) {//��, ��, ��, �� Ű�� la�� ��ġ �̵�
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - 10); break;
				
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + 10); break;
				
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()- 10 , la.getY() ); break;
				
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + 10 , la.getY()); break;
			}
		}
	}
	public static void main(String[] args) {
		new KeyEvent_Test();
	}
}

