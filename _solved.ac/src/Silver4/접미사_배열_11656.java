//���̻� �迭�� ���ڿ� S�� ��� ���̻縦 ���������� ������ ���� �迭�̴�.
//
//baekjoon�� ���̻�� 
//baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n ���� �� 8������ �ְ�, �̸� ���������� �����ϸ�, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon�� �ȴ�.
//
//���ڿ� S�� �־����� ��, ��� ���̻縦 ���������� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ���ڿ� S�� �־�����. S�� ���ĺ� �ҹ��ڷθ� �̷���� �ְ�, 
//���̴� 1,000���� �۰ų� ����.
//
//���
//ù° �ٺ��� S�� ���̻縦 ���������� �� �ٿ� �ϳ��� ����Ѵ�.
//
//���� �Է� 1 
//baekjoon
//���� ��� 1 
//aekjoon
//baekjoon
//ekjoon
//joon
//kjoon
//n
//on
//oon



package Silver4;

import java.util.Scanner;
import java.util.Arrays;

public class ���̻�_�迭_11656 {
	public static void main(String[] args)   {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String [] arr = new String[s.length()];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = s.substring(i, s.length());//�迭�� ���̻縦 ��´�.
		//substring(a,b)�� a���� b������ ���ڿ��� ���Ѵ�.
	}
	Arrays.sort(arr);//�����Ѵ�
	for (String i : arr) {//��������� 
		System.out.println(i);
	}
	
	
	}
}

