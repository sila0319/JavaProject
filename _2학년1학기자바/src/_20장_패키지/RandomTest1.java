package _20장_패키지;
import java.util.Random;

public class RandomTest1 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(10));//0~100사이의 난수를 발생한다.
			
		}
	}

}
