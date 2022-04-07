package _7��Ŭ��������;

import java.util.*;

class DiceGame{
	
	int diceFace; //��ǻ�Ͱ� ���� �ֻ��� ����
	int userGuess; //������ �����ϴ� �ֻ����� ����
	int life =10; //������� ���
	int grade =0;	//������� ����
	
	public void startPlaying() {
		
		while (life!=0 && grade < 10) {
			userGuess = getUserInput("������ �Է��Ͻÿ�: ");
			//����ڿ��� getUserInput �ʵ带 ȣ���Ͽ� ������� �������ݰ��� üũ�Ѵ�.
			RollDice();//�ֻ��� ������ �ʵ� ȣ��
			checkUserGuess();//���� ���� �ʵ�ȣ�� 
		}
	}
	
	private int getUserInput(String prompt) {
		
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	private void RollDice() {//��ǻ�Ͱ� �ֻ����� ������.
		diceFace = (int)(Math.random()*6)+1; 
		//������ ������ϴ� �ֻ������� �����ش�.
	}
	
	private void checkUserGuess() {
		if(diceFace == userGuess) {
			System.out.println("�¾ҽ��ϴ�.");
			grade += diceFace;
			System.out.println(grade +"��������");
			if(grade > 10) {
				System.out.println("�����մϴ� �¸��Ͽ����ϴ�.");
			}
		}
			
		else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println(diceFace);
			life--;
			System.out.println("���� ����� "+life);
			if(life ==0) {
				System.out.println("���� ����");
			}
		}
	}
}

public class DiceGameTest {
	public static void main(String[] args) {
		
		DiceGame game = new DiceGame();
		game.startPlaying();
		
	}
}
