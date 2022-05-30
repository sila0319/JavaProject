package Silver5;

//이 문제는 수 정렬하기2를 푼 후에 푼문제이다.
//기본적인 로직은 똑같으나 메모리 초과가 떳다.
//그러므로 list대신 배열을 선언하여서 배열안에다가 넣고 반복했더니 정답이었다.
//배열과 리스트의 차이뿐이다. 끝
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.Arrays;


	public class 수_정렬하기_3_10989 {
		public static void main(String[] args) throws IOException {
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			for (int i : arr) {
				bw.write(String.valueOf(i)+"\n");
			}
			bw.close();
			br.close();
		}
	}


