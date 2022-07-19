package Silver3;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.StringTokenizer;
	import java.util.Arrays;


	public class ¼ö¿­_2559 {
		static int [] arr;
		static int x;
		static int result =0;
		static int n;
		static int max =-210000000;
		static void check() {
			int start =0;
			int end =0;
			while( end!=n+1) {
				if(end-start==x) {
					//System.out.println(result);
					if(max < result)  {
						max = result;
					}
					result -= arr[start];
					start++;
					
				}else {
					result += arr[end];
					end++;
				}
				
			}
			
		}
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
				StringTokenizer st = new StringTokenizer(br.readLine());
				n = Integer.parseInt(st.nextToken());
				x = Integer.parseInt(st.nextToken());
				arr = new int [n+1];
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < arr.length-1; i++) {
					arr[i] = Integer.parseInt(st.nextToken());
				}
			
				check();
				if(max==-210000000)
					System.out.println(result);
				else System.out.println(max);
				
				
			}

		}