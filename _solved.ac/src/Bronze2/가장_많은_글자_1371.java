//����
//������� � ���ڰ� �ٸ� ���ں��� ���� ���δ�. ���� ���, �� �ۿ��� �� 12.31% ���ڴ� e�̴�.
//
//� ���� �־����� ��, ���� ���� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٺ��� ���� ������ �־�����. ���� �ִ� 50���� �ٷ� �̷���� �ְ�, 
//�� ���� �ִ� 50���� ���ڷ� �̷���� �ִ�. �� �ٿ��� ����� ���ĺ� �ҹ��ڸ� �ִ�. 
//���忡 ���ĺ��� ��� �ϳ� �̻� �ִ�.
//
//���
//ù° �ٿ� ���� ���� ���� ���ڸ� ����Ѵ�. 
//���� ���� ��쿡�� ���ĺ� ������ �ռ��� �ͺ��� ��� ������� ����Ѵ�.
//

//���� �Է� 1 
//english is a west germanic
//language originating in england
//and is the first language for
//most people in the united
//kingdom the united states
//canada australia new zealand
//ireland and the anglophone
//caribbean it is used
//extensively as a second
//language and as an official
//language throughout the world
//especially in common wealth
//countries and in many
//international organizations
//���� ��� 1 
//a

//���� �Է� 2 
//baekjoon online judge
//���� ��� 2 
//eno

//���� �Է� 3 
//abc a
//���� ��� 3 
//a

//���� �Է� 4 
//abc
//ab
//���� ��� 4 
//ab

//���� �Է� 5 
//amanda forsaken bloomer meditated gauging knolls
//betas neurons integrative expender commonalities
//latins antidotes crutched bandwidths begetting
//prompting dog association athenians christian ires
//pompousness percolating figured bagatelles bursted
//ninth boyfriends longingly muddlers prudence puns
//groove deliberators charter collectively yorks
//daringly antithesis inaptness aerosol carolinas
//payoffs chumps chirps gentler inexpressive morales
//���� ��� 5 
//e


package Bronze2;

import java.util.Scanner;

public class ����_����_����_1371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[26];
		int max = -1;
		
		
		while (sc.hasNextLine()) {//���࿡ ��ĭ�� �ɰ�� false�� �Ǿ� �����.
			String n= sc.nextLine();//������ �Է¹޴´�.
			
			for (int i = 0; i < n.length(); i++) {
				//�Է¹��� ���ڸ� �߶� ���� �������� �Ǻ���
				//arr�� ���ڸ� ������Ų��. 
				//a�� arr�� 0������ 1�����ȴ�. 
				char c = n.charAt(i);
				if(n.charAt(i) >= 'a' && n.charAt(i) <= 'z') {
				arr[n.charAt(i) -'a']++ ;
	
				}
			}
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			//� ���ڰ� ���� ���� ���Դ��� üũ�Ѵ�. 
			if(arr[i]> max) {
				max = arr[i];
				}
		}
		for (int i = 0; i < arr.length; i++) {
			//max���� ���� ���� ������ �װ����� ���帹�� �����̹Ƿ� ���Ѵ�.
			if(max==arr[i]) {System.out.print((char)(i+'a'));}
		}
//		System.out.println();
//		for(int i : arr) {
//			System.out.print(i+" ");
//		}
		
		
	}
}

