package exam;
/**
 *  이 클래스는 emp테이블의 사원 정보에 대한 질의 명령을 만들고
 *  요청이 오면 반환해주는 클래스
 * @author 우현우
 *@since 2020.03.30
 *@version v.1.0
 */
public class Chamgo {
	//코드를 담을 변수
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1001;
	
	public final int EDIT_SAL = 2001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		//모든 사원의 정보 가져오는 질의명령
		
		switch(code) {
		case SEL_ALL :
			buff.append("SELECT");
			buff.append("   empno, ename, job, mgr, hiredate, comm, deptno ");
			buff.append("FROM ");
			buff.append("emp ");
			break;
		case SEL_DNO :
			
			break;
		case EDIT_SAL :
	
			break;
		case SEL_ALL :
	
			break;
		}
	}
		
	public static void main(String[] args) {
		

	}

}
