package exam;

public class EmpDAO {
	public Chamgo sql;
	public EmpDAO() {
		eSql = new Chamgo();
		//��� ȸ���� ������ ��ȸ�� ���Ǹ�ɰ�������
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println();
	}
	public static void main(String[] args) {
		

	}

}
