package Silver3;


	import java.util.Scanner;

	public class �Ҽ�_���ϱ�_1929_$�����佺�׳׽���_ü {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
	        int num = sc.nextInt();
	        if(num <= 1) return;
	 
	        boolean[] arr = new boolean[num+1];    //true �̸� �ش� �ε��� �Ҽ�.
	        arr[0] = arr[1] = false;
	        for(int i=2; i<=num; i+=1) {
	            arr[i] = true;
	        }
	 
	        //2 ���� ���ڸ� Ű������ ������� ����(false �Ҵ�)
	        for(int i=2; i*i<=num; i+=1) {
	            for(int j=i*i; j<=num; j+=i) {
	                arr[j] = false;        //2�� ������ 2�� ��� false
	            }
	        }
	       
	        for(int i=m; i<=num; i+=1) {
	            if(true == arr[i]) {
	                System.out.println(i);
	            }
	        }
			
		}    
	}


