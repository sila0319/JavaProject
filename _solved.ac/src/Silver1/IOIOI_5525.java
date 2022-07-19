package Silver1;



import java.util.Scanner;
import java.util.Stack;

 
public class IOIOI_5525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <String> stack = new Stack<>(); 
		int n = sc.nextInt();
		int m = sc.nextInt();
		String [] arr = sc.next().split("");
		int result =0;
		
		for (int j = 0; j < arr.length; j++) {
			
			
				if(arr[j].equals("I")&&stack.size()%2==0) {
					stack.push("I");
					
				}else if(arr[j].equals("O")&&stack.size()%2!=0){
					stack.push("O");
					
				}else {
					stack.clear();
					if(j<arr.length-1) {
						if(arr[j+1].equals("O")&&arr[j].equals("I")) {
							stack.push("I");
							
						}
					}
					
				}
				
				
			if(stack.size()==(n*2)+1) {
			
				stack.pop();
				stack.pop();
			
				
			//	System.out.println(j+" "+arr[j]);
				
				
				
				
				result++;
			}
			
			
		}
		System.out.println(result);
		
	}
 
}

