package Myproj.test;

import DB.*;
import java.sql.*;
public class Test01 {
	ORCLJDBC db;
	Statement stmt;
	Connection con;
	ResultSet rs;
	public Test01() {
		db = new ORCLJDBC();
		//Connection가져오고
		con = db.getCon();
		
		//질의명령
		String sql = "SELECT mno, name, id FROM member WHERE =";
		
		//회장님의 정보를 가져오자
		sql = sql + 9999;
		
		int mno = 1000;
		String tel = "'010-7777-7777'";
		
		String sql1 = "UPDATE member SET tel = " + tel+"WHERE mno = " + mno;
		//Statemenet가져오고
		stmt = db.getSTMT(con);

		try {
			rs = stmt.executeQuery(sql);
			//rs 에서 데이터 꺼내고
			stmt.executeUpdate(sql1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}
