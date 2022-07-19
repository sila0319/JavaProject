package _27��_�����ͺ��̽�_���α׷���;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class SQLBookDBTest {
	static Connection con = makeConnection();
	static Scanner sc = new Scanner (System.in);
	public static Connection makeConnection() {//�����ͺ��̽� ���� 
		
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
	
	private static void addBook(String title, String publisher, String year , int price) {//insert �κ�
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
	
	private static void updateBook() {//������Ʈ �κ� 
		Connection con = makeConnection();
		System.out.println("��� ������ Ư�� �÷� �� ���� �� 1 \n Ư�� �������� �� ����� 2 ");
		int i = sc.nextInt();
		System.out.println("������ �÷��� �Է����ּ���");
		String column = sc.next();
		if(i==1) {
			System.out.println("������ �ʵ� �Է�");
			String field1 = sc.next();
			try {
				Statement stmt = con.createStatement();
				String s = "UPDATE books SET "+ column+" = "+"'"+field1+"'"  ;
				System.out.println(s);
				int j = stmt.executeUpdate(s); //db�� ������Ʈ�� �ȴ�.
				if(j==1) System.out.println("���ڵ� �߰� ����"); // true�� ���� 1�̹Ƿ� �����Ǹ� 1�̵�.
				else System.out.println("���ڵ� �߰� ����");
				
			}catch (SQLException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}else if(i==2) {
			System.out.println("������ �ʵ� �Է�");
			String field1 = sc.next();
			System.out.println("�÷� ���� �Է�");
			String wherecolumn = sc.next();
			System.out.println("�ʵ� ���� �Է�");
			String field2 = sc.next();
			try {
				Statement stmt = con.createStatement();
				String s = "UPDATE books SET "+ column+" = "+"'"+field1+"'"+" WHERE " + wherecolumn +" = " + "'"+field2+"'" ;
				System.out.println(s);
				int j = stmt.executeUpdate(s); //db�� ������Ʈ�� �ȴ�.
				if(j==1) System.out.println("������Ʈ ����"); // true�� ���� 1�̹Ƿ� �����Ǹ� 1�̵�.
				
				
			}catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("������Ʈ ����");
				System.exit(0);
			}
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
	}
	
	private static void deleteBooks() {
		Connection con = makeConnection();
		System.out.println("���� ���� �Է� ");
		String delwhere = sc.next();
		try {
			Statement stmt = con.createStatement();
			String s = "DELETE FROM Books where" ;
			s += "'"+delwhere+"'";
			System.out.println(s);
			int i = stmt.executeUpdate(s); //db�� ������Ʈ�� �ȴ�.
			if(i==1) System.out.println("���ڵ� �߰� ����"); // true�� ���� 1�̹Ƿ� �����Ǹ� 1�̵�.
			else System.out.println("���ڵ� �߰� ����");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	
	private static void selectBook() throws SQLException {//select�κ� 
		
		Statement stmt = con.createStatement();
		System.out.println("��ü ��ȸ�� 0 ���� ��ȸ�� 1�� �Է����ּ���");
		int i = sc.nextInt();
		if(i==0) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			while(rs.next()) {
				int id = rs.getInt("book_id");//rs.getInt�� �ϰ� �� ��� ������Ÿ�� int�߿� �÷����� book_id�ΰ� �����´�. 
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price  = rs.getInt("price");
				
				System.out.println(id+" "+title+" "+ publisher +" "  + price);
			}
		}else if(i==1) {
			System.out.println("������ �Է����ּ���.");
			String where = sc.next();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE "+where);
			int cnt=0;
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
	
	public static void main(String[] args) throws SQLException {
		
	//	Connection con = makeConnection();
	//	Statement stmt = con.createStatement();
	
		
		while(true) {
			System.out.println("1. å ���� �߰�");
			System.out.println("2. å ���� ����");
			System.out.println("3. å ���� ����");
			System.out.println("4. å ���� ��ȸ");
			System.out.println("5. ����");
			System.out.println("��ȣ�� �����ϼ��� = ");
			int i =0;
			i = sc.nextInt();
			if(i==1) {
				System.out.println("1���� �����ϼ̽��ϴ�.");
				System.out.println("������� å����, ������, ���ǿ���, ������ �Է��� �ּ���.");
				String title = sc.next();
				String publisher = sc.next();
				String year = sc.next();
				int price = sc.nextInt();
				addBook(title, publisher,year,price);
			}else if(i==2){
				System.out.println("2���� �����ϼ̽��ϴ�.");
				updateBook();
			}else if(i==3){
				System.out.println("3���� �����ϼ̽��ϴ�.");
				deleteBooks();
			}else if(i==4){
				System.out.println("4���� �����ϼ̽��ϴ�.");
				selectBook();
			}else if(i==5){
				System.out.println("5���� �����ϼ̽��ϴ�.");
				break;
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}

}
