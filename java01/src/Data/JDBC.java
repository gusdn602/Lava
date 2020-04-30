package Data;

import java.sql.*;

import SQL.Sql;
public class JDBC {
	private Connection Con = null;
	
	public JDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getCon() {
		return getCon("scott", "tiger");
	}
	
	public Connection getCon(String id, String password) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "id";
		String pw = "password";
		try {
				Con = DriverManager.getConnection(url,user,pw);
			}catch(Exception e) {
				e.printStackTrace();
			}
			this.Con = Con;
			return Con;
		}
	
	//Statement얻어온다.
	public Statement getStmp(Connection con) {
		Statement stmt = null;
		try {
			stmt = Con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//PreparedStatement 얻어온다.
	public PreparedStatement getPSMT(String sql) {
		PreparedStatement pstmp = null;
		try {
			pstmp = Con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmp;
	}
		//객체가 필요 없을경우 닫아준다.
		public void close(Object o) {
			try {
				if(o instanceof Connection) {
					((Connection)o).close();
				}else if(o instanceof PreparedStatement) {
					((PreparedStatement)o).close();
				}else if(o instanceof Statement) {
					((Statement)o).close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		}
		
}
		
	
	


	

