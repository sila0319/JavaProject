package Silver3;


	import java.util.Scanner;
	import java.util.Arrays;

	public class �����_2108 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//n����ŭ ���� �޾Ƽ�  ��踦 ����.
			int [] arr =new int [n];//���� ���� �迭
			int [] marr = new int [8001];//�ֺ��� max�� ã������ �迭
			int max =0; //�ֺ� max�� ���� 
			int wid =0; //�ֺ� max���� ��ġ ã�� 
			double hap =0;//�������� ���� ����
			int middle =0;//�߾Ӱ��� ���� ����
			int len = 0;//�������� ���� ���� 
	
			//�Է¹��� ���� ��� ���Դ��� üũ �� �迭�� �� �ֱ�. n�� ����հ豸�ϱ�.
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				hap += arr[i];
				marr[arr[i]+4000]++;
			}
			
			Arrays.sort(arr);
			
			//�ֺ� ã��.
			for (int i = 0; i < marr.length; i++) {
				if(marr[i]>max) {
					max=marr[i];
					wid =i;
				}
			}
			//������ �ֺ��� ������� �ι�°�� �������� �ֺ����� �����ϱ�.
			for (int i = 0; i < marr.length; i++) {
				if(max==marr[i] && i!= wid ) {
					wid =i;
					break;
				}
			}
		middle = arr[arr.length/2];	//�߾Ӱ� ���
		len = Math.abs(arr[0]-arr[arr.length-1]);//������ ���
		
		//��ºκ�
		System.out.println(Math.round(hap/n));	//�����հ�
		System.out.println(middle);	//�߾Ӱ�
		System.out.println(wid-4000);	//�ֺ�	
		System.out.println(len);//������
	}
}


