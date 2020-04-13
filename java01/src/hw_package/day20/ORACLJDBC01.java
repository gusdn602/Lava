package hw_package.day20;
/**
 * 이 클래스는 데이터베이스작업을 위한 JDBC를 처리할 떄 필요한 공통족인 기능을 제공하기 위한 클래스
 * 
 * @author gusdn
 *
 */
import java.sql.*;
public class ORACLJDBC01 {
	private Connection Con = null;
	/*
	  	이 클래스는 new 시키는 순간 
	  	기본적으로 가장 필요한 드라이버로딩과 커넥션 얻는 작업을 동시에 실행할 것이다.
	 */
	public ORACLJDBC01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 얻어오고
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
	
	//Statment 얻어오는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//preparedStatement 얻어오는 함수
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmp = null;
		try {
			pstmp = Con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmp;
	}
	//이 클래스의 객체가 필요가 없을 경우 대신 닫아주는 함수.
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
