package Silver5;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


public class ��_�����ϱ�_2_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//���۸���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//���۶�����
		ArrayList<Integer> list = new ArrayList<>();//�迭��� ����Ʈ�� �����Ͽ� �ִ´�.
		int n = Integer.parseInt(br.readLine());//n����ŭ �ݺ��ؾ��ϹǷ� ���۸����� String���� �ޱ⿡ int������ ����ȯ�Ѵ�.
		
		for (int i = 0; i < n; i++) {//n����ŭ �ݺ� 
			list.add(Integer.parseInt(br.readLine()));//����Ʈ�� �Է¹��� ���� �����Ѵ�.
		}
		Collections.sort(list);//����Ʈ ���� sort 
		for (int i : list) { //sort�� �� ��� 
			bw.write(String.valueOf(i)+"\n");//���ٷ� ������ ��µǹǷ� \n�� �ٿ��ش�.
		}
		bw.close();//bw�� Ŭ�����ؾ� ��µ�
		br.close();//brŬ���� 
	}
}



