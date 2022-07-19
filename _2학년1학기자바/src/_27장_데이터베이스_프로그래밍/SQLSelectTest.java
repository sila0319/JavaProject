package _27장_데이터베이스_프로그래밍;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLSelectTest {
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
	
	
	public static void main(String[] args)throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("SELECT * FROM books");
//		
//		
//		while(rs.next()) {
//			int id = rs.getInt("book_id");//rs.getInt를 하게 될 경우 데이터타입 int중에 컬럼명이 book_id인걸 가져온다. 
//			String title = rs.getString("title");
//			String publisher = rs.getString("publisher");
//			int price  = rs.getInt("price");
//			
//			System.out.println(id+" "+title+" "+ publisher +" "  + price);
//		}
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner (System.in);
		int cnt =0;
		int checkid = sc.nextInt();
		ResultSet rs = stmt.executeQuery("select * from books where price="+checkid);
	
			while(rs.next()) {
				int id = rs.getInt("book_id");//rs.getInt를 하게 될 경우 데이터타입 int중에 컬럼명이 book_id인걸 가져온다. 
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price  = rs.getInt("price");
				cnt++;
				System.out.println(id+" "+title+" "+ publisher +" "  + price);
			}
			if(cnt==0) System.out.println("조건이 없다.");
			
		
	
			
		
	}
}
