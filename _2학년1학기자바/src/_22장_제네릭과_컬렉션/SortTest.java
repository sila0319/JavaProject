package _22��_���׸���_�÷���;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Student1 implements Comparable<Student1> {
   int number;
   String name;
   
   public Student1(int number, String name) {
      this.number = number;
      this.name = name;
   }
   
   public String toString() {
      return name;
   }
   
   public int compareTo(Student1 s) {
      return number - s.number;
   }
}
public class SortTest {
   public static void main(String[] args) {
      Student1 array[] = {
            new Student1(20090001, "��ö��"),
            new Student1(20090002, "��ö��"),
            new Student1(20090003, "��ö��"),
      };
      List<Student1> list = Arrays.asList(array);
      Collections.sort(list);
//      Collections.sort(list, Collections.reverseOrder()); ���� �����ϱ�
      System.out.println(list);
   }
}