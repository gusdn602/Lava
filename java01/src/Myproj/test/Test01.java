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
		//Connection��������
		con = db.getCon();
		
		//���Ǹ��
		String sql = "SELECT mno, name, id FROM member WHERE =";
		
		//ȸ����� ������ ��������
		sql = sql + 9999;
		
		int mno = 1000;
		String tel = "'010-7777-7777'";
		
		String sql1 = "UPDATE member SET tel = " + tel+"WHERE mno = " + mno;
		//Statemenet��������
		stmt = db.getSTMT(con);

		try {
			rs = stmt.executeQuery(sql);
			//rs ���� ������ ������
			stmt.executeUpdate(sql1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}
