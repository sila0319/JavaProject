package _방학특강_자료구조;

import java.util.Scanner;
import java.util.Arrays;

public class Binary_Search_01 {
	static int BSearch(int ar[], int target)
	{
		int cnt =0;
		int len = ar.length;
		int first = 0; // 탐색 대상의 시작 인덱스 값
		int last = len-1; // 탐색 대상의 마지막 인덱스 값
		int mid;
		while(first <= last)
		{
			cnt++;
			mid = (first+last) / 2; // 탐색 대상의 중앙을 찾는다.
			if(target == ar[mid]) // 중앙에 저장된 것이 타겟이라면
			{
				System.out.println(cnt+"탐색 횟수");
				return mid; // 탐색 완료!
			}
			else // 타겟이 아니라면 탐색 대상을 반으로 줄인다.
			{
				if(target < ar[mid])
					last = mid-1; // 왜 -1을 하였을까?
				else
					first = mid+1; // 왜 +1을 하였을까?
			}
		}
			System.out.println(cnt+"탐색 횟수");
			return -1; // 찾지 못했을 때 반환되는 값 -1
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = (int) (Math.random()*1000000)+1;
		System.out.println("찾을려는 데이터 값 입력 ="+ n);
		int []  arr = new int [1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		Arrays.sort(arr);
		System.out.println(BSearch(arr,n )+"번째에 존재합니다.");
		
	}
	
}
