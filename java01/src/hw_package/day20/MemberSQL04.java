package hw_package.day20;

public class MemberSQL04 {
	public final int SEL_ALL = 1001;
	public final int SEL_MNO  = 1002;
	public final int ADD_MEMB = 3001;
	
	//�ڵ带 �Է��ϸ鼭 ȣ���ϸ� ���Ǹ����� ���ڿ��� ��ȯ���ִ� �Լ�
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT");
			buff.append("mno, name, id, main, gen, tel, ano, joinDate");
			buff.append("FROM");
			buff.append("member");
			buff.append("WHERE");
			buff.append("isshow = 'Y'");
			
			break;
			
		case SEL_MNO:
			buff.append("SELECT");
			buff.append("mno, name, id, main, gen, tel, ano, joinDate");
			buff.append("FROM");
			buff.append("  member");
			buff.append("WHERE");
			buff.append("  isshow = 'Y'");
			buff.append("AND mno = ?");
			
			break;
			
		case ADD_MEMB:
			buff.append("SELECT");
			buff.append("	member (");
			buff.append("	mno, name, id, pw, mail, gen, tel, ano");
			buff.append("	)");
			buff.append("VALUES(");
			buff.append("	(SLECT NVL(MAX(mno) + 1, 1000) FROM member WHERE mno <> 9999");
			buff.append("?,?,?,?,?,?,?,?,?");
			buff.append(")");
			break;
		}
		return buff.toString();
	}
}