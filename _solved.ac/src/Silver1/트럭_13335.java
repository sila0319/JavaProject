package Silver1;


	import java.util.LinkedList;
	import java.util.Scanner;
	import java.util.Queue;

	public class Ʈ��_13335 {

		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			Queue <Integer> bridge = new LinkedList<>();//�ٸ����� �����ϴ� Ʈ��
			Queue <Integer> car = new LinkedList<>(); //������� �ٸ�
			int n = sc.nextInt(); //Ʈ���� ���� 
			int w = sc.nextInt(); //Ʈ���� �ǳʴ� �ð�
			int l = sc.nextInt(); //�ٸ��� ��Ƽ�� ����
			int carwei =0; //�ٸ����� �ö� �� �ִ� Ʈ���� ���Ը� ����Ѵ�. 
			int cnt =0; // �ɸ��½ð� 
			
			for (int i = 0; i < n; i++) { //car�� ���Ը� car queue���ٰ� ��´�.
				car.offer(sc.nextInt());
			}
			for(int i =0; i<w; i++) {//bridge�� ���̸�ŭ 0�� �߰��Ѵ�.(�ٸ����� ��� )
				bridge.add(0);
			}
			while(!(bridge.isEmpty()&&car.isEmpty())) {//�Ѵ� ��������� �����.
				cnt++; //�ɸ��� �ð��� ���Ѵ�. 
				carwei -=bridge.poll();//�ʹݿ� 0�� �� �־����Ƿ� 0�� �� ������� Ʈ���� �̵��Ѵ�.  
				if(!car.isEmpty()) {//car que�� ��������ʴٸ�. 
					if(carwei+car.peek() <= l) {//car.peak�� carwei ���԰� �ٸ��� ��ƿ �� �ִ� ���Ժ��� ���ٸ�.
						carwei += car.peek();//car.peek�� ���� carwei�� ��´�.
						bridge.offer(car.poll());//car que�� ��� ���� bridge que�� ��´�.
					}else {
						bridge.offer(0);//���࿡ �ٸ��� ���ö󰣰�� ���ð��� �����ǹǷ� bridge�� 0�� �߰��Ѵ�. 
					}
				}
			}
			System.out.println(cnt);//�ð���� 
		}
	}