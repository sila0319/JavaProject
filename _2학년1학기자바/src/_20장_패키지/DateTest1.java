package _20��_��Ű��;

import java.util.*;

public class DateTest1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(1900+d.getYear());
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
	}

}
