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
	//데이터베이스 드라이버 로딩
		db = new JDBC();
		con = db.getCon();
	//SQL초기화
		sql = new Sql();
	}
	
	public int addMember(Vo vo) {
		int cnt = 0; //반환값 변수 생성
		
		String sql1 = sql.getSQL(sql.ADD_MEMB);
		
		//preparedstatement 가져온다.
		pstmp = db.getStmp(sql);
		
		// 질의 명령에 필요한 데이터 채우기
		try {
			pstmp.setInt(1, vo.getEno());
			pstmp.setString(2, vo.getEname());
			pstmp.setString(3, vo.getHiredate());
			pstmp.setInt(4, vo.getSal());
			
		//질의명령 완성 및 보내기, 변경된 행수 반환
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
