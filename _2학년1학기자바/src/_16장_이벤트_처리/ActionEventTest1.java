package _16장_이벤트_처리;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

class MyLinstner1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {//ActionEvent에 들어온 e의 타입에 따라 작동한다.
		JButton button= (JButton) e.getSource();
		button.setText("마침내 버튼이 눌려졌습니다.");//이벤트가 실행되었을때 보여줄 text내용
	}
}

class MyFrame1 extends JFrame{
	private JButton button;
	public MyFrame1() {
		this.setSize(300,200); //윈도우 창 크기설정 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제"); //윈도우 이름 
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
		button.addActionListener(new MyLinstner1()); //버튼을 클릭했을시 이벤트 호출 
		this.add(button); //버튼을 추가한다.
		this.setVisible(true); //윈도우창을 보여준다.
	}
}


public class ActionEventTest1 {
	public static void main(String[] args) {
		MyFrame1 t = new MyFrame1();
	}

}
