package _27��_�����ͺ��̽�_���α׷���;

import java.sql.*;

public class ConnectDatabase {
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
	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
	}

}
