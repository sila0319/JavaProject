package Silver5;

//�� ������ �� �����ϱ�2�� Ǭ �Ŀ� Ǭ�����̴�.
//�⺻���� ������ �Ȱ����� �޸� �ʰ��� ����.
//�׷��Ƿ� list��� �迭�� �����Ͽ��� �迭�ȿ��ٰ� �ְ� �ݺ��ߴ��� �����̾���.
//�迭�� ����Ʈ�� ���̻��̴�. ��
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.Arrays;


	public class ��_�����ϱ�_3_10989 {
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


