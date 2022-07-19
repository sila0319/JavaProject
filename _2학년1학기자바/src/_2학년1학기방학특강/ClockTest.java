package _2�г�1�б����Ư��;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


class Clock extends Thread implements KeyListener{
	
	static int h; //�ð�
	static int m; //��
	static int s; //��
	
	static void load() throws IOException{
		FileReader inputStream = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\Time.txt"));
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
		} finally {
			if(br != null) br.close();
		}
	}
	
	static void save() throws IOException{
		BufferedReader in = null;
		PrintWriter out = null;
		
		out = new PrintWriter(new FileWriter("D:\\Time.txt"));
		out.print(h+" ");
		out.print(m+" ");
		out.print(s+" ");
		out.flush();

		if(out != null) out.close();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class ClockTest extends Clock{
	public static void main(String[] args) throws IOException {
		
	
		load();//������ �ҷ��´�.
		while(true) {
			
		}
		
	//	run();
		
		
		
	}

}
