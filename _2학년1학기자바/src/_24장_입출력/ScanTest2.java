package _24장_입출력;

import java.io.*;
import java.util.*;

public class ScanTest2 {
	public static void main(String[] args) throws IOException {
		Scanner s = null;
		double sum =0;
		PrintWriter out =null;
		
		out = new PrintWriter(new FileWriter("D:\\output.txt"));
		out.println("9.5");
		out.println("567,000");
		out.flush();
		s = new Scanner(new BufferedReader(new FileReader("D:\\output.txt")));
		while(s.hasNext()) {
			if(s.hasNextDouble()) {
				sum += s.nextDouble();
			}else {
				s.next();
			}
		}
		if(out != null)
			out.close();
		if(s!= null)
			s.close();
		System.out.println(sum);
	}

}
