package Vector;

import java.util.Vector;//Vector는 객체이다. 

public class Vector_EX {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();  
		/*new 뒤에오는 것은 생성자 괄호 안에 매게변수가 있을수도있고 없을 수도있다.
		 * 메개변수를 적으면 그 크기만큼 공간이 생성된다
		 * 백터는 매개변수가 없을 경우 기본적으로 10개의 공간이생성된다. 
		 * v는 메소드
		 * Vector는 가변배열이다.
		 */
		System.out.println("Vector Size : " + v.size());//add로 인해 추가된 갯수확인
 		System.out.println("Vector Capacity : " + v.capacity());
		v.add(5);//0번째
		v.add(-1);//1번쨰
		v.add(15);//2번째
		v.add(5);//3번째
		v.add(-1);//4번쨰
		v.add(15);//5번째
		v.add(5);//6번째
		v.add(-1);//7번째
		v.addElement(3);//8번째
		v.add(10);
		v.add(15);
		
		System.out.println("Vector Size : " + v.size());//add로 인해 추가된 갯수확인
 		System.out.println("Vector Capacity : " + v.capacity());
 		//size가 5면 Capacity의 사이즈는10 size가 15면 Capacity의 사이즈는 20
		
 		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum =0;
		for (int i = 0; i < v.size(); i++) {//8번 돈다.(size크기만큼)
			int n = v.elementAt(i);//v에 저장된 숫자를 n이라는 변수에 저장한다.
			sum +=n;//sum에 n값을 추가한다. 
		}
		System.out.println("Sum of Vector : " + sum);//v안에 저장된 모든값을 출력한다.
	}
}
