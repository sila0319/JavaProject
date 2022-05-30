package _21장_예외_처리;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileError {
	private int [] list;
	private static final int SIZE = 10;
	
	public FileError() throws IOException {
			list = new int[SIZE];
			for (int i = 0; i < SIZE; i++) {
				list[i] = i;
			}
			writeList();
	}
			public void writeList() throws IOException {
				PrintWriter out = null;
				try {
					out = new PrintWriter(new FileWriter("outfile.txt"));
					for (int i = 0; i < list.length; i++) {
						out.println("배열 원소" + i + "=" + list[i]);
					}
				}catch(ArrayIndexOutOfBoundsException e) {
					System.err.println("ArrayIndexOutOfBoundsExcetion : ");
				}catch(IOException e) {
					System.out.println("IOException");
				}finally {
					if(out!= null) {
						out.close();
					}
				}
				
			}
			public static void main(String[] args) throws IOException {
				new FileError();
			}
		
}
