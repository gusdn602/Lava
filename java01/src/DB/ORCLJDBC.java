package DB;
/**
 * �� Ŭ������ �����ͺ��̽��۾��� ���� JDBC�� ó���� �� �ʿ��� �������� ����� �����ϱ� ���� Ŭ����
 * @author 	������
 * @since 2020.04.03
 * @version	v.1.0
 * @see		java.sql.*,
 */
import java.sql.*;
public class ORCLJDBC {
	private Connection Con = null;
	/*
	 	�� Ŭ������ new ��Ű�� ����
	 	�⺻������ ���� �ʿ��� ����̹��ε��� Ŀ�ؼ� ��� �۾��� ���ÿ� ������ ���̴�.
	 */
	public ORCLJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ� ������
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return getCon("Scott", "tiger");
	}
	
	//Ŀ�ؼ� ������ �Լ�
	public Connection getCon(String id, String password) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "id";
		String pw = "password";
		try {
			Con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			
		}
		this.Con = Con;
		return Con;
		
	}

	//Statement ������ �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
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
	
	//�� Ŭ������ ��ü�� �ʿ䰡 ���� ��� ��� �ݾ��ִ� �Լ�
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();			
			} else if(o instanceof Statement) {
				((Statement)o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
