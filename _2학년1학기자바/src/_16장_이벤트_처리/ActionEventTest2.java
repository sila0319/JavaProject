package _16장_이벤트_처리;

import javax.swing.*;
import java.awt.event.*;

class MyFrame2 extends JFrame{
	private JButton button;
	private JLabel label;
	boolean OnOff = true;
	
	public MyFrame2() {
		this.setSize(300,200); //윈도우 창 크기설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제"); //윈도우 이름 
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListner2()); //버튼을 클릭했을시 이벤트 호출 
		panel.add(button); //버튼을 추가한다.
		panel.add(label);
		this.add(panel);
		this.setVisible(true); //윈도우창을 보여준다.
	}
	private class MyListner2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			 
			if(OnOff == true) {
				label.setText("버튼이 켜졌습니다.");
				OnOff =false;
			}else if(OnOff == false) {
				label.setText("버튼이 꺼졌습니다.");
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