package _9장_생성자와_접근제어;
class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int h, int m , int s) {
		setTime(h, m, s);
	}
	
	//시간 설정 함수 => 입력받은 시간을 검증한다
	public void setTime(int h, int m, int s) {
		hour =((h >= 0 && h< 24) ? h : 0);//시간 검증
		minute = ((m >= 0 && m< 60) ? m : 0);// 분 검증
		second = ((s >= 0 && s< 60) ? s : 0);// 초 검증
	}
	
	public String toString() {
	      return String.format("%02d:%02d:%02d", hour,minute,second);
	   }
}

public class TimeTest {
	public static void main(String[] args) {
		Time time = new Time();
		
		System.out.println("기본 생성자 호출 후 시간 :");
		System.out.println(time);
		
		Time time2 = new Time(13, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간 :");
		System.out.println(time2);
		
		Time time3 = new Time(99, 66, 77);
		System.out.println("올바르지 않은 시간 설정 후 시간 :");
		System.out.println(time3);
		
	}

}