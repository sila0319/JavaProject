package _24��_�����;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile2 {
public static void main(String[] args) throws IOException {
	BufferedReader in = null;
	PrintWriter out = null;
	
	out = new PrintWriter(new FileWriter("D:\\output.txt"));
	out.println("��ȭ�� ���Ѵٸ�,");
	out.println("���� ���� �ڽ��� ��ȭ�� �� �ִٴ� �Ͱ�");
	out.println("��ȭ�ϱ���� �������� �ʰ�");
	out.println("����ؼ� ����� �� �ִٴ� ���� �Ͼ�� �Ѵ�.");
	out.flush();
	in = new BufferedReader(new FileReader("D:\\output.txt"));
	String line;
	while((line = in.readLine()) != null) {
		System.out.println(line);
	}
	if(in != null) in.close();
	if(out != null) out.close();
}
}
