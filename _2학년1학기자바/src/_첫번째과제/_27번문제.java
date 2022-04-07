package _첫번째과제;

public class _27번문제 {
	public static void main(String[] args) {
		int num = 65;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((char)(num+j));
			}
			num++;
			System.out.println();
		}
	}
}
