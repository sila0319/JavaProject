package _7장클래스수업;

import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300, 200);//화면의 크기조절
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");//창 이름 설정(Ex: LOL)
		setVisible(true);//실행시 창을 보여주는 명령어
		
	}
}

public class FrameTest {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();//생성자를 부른다.
		MyFrame f2 = new MyFrame();
		MyFrame f3 = f1 = new MyFrame();//???? 뭐지이거
		
		
	}

}
