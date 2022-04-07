package _첫번째과제;

public class _31번문제 {
	public static void main(String[] args) {
		int count =0;
		int star =0;
		while (true) {
			if(count==10) {
				break;
			}else if(star<count+1) {
				System.out.printf("*");
				star++;
			}else if(star==count+1) {
				System.out.println();
				star=0;
				count++;
			}
		}
	}
}