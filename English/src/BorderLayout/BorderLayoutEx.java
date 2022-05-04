package BorderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		
	setTitle("BorderLayout 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container cP = getContentPane();
	
	cP.setBackground(Color.red);
	BorderLayout bd = new BorderLayout(10,20);//컴포넌트와 컴포넌트 사이의 간격
	//BorderLayout bd = new BorderLayout; //위와의 차이는 간격이없다는 차이다.
	cP.setLayout(bd);
	
	JButton jb1 = new JButton("중앙");//이름이 있는 버튼으로 생성
	JButton jb2 = new JButton("상");//이름이 있는 버튼으로 생성
	
	cP.add(jb1, bd.CENTER);//jb1을 bd.center를 사용해서 중앙에 배치한다
	cP.add(jb2, bd.NORTH);//jb2을 bd.north를 사용해서 위에 배치한다.
	cP.add(new JButton("하"), bd.SOUTH); // bd.south을 사용해서 아래에 배치한다
	cP.add(new JButton("좌"), bd.WEST);// bd.west를 사용해서 왼쪽에 배치힌다.
	cP.add(new JButton("우"), bd.EAST);//bd.east 를 사용해서 오른쪽에 배치한다. 
	
	//cP.add(new Label("컴포넌트 수평 간격: " + bd.getHgap()), bd.NORTH);
	//cP.add(new Label("컴포넌트 수직 간격: " + bd.getVgap()), bd.SOUTH);
	//위에 두개를 실행시키면 컴포넌트 수평간격과 수직간격이 화면에 뜨게된다. 위와 아래에 
	setSize(300, 200);//화면의 크기 설정
	setVisible(true);//백그라운드인지 포그라운드인지 설정
	
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
