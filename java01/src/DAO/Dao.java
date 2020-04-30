package DAO;

import java.sql.*;
import java.text.*;
import SQL.Sql;
import Controller.Main;
import VO.Vo;
import Data.*;
import java.util.*;
public class Dao {
	JDBC db;
	Connection con;
	PreparedStatement pstmp;
	ResultSet rs;
	Sql sql;
	
	public Dao() {
	//�����ͺ��̽� ����̹� �ε�
		db = new JDBC();
		con = db.getCon();
	//SQL�ʱ�ȭ
		sql = new Sql();
	}
	
	public int addMember(Vo vo) {
		int cnt = 0; //��ȯ�� ���� ����
		
		String sql1 = sql.getSQL(sql.ADD_MEMB);
		
		//preparedstatement �����´�.
		pstmp = db.getStmp(sql);
		
		// ���� ��ɿ� �ʿ��� ������ ä���
		try {
			pstmp.setInt(1, vo.getEno());
			pstmp.setString(2, vo.getEname());
			pstmp.setString(3, vo.getHiredate());
			pstmp.setInt(4, vo.getSal());
			
		//���Ǹ�� �ϼ� �� ������, ����� ��� ��ȯ
			cnt = pstmp.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(pstmp);
			db.close(con);
			
		}
		return cnt;
	}

}
