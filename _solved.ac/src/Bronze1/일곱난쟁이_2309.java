//왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 
//일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
//
//아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 
//뛰어난 수학적 직관력을 가지고 있던 백설공주는, 
//다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
//
//아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
//
//입력
//아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며,
//아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
//
//출력
//일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
//
//예제 입력 1 
//20
//7
//23
//19
//10
//15
//25
//8
//13
//예제 출력 1 
//7
//8
//10
//13
//19
//20
//23

package Bronze1;

import java.util.Scanner;
import java.util.Arrays;

public class 일곱난쟁이_2309 {
	public static void main(String[] args) {
	int []arr = new int [9];		
	int sum = 0; // 모든난쟁이의 키를다 더하는 값
		int n=0; // sum-100을 하여 이 두개의 값을 배열에서 2개를 뽑아 더했을때 true인 값을 찾는다.
		//9명중 2명을 빼면 되므로 뺼 두명의 배열위치를 x,y에다가 저장해서 찾는다.
		int x =0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			arr [i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);//배열정열
		for (int i = 0; i < 9; i++) {
			sum += arr[i];
			
		}
		
		if(sum > 100) {
			n=sum-100;//n의값을 sum-100을하여 x+y의 값이 n이 될경우 난쟁이를 찾은것이다.
				
				for (int i = 0; i < arr.length; i++) {
					//찾아야 하는 난쟁이가 2명이므로 이중포문을 선언한다.
					for (int j = 0; j < arr.length; j++) {
						if(arr[i]+arr[j]==n) {
							//arr[i] + arr[j] ==n이 될 경우 두 난쟁이가 가짜다. 
							x = i;
							y = j;
						}
					}
				}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			//가짜 난쟁이를 찾았으므로 x,y에 해당하는 위치의 배열은 말하지않는다. 
			if(i==x || i==y) {
				continue;
			}else {
			System.out.println(arr[i]);
			}
		}
		}
	}



