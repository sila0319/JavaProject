package _27장_데이터베이스_프로그래밍;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLInsertTest {
	public static Connection makeConnection() {
		String url = "jdbc:mariadb://localhost/book_db";
		String id = "root";
		String password = "maria";
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터 베이스 연결 성공");
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		}catch (SQLException e ) {
			System.out.println("연결에 실패하였습니다.");
		}
	
		return con;
	}
	
	public static void main(String arg[]) {
		addBook("Artificial Intellegence", "Addision Wesley", "2002", 35000);
		
	}//이부분에서 나중에 사용자로부터 입력받은 값을 짤라서 메소드를 넣도록 설정을 하면 될거같다.
	private static void addBook(String title, String publisher, String year , int price) {
		Connection con = makeConnection();
		try {
			Statement stmt = con.createStatement();
			String s = "INSERT INTO books (title,publisher, year, price) VALUES";
			s += "('" + title + "','" + publisher+ "','" +year + "','"+price + "')";
			System.out.println(s);
			int i = stmt.executeUpdate(s); //db에 업데이트가 된다.
			if(i==1) System.out.println("레코드 추가 성공"); // true의 값이 1이므로 성공되면 1이됨.
			else System.out.println("레코드 추가 실패");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
//	private static void deleteBook() {
//		Connection con = makeConnection();
//		try {
//			Statement stmt = con.createStatement();
//			String s = "INSERT INTO books (title,publisher, year, price) VALUES";
//			s += "('" + title + "','" + publisher+ "','" +year + "','"+price + "')";
//			System.out.println(s);
//			int i = stmt.executeUpdate(s); //db에 업데이트가 된다.
//			if(i==1) System.out.println("레코드 추가 성공"); // true의 값이 1이므로 성공되면 1이됨.
//			else System.out.println("레코드 추가 실패");
//			
//		}catch (SQLException e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
//	}
}
