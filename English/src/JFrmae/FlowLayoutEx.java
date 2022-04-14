package JFrmae;

import javax.swing.*;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		Container cP = getContentPane();
		cP.setBackground(Color.green);//���ȭ�� ���� �ʷϻ�
		cP.setFont(new Font("Arial", Font.ITALIC, 40));//��Ʈ ����
		//cP�� ������Ʈ�� ���� ���̱� ������ Component�� Font������� ������ ���� �ʴ´�.
		//cP.applyComponentOrentation(ComponentOrientation.RIGHT_TO_LEFT); // ������Ʈ�� �������� ����
		cP.applyComponentOrientation((ComponentOrientation.LEFT_TO_RIGHT));
		//���Ĺ�����μ� ������Ʈ�� ��½����� �������� ���� �ϵ��� �����Ѵ�.
		
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JLabel(cP.toString()));
		cP.setLayout(new FlowLayout(0, 30, 40));
		cP.add(new JLabel(cP.getFont().toString()));
		cP.add(new JButton("0 : ���� ����"));
		cP.add(new JButton("1 : �߾� ����"));
		cP.add(new JButton("2 : ���� ����"));
		cP.add(new JButton("3 : �������� (��)���� ����"));
		cP.add(new JButton("4 : ������(��)���� ����"));
		cP.add(new JLabel("FlowLayout �ǽ�"));
		cP.add(new JLabel(cP.getLayout().getClass().toString()));
		cP.add(new JLabel(cP.getLayout().toString()));
		setSize(1150, 400);// ������ ũ�� 1150 x 400����
		setVisible(true); //ȭ�� ������ ���
		//System.exit(0);
		
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}