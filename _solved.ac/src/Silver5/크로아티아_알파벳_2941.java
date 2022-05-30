package Silver5;

import java.util.Scanner;

public class 크로아티아_알파벳_2941 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	StringBuffer sb = new StringBuffer(s);
	int cnt =0;
	int index =0;
	int a =0;
	
	while(sb.length()!=0){
		//System.out.println(sb);
		if(a==s.length()) {
			break;
		}
		a++;
	//	System.out.println(sb);
		if(sb.indexOf("c=")!=-1) {
			index = sb.indexOf("c=");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("c-")!=-1) {
			index = sb.indexOf("c-");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("dz=")!=-1) {
			index = sb.indexOf("dz=");
			sb.replace(index, index+3, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("d-")!=-1) {
			index = sb.indexOf("d-");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("lj")!=-1) {
			index = sb.indexOf("lj");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("nj")!=-1) {
			index = sb.indexOf("nj");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("s=")!=-1) {
			index = sb.indexOf("s=");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		if(sb.indexOf("z=")!=-1) {
			index = sb.indexOf("z=");
			sb.replace(index, index+2, "0");
			cnt++;
			continue;
		}
		
	}
	
	for (int i = 0; i < sb.length(); i++) {
		char c = sb.charAt(i);
		if(c!='0') {
			cnt++;
		}
	}
	System.out.println(cnt);
	}

}
