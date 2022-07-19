package Gold5;



import java.util.Scanner;
import java.util.Arrays;

public class 두_용액_2470 {
	static int [] arr; 
	static int n;
	static int min = 2100000000;
	static int leftsum;
	static int rightsum;
	static void check () { //두포인터로 왼쪽과 오른쪽값을 더한다. 
		 int left = 0;
		 int right = arr.length-1;
		while(left < right) {
			
			//System.out.println(min);
			if((arr[left]+arr[right]) == 0 ) {//왼쪽오른쪽값이 0일 경우 바로 멈춘다. 
				leftsum= left;
				rightsum = right;
				return;
			}
			else if(0 > (arr[left]+arr[right])) {//왼쪽+오른쪽값이 0보다 작은 경우
				if (min > Math.abs((int)(arr[left]+arr[right]))) {
					//왼쪽 오른쪽값의 절대값이 min보다 작은 경우 min의 값을 재 설정한다. 
					min = Math.abs((int)(arr[left]+arr[right]));
					
					//오른쪽 왼쪽에서 해당하는 용액의 위치를 물으므로 저장한다. 
					leftsum= left;
					rightsum = right;
				}
				 left++;
				 //왼쪽이 음수 오른쪽이 양수이므로 왼쪽+오른쪽의 값이 0보다 작으므로 왼쪽의 값을 증가시킨다. 
				 //왼쪽의 값을 증가시키면 0과 가까워지거나 혹은 0을 초과하게 된다. 
				 //문제에서는 0과 가까운 용액의 위치를 찾으므로 0을 초과하게 된다면 더이상 왼쪽은 증가하지 않게된다. 
			}else if(0 < (arr[left]+arr[right])) {//왼쪽 오른쪽 합이 0보다 클 경우 
				if (min > Math.abs((int)(arr[left]+arr[right]))) {//왼쪽+오른쪽의 절대값이 min보다 작을 경우 min의 값을 재설정한다. 
					min = Math.abs((int)(arr[left]+arr[right]));
					//System.out.println(min+"양수일때");
					leftsum= left;
					rightsum = right;
				}
				right--;//왼쪽 오른쪽 더한값이 0보다 크다는 것은 음수보다 양수가 더 크다는 의미이므로 양수를 줄여준다. 
			}
				
			
		}
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		check();
		System.out.println(arr[leftsum]+" "+arr[rightsum]);
	}
 
}