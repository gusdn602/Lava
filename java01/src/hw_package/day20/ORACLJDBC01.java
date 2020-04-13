package hw_package.day20;
/**
 * �� Ŭ������ �����ͺ��̽��۾��� ���� JDBC�� ó���� �� �ʿ��� �������� ����� �����ϱ� ���� Ŭ����
 * 
 * @author gusdn
 *
 */
import java.sql.*;
public class ORACLJDBC01 {
	private Connection Con = null;
	/*
	  	�� Ŭ������ new ��Ű�� ���� 
	  	�⺻������ ���� �ʿ��� ����̹��ε��� Ŀ�ؼ� ��� �۾��� ���ÿ� ������ ���̴�.
	 */
	public ORACLJDBC01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ� ������
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return getCon("hello","hello");
	}
	
	public Connection getCon(String id, String password) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "id";
		String pw = "pw";
		try {
			Con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			
		}
		this.Con = Con;
		return Con;
	}
	
	//Statment ������ �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//preparedStatement ������ �Լ�
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmp = null;
		try {
			pstmp = Con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmp;
	}
	//�� Ŭ������ ��ü�� �ʿ䰡 ���� ��� ��� �ݾ��ִ� �Լ�.
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			} else if (o instanceof Statement){
				((Connection)o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
