package Silver1;


	import java.util.LinkedList;
	import java.util.Scanner;
	import java.util.Queue;

	public class 트럭_13335 {

		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			Queue <Integer> bridge = new LinkedList<>();//다리위에 존재하는 트럭
			Queue <Integer> car = new LinkedList<>(); //대기중인 다리
			int n = sc.nextInt(); //트럭의 개수 
			int w = sc.nextInt(); //트럭이 건너는 시간
			int l = sc.nextInt(); //다리가 버티는 무게
			int carwei =0; //다리위에 올라갈 수 있는 트럭의 무게를 계산한다. 
			int cnt =0; // 걸리는시간 
			
			for (int i = 0; i < n; i++) { //car의 무게를 car queue에다가 담는다.
				car.offer(sc.nextInt());
			}
			for(int i =0; i<w; i++) {//bridge의 길이만큼 0을 추가한다.(다리길이 계산 )
				bridge.add(0);
			}
			while(!(bridge.isEmpty()&&car.isEmpty())) {//둘다 비어있으면 멈춘다.
				cnt++; //걸리는 시간을 더한다. 
				carwei -=bridge.poll();//초반에 0을 다 넣었으므로 0이 다 사라지면 트럭이 이동한다.  
				if(!car.isEmpty()) {//car que가 비어있지않다면. 
					if(carwei+car.peek() <= l) {//car.peak와 carwei 무게가 다리가 버틸 수 있는 무게보다 적다면.
						carwei += car.peek();//car.peek의 값을 carwei에 담는다.
						bridge.offer(car.poll());//car que에 담긴 값을 bridge que에 담는다.
					}else {
						bridge.offer(0);//만약에 다리가 못올라간경우 대기시간이 증가되므로 bridge에 0을 추가한다. 
					}
				}
			}
			System.out.println(cnt);//시간출력 
		}
	}