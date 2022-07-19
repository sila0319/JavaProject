package _27��_�����ͺ��̽�_���α׷���;

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
	
	public static void main(String arg[]) {
		addBook("Artificial Intellegence", "Addision Wesley", "2002", 35000);
		
	}//�̺κп��� ���߿� ����ڷκ��� �Է¹��� ���� ©�� �޼ҵ带 �ֵ��� ������ �ϸ� �ɰŰ���.
	private static void addBook(String title, String publisher, String year , int price) {
		Connection con = makeConnection();
		try {
			Statement stmt = con.createStatement();
			String s = "INSERT INTO books (title,publisher, year, price) VALUES";
			s += "('" + title + "','" + publisher+ "','" +year + "','"+price + "')";
			System.out.println(s);
			int i = stmt.executeUpdate(s); //db�� ������Ʈ�� �ȴ�.
			if(i==1) System.out.println("���ڵ� �߰� ����"); // true�� ���� 1�̹Ƿ� �����Ǹ� 1�̵�.
			else System.out.println("���ڵ� �߰� ����");
			
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
//			int i = stmt.executeUpdate(s); //db�� ������Ʈ�� �ȴ�.
//			if(i==1) System.out.println("���ڵ� �߰� ����"); // true�� ���� 1�̹Ƿ� �����Ǹ� 1�̵�.
//			else System.out.println("���ڵ� �߰� ����");
//			
//		}catch (SQLException e) {
//			System.out.println(e.getMessage());
//			System.exit(0);
//		}
//	}
}
