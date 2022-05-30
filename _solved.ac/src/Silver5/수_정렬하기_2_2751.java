package Silver5;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


public class 수_정렬하기_2_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//버퍼리더
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//버퍼라이터
		ArrayList<Integer> list = new ArrayList<>();//배열대신 리스트를 선언하여 넣는다.
		int n = Integer.parseInt(br.readLine());//n번만큼 반복해야하므로 버퍼리더는 String으로 받기에 int형으로 형변환한다.
		
		for (int i = 0; i < n; i++) {//n번만큼 반복 
			list.add(Integer.parseInt(br.readLine()));//리스트에 입력받은 값을 저장한다.
		}
		Collections.sort(list);//리스트 전용 sort 
		for (int i : list) { //sort한 값 출력 
			bw.write(String.valueOf(i)+"\n");//한줄로 묶여서 출력되므로 \n을 붙여준다.
		}
		bw.close();//bw를 클로즈해야 출력됨
		br.close();//br클로즈 
	}
}



