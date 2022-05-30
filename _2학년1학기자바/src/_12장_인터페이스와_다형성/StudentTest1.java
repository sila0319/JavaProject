package _12��_�������̽���_������;

import java.util.*;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student1[] students = new Student1[3];
		students[0] = new Student1("ȫ�浿", 3.39);
		students[1] = new Student1("�Ӳ���", 4.21);
		students[2] = new Student1("Ȳ����", 2.19);
		
		Arrays.sort(students);
		for ( Student1 s : students) {
			System.out.println("�̸� : " + s.getName() +" ���� =" + s.getGPA());
			
		}
		
	}

}

class Student1 implements Comparable {
	private String name;
	private double gpa;
	
	public Student1(String n, double g) {
		name = n;
		gpa = g;
	}
	public String getName() {return name;}
	public double getGPA() {return gpa;}
	
	public int compareTo(Object obj) {
		Student1 other = (Student1) obj;
		if(gpa < other.gpa) {
			return -1;
		}else if(gpa > other.gpa) {
			return 1;
		}else {
			return 0;
		}
	}
}