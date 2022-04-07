package _7장클래스수업;

import java.util.*;

class DiceGame{
	
	int diceFace; //컴퓨터가 굴린 주사위 눈금
	int userGuess; //유저가 예측하는 주사위의 눈금
	int life =10; //사용자의 목숨
	int grade =0;	//사용자의 점수
	
	public void startPlaying() {
		
		while (life!=0 && grade < 10) {
			userGuess = getUserInput("예상값을 입력하시오: ");
			//사용자에게 getUserInput 필드를 호출하여 사용자의 예측눈금값을 체크한다.
			RollDice();//주사위 굴리는 필드 호출
			checkUserGuess();//유저 추측 필드호출 
		}
	}
	
	private int getUserInput(String prompt) {
		
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	private void RollDice() {//컴퓨터가 주사위를 굴린다.
		diceFace = (int)(Math.random()*6)+1; 
		//유저가 맞춰야하는 주사위값을 정해준다.
	}
	
	private void checkUserGuess() {
		if(diceFace == userGuess) {
			System.out.println("맞았습니다.");
			grade += diceFace;
			System.out.println(grade +"유저점수");
			if(grade > 10) {
				System.out.println("축하합니다 승리하였습니다.");
			}
		}
			
		else {
			System.out.println("틀렸습니다.");
			System.out.println(diceFace);
			life--;
			System.out.println("남은 목숨은 "+life);
			if(life ==0) {
				System.out.println("게임 오버");
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
