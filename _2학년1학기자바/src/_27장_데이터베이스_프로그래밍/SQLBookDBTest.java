package _27장_데이터베이스_프로그래밍;

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
	public static Connection makeConnection() {//데이터베이스 연결 
		
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
	
	private static void addBook(String title, String publisher, String year , int price) {//insert 부분
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
	
	private static void updateBook() {//업데이트 부분 
		Connection con = makeConnection();
		System.out.println("모든 데이터 특정 컬럼 값 변경 시 1 \n 특정 데이터의 값 변경시 2 ");
		int i = sc.nextInt();
		System.out.println("수정할 컬럼을 입력해주세요");
		String column = sc.next();
		if(i==1) {
			System.out.println("수정할 필드 입력");
			String field1 = sc.next();
			try {
				Statement stmt = con.createStatement();
				String s = "UPDATE books SET "+ column+" = "+"'"+field1+"'"  ;
				System.out.println(s);
				int j = stmt.executeUpdate(s); //db에 업데이트가 된다.
				if(j==1) System.out.println("레코드 추가 성공"); // true의 값이 1이므로 성공되면 1이됨.
				else System.out.println("레코드 추가 실패");
				
			}catch (SQLException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}else if(i==2) {
			System.out.println("수정할 필드 입력");
			String field1 = sc.next();
			System.out.println("컬럼 조건 입력");
			String wherecolumn = sc.next();
			System.out.println("필드 조건 입력");
			String field2 = sc.next();
			try {
				Statement stmt = con.createStatement();
				String s = "UPDATE books SET "+ column+" = "+"'"+field1+"'"+" WHERE " + wherecolumn +" = " + "'"+field2+"'" ;
				System.out.println(s);
				int j = stmt.executeUpdate(s); //db에 업데이트가 된다.
				if(j==1) System.out.println("업데이트 성공"); // true의 값이 1이므로 성공되면 1이됨.
				
				
			}catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("업데이트 실패");
				System.exit(0);
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	private static void deleteBooks() {
		Connection con = makeConnection();
		System.out.println("삭제 조건 입력 ");
		String delwhere = sc.next();
		try {
			Statement stmt = con.createStatement();
			String s = "DELETE FROM Books where" ;
			s += "'"+delwhere+"'";
			System.out.println(s);
			int i = stmt.executeUpdate(s); //db에 업데이트가 된다.
			if(i==1) System.out.println("레코드 추가 성공"); // true의 값이 1이므로 성공되면 1이됨.
			else System.out.println("레코드 추가 실패");
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	
	private static void selectBook() throws SQLException {//select부분 
		
		Statement stmt = con.createStatement();
		System.out.println("전체 조회면 0 조건 조회면 1을 입력해주세요");
		int i = sc.nextInt();
		if(i==0) {
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			while(rs.next()) {
				int id = rs.getInt("book_id");//rs.getInt를 하게 될 경우 데이터타입 int중에 컬럼명이 book_id인걸 가져온다. 
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price  = rs.getInt("price");
				
				System.out.println(id+" "+title+" "+ publisher +" "  + price);
			}
		}else if(i==1) {
			System.out.println("조건을 입력해주세요.");
			String where = sc.next();
			ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE "+where);
			int cnt=0;
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
	
	public static void main(String[] args) throws SQLException {
		
	//	Connection con = makeConnection();
	//	Statement stmt = con.createStatement();
	
		
		while(true) {
			System.out.println("1. 책 정보 추가");
			System.out.println("2. 책 정보 수정");
			System.out.println("3. 책 정보 삭제");
			System.out.println("4. 책 정보 조회");
			System.out.println("5. 종료");
			System.out.println("번호를 선택하세요 = ");
			int i =0;
			i = sc.nextInt();
			if(i==1) {
				System.out.println("1번을 선택하셨습니다.");
				System.out.println("순서대로 책제목, 출판인, 출판연도, 가격을 입력해 주세요.");
				String title = sc.next();
				String publisher = sc.next();
				String year = sc.next();
				int price = sc.nextInt();
				addBook(title, publisher,year,price);
			}else if(i==2){
				System.out.println("2번을 선택하셨습니다.");
				updateBook();
			}else if(i==3){
				System.out.println("3번을 선택하셨습니다.");
				deleteBooks();
			}else if(i==4){
				System.out.println("4번을 선택하셨습니다.");
				selectBook();
			}else if(i==5){
				System.out.println("5번을 선택하셨습니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

}
