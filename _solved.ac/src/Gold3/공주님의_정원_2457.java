package Gold3;



	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.StringTokenizer;

	public class 공주님의_정원_2457 {
		//클래스를 선언하여서 꽃의 시작날짜와 지는날짜를 list에다가 담은후 클래스에서 리스트를 관리한다.
		
		static class Pair implements Comparable<Pair> {
			int d1, d2;
			//d1은 꽃의 개화시기 , d2는 꽃의 지는시기가 담긴다.
			public Pair(int d1, int d2) {
				this.d1 = d1;
				this.d2 = d2;
			}
			@Override
			public int compareTo(Pair o) {//리스트의 값을 정렬 
				if(this.d1 == o.d1) {
					return this.d2 - o.d2;
				}
				return this.d1 - o.d1;
			}
		}

		public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(in.readLine()," ");
			int n = Integer.valueOf(st.nextToken());//몇개의 꽃이 존재하는지 입력받는다.
			ArrayList<Pair> list = new ArrayList<>();//list에 Pair를 담는다.
			for(int i=0; i<n; i++) {//n개의 꽃을 입력받는다.
				st = new StringTokenizer(in.readLine()," ");//공백을 기준으로 짜른다. 
				list.add(new Pair(Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken()),
						Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken())));		
				//list에 추가할때 월은*100으로 추가하고 일은 그냥 더한다 st.nextToken에서 1번3번이 월이므로 애네는 *100으로 넣는다.
			}
			Collections.sort(list);//list를 정렬한다.
			int ans=0;
			int fidx=0;
			int start=301;
			int max=0;
			
			while(start<1201) {//start값이 1201보다 작은 경우 무한 반복 
				max=0;//max값을 초기화한다. 
				boolean flag =false;//flag의 값을 false로 초기화시킨다.
				for(int i=fidx;i<n;i++) {
					Pair cur= list.get(i);//cur에 list.get을 하게된다면 각각의 d1에는 꽃의 개화하는시기 d2에는 꽃의 지는시기가 담긴다. 
					if(cur.d1 > start) break;//start값이 지는날보다 작은경우 멈춘다.
					if(cur.d1 <= start && max<cur.d2) {//피는날이 맨처음 start값보다 작고같으며 max의값이 지느날보다 작은경우
						max = cur.d2; //max는 지는날로
						fidx=i+1; //fidx를 1증가시킨다.
						flag = true;//flag를 true로 교환한다.
					}
				}
				if(flag) {//flag가 true라면 값이 바뀐것이므로 start값을 max로 변경한다
					start=max;
					ans++;//꽃의 수 증가 
				}else
					break; //만약 flag false라면 멈춘다. 왜냐하면 다꽃을 다찾았기떄문이다.
			}
			if(max<1201)
				System.out.println(0);//max가 1201을 넘지못한다면 공주님의 정원의 조건에 만족하지못한다.
			else
				System.out.println(ans);//그외의경우는 ans를 말한다
		}
	}
	//3자리 숫자로 바꾸기
	//301이하에서 끝이 가장 큰값을 찾기