package _27��_�����ͺ��̽�_���α׷���;

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
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("������ ���̽� ���� ����");
		}catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}catch (SQLException e ) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
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
//			int id = rs.getInt("book_id");//rs.getInt�� �ϰ� �� ��� ������Ÿ�� int�߿� �÷����� book_id�ΰ� �����´�. 
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
				int id = rs.getInt("book_id");//rs.getInt�� �ϰ� �� ��� ������Ÿ�� int�߿� �÷����� book_id�ΰ� �����´�. 
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price  = rs.getInt("price");
				cnt++;
				System.out.println(id+" "+title+" "+ publisher +" "  + price);
			}
			if(cnt==0) System.out.println("������ ����.");
			
		
	
			
		
	}
}
