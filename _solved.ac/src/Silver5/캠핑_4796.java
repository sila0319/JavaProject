package Silver5;


	import java.util.Scanner;

	public class ķ��_4796 {
		public static void main(String[] args)   {
		
		Scanner sc = new Scanner(System.in);
		int testcase =1; //�׽�Ʈ���̽��� ����ϱ� ���� �������� 1���ͽ���
		while(true) {
		int l = sc.nextInt();//p�� ��ķ������ ����� �� �ִ� ��
		int p = sc.nextInt();//ķ������ ��밡���� �� 
		int v = sc.nextInt();// �ް���
		int date =v; //v�� ���� date�������� �����Ѵ�.
		int count =0 ; // ķ���� ��ĥ�����ߴ��� count�Ѵ�.
		
		if(l==p && p==v && v==0) {break;}//0 0 0 �� �Է¹����� �����.
		
		for (int i = 0; i <= v/p; i++) { //���ϼ�/ķ�ΰ��������� ��������ŭ ���ƾ��Ѵ�.
			if(date>l) { //ķ�ΰ����ѳ��� date���� �� ū���
				count += l; //l��ŭ ķ�����Ͽ���.
				date -= p;// �������� ķ�ΰ����� ���� date���� ���ش�.
			}else {//���࿡ v <=l�� ���
				count+= date; //���� date�� ���� count���ٰ� �����ش�. 
			}
		}
		System.out.printf("Case %d: %d\n",testcase,count);//���
		testcase++;//�׽�Ʈ���̽� 1����.
		}
		}
	}


