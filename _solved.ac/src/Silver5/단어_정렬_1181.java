//���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//���̰� ª�� �ͺ���
//���̰� ������ ���� ������
//�Է�
//ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. 
//�־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
//
//���
//���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
//
//���� �Է� 1 
//13
//but
//i
//wont
//hesitate
//no
//more
//no
//more
//it
//cannot
//wait
//im
//yours	
//
//���� ��� 1 
//i
//im
//it
//no
//but
//more
//wait
//wont
//yours
//cannot
//hesitate

package Silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class �ܾ�_����_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//��� �ܾ �Է¹������� ���Ѵ�.
		String [] arr =new String[n];//n����ŭ �迭�� ũ�⸦ �����Ѵ�.
		for (int i = 0; i < arr.length; i++) {//�迭�� �� �ֱ�
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			//Comparator�� ����Ͽ� �迭�� �ϸ鼭 String�� �񱳸� �Ѵ�.
			//���������� �迭���ϸ鼭 �ܾ��� ���̰� ������� ���� ������ �Ѵ�. 
			public int compare(String s1, String s2) {
				//�ܾ��� ���̰� ���� ��� 
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				//�׿��� ���
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		//���� �ڵ�� 0���� �Է¾��Ѵ�. �׷��Ƿ� arr[0]��° ���� ���� ���Ѵ�.
		for (int i = 1; i < arr.length; i++) {
			//arr[i+1]�� �񱳸��ϸ� �迭������ ���Ƿ� 1���ͽ����� arr[i-1]���� �񱳸��ؼ� 
			//����� �Ѵ�.
			if(!arr[i].equals(arr[i-1])) {
				//arr[i]�� arr[i-1]�� ���� ���� �ʴٸ�
				//arr[i]�� ���� ����� �Ѵ�.
				System.out.println(arr[i]);
			}
		}	
	}	
}