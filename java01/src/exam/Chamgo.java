package exam;
/**
 *  �� Ŭ������ emp���̺��� ��� ������ ���� ���� ����� �����
 *  ��û�� ���� ��ȯ���ִ� Ŭ����
 * @author ������
 *@since 2020.03.30
 *@version v.1.0
 */
public class Chamgo {
	//�ڵ带 ���� ����
	public final int SEL_ALL = 1001;
	public final int SEL_DNO = 1001;
	
	public final int EDIT_SAL = 2001;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		//��� ����� ���� �������� ���Ǹ��
		
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
