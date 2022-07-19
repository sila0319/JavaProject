package _24장_입출력;

import java.io.File;
import java.io.IOException;

public class FileTest {
public static void main(String[] args) throws IOException {
	String name = "c:/eclipse";
	File dir = new File(name);
	String[] fileNames = dir.list();
	for(String s : fileNames) {
		File f = new File(name + "/" + s);
		
		System.out.println("===========================");
		System.out.println("이름 : " + f.getName());
		System.out.println("이름 : " + f.getPath());
		System.out.println("이름 : " + f.getParent());
		System.out.println("이름 : " + f.getAbsolutePath());
		System.out.println("이름 : " + f.getCanonicalPath());
		System.out.println("이름 : " + f.isDirectory());
		System.out.println("이름 : " + f.isFile());
		System.out.println("===========================");
	}
}
}
