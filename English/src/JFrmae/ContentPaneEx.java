package JFrmae;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	//JFrame라는 클래스의 성질을 ContentPaneEx가 상속받는다.
	ContentPaneEx(){//ContentPaneEx의 생성자를 생성한다.
		setTitle("JFrame 디자인하기");//창이름 입력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료하면서 메모리에서도 지워라.
		//종료가 화면에서만 없어지는것, 메모리와화면둘다없어지는 것 등등이 있다.
		Container contentPane = getContentPane();
		//Jframe의 메소드이다. getContentPane 앞에 JFrame이라는 글이 생략됨.
		//contentPane은 창 화면이다.
		//Container또한 마찬가지로 클래스이다. 
		contentPane.setBackground(Color.GREEN);//화면의 백그라운드 색 그린
		contentPane.setLayout(new FlowLayout());
		//컴포런트를 놓는 순서대로 배열하는 방식이다.(FlowLayout방식)
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JLabel("선택"));
		
		setSize(300, 200);
		//화면창 크기 설정
		setVisible(true);
		//true가 되어야 실제로 보이게 된다.
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
