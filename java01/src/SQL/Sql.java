package SQL;

public class Sql {
	public final int MEMB_ALL = 1001;
	
	public final int ADD_MEMB = 3001;
	public final int UPDATE_MEMB = 3002;
	
	public String getSQL(int code) {
		StringBuffer buf = new StringBuffer();
		
		switch(code) {
		case MEMB_ALL:
			buf.append("SELECT");
			buf.append("empno 사원번호, ename 사원명, hiredate 입사일, sal 급여");
			buf.append("EMP");
			
			break;
			
		case ADD_MEMB:
			buf.append("INSERT INTO");
			buf.append("EMP");
			buf.append("VALUES( ");
			buf.append(" (SELCET NVL(MAX(mno) + 1,1000) FROM  emp <> 9999),");
			buf.append("?,?,?,?");
			buf.append(") ");
			break;
			
		case UPDATE_MEMB:
			buf.append("UPDATE");
			buf.append("EMP ");
			buf.append("SET ");
			buf.append("SAL");
			break;
		}
		return buf.toString();
	}


}
