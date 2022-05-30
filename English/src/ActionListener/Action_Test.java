package ActionListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestAListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		//e.getSource() 는 이벤트가 발생한 개체를 반환한다.
		if(b.getText().equals("Hello!")){
			b.setBackground(Color.RED);
			b.setText("Holla!");
			//lbl1.
		}else {
			b.setText("Hello!");
			b.setBackground(Color.YELLOW);
		}
	}
}


public class Action_Test extends JFrame{
	Action_Test(){
		setTitle("ActionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cP = getContentPane();
		cP.setLayout(new FlowLayout());
		cP.setBackground(Color.CYAN);
		JButton btn1 = new JButton("Hello!");
		JLabel lbl1 = new JLabel("\t안녕! 이라는 뜻");
		btn1.setFont(new Font("궁서체" , Font.BOLD, 30));
		
		btn1.addActionListener(new TestAListener());
		lbl1.setFont(new Font("궁서체",Font.BOLD,20));
		cP.add(btn1);
		cP.add(lbl1);
		setSize(500,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Action_Test();
	}

}
