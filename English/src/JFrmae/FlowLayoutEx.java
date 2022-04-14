package JFrmae;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FlowLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		Container cP = getContentPane();
		cP.setBackground(Color.green);//배경화면 색깔 초록색
		cP.setFont(new Font("Arial", Font.ITALIC, 40));//폰트 설정
		//cP는 컴포넌트를 놓은 곳이기 때문에 Component의 Font사이즈는 영향을 받지 않는다.
		//cP.applyComponentOrentation(ComponentOrientation.RIGHT_TO_LEFT); // 컴포넌트가 놓여지는 방향
		cP.applyComponentOrientation((ComponentOrientation.LEFT_TO_RIGHT));
		//정렬방법으로서 컴포넌트의 출력시작을 좌측에서 부터 하도록 지정한다.
		
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JLabel(cP.toString()));
		cP.setLayout(new FlowLayout(0, 30, 40));
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JButton("0 : 좌측 정렬"));
		cP.add(new JButton("1 : 중앙 정렬"));
		cP.add(new JButton("2 : 우측 정렬"));
		cP.add(new JButton("3 : 시작지점 (좌)부터 정렬"));
		cP.add(new JButton("4 : 끝지점(우)부터 정렬"));
		cP.add(new JLabel("FlowLayout 실습"));
		cP.add(new JLabel(cP.getLayout().getClass().toString()));
		cP.add(new JLabel(cP.getLayout().toString()));
		setSize(1150, 400);// 프레임 크기 1150 x 400설정
		setVisible(true); //화면 프레임 출력
		//System.exit(0);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}