package Gold3;



	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.StringTokenizer;

	public class ���ִ���_����_2457 {
		//Ŭ������ �����Ͽ��� ���� ���۳�¥�� ���³�¥�� list���ٰ� ������ Ŭ�������� ����Ʈ�� �����Ѵ�.
		
		static class Pair implements Comparable<Pair> {
			int d1, d2;
			//d1�� ���� ��ȭ�ñ� , d2�� ���� ���½ñⰡ ����.
			public Pair(int d1, int d2) {
				this.d1 = d1;
				this.d2 = d2;
			}
			@Override
			public int compareTo(Pair o) {//����Ʈ�� ���� ���� 
				if(this.d1 == o.d1) {
					return this.d2 - o.d2;
				}
				return this.d1 - o.d1;
			}
		}

		public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(in.readLine()," ");
			int n = Integer.valueOf(st.nextToken());//��� ���� �����ϴ��� �Է¹޴´�.
			ArrayList<Pair> list = new ArrayList<>();//list�� Pair�� ��´�.
			for(int i=0; i<n; i++) {//n���� ���� �Է¹޴´�.
				st = new StringTokenizer(in.readLine()," ");//������ �������� ¥����. 
				list.add(new Pair(Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken()),
						Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken())));		
				//list�� �߰��Ҷ� ����*100���� �߰��ϰ� ���� �׳� ���Ѵ� st.nextToken���� 1��3���� ���̹Ƿ� �ֳ״� *100���� �ִ´�.
			}
			Collections.sort(list);//list�� �����Ѵ�.
			int ans=0;
			int fidx=0;
			int start=301;
			int max=0;
			
			while(start<1201) {//start���� 1201���� ���� ��� ���� �ݺ� 
				max=0;//max���� �ʱ�ȭ�Ѵ�. 
				boolean flag =false;//flag�� ���� false�� �ʱ�ȭ��Ų��.
				for(int i=fidx;i<n;i++) {
					Pair cur= list.get(i);//cur�� list.get�� �ϰԵȴٸ� ������ d1���� ���� ��ȭ�ϴ½ñ� d2���� ���� ���½ñⰡ ����. 
					if(cur.d1 > start) break;//start���� ���³����� ������� �����.
					if(cur.d1 <= start && max<cur.d2) {//�Ǵ³��� ��ó�� start������ �۰����� max�ǰ��� ���������� �������
						max = cur.d2; //max�� ���³���
						fidx=i+1; //fidx�� 1������Ų��.
						flag = true;//flag�� true�� ��ȯ�Ѵ�.
					}
				}
				if(flag) {//flag�� true��� ���� �ٲ���̹Ƿ� start���� max�� �����Ѵ�
					start=max;
					ans++;//���� �� ���� 
				}else
					break; //���� flag false��� �����. �ֳ��ϸ� �ٲ��� ��ã�ұ⋚���̴�.
			}
			if(max<1201)
				System.out.println(0);//max�� 1201�� �������Ѵٸ� ���ִ��� ������ ���ǿ� �����������Ѵ�.
			else
				System.out.println(ans);//�׿��ǰ��� ans�� ���Ѵ�
		}
	}
	//3�ڸ� ���ڷ� �ٲٱ�
	//301���Ͽ��� ���� ���� ū���� ã��