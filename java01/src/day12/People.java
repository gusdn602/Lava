package day12;
/**
 * �� Ŭ������ ����� ������ ������ Ŭ����
 * @author ������
 * @since 2020.03.24
 * @version v.1.0
 *
 */
public class People {
	//�� Ŭ������ �ּҷϿ� ����� ����� ������ �Է��� �뵵�� Ŭ�����̴�.
	//���� ����� �������� ����� �������� ��������� �Ѵ�.
	String name,addr, tel, mail, birthday, gen, cop;
	
	//�׷��� �� Ŭ������ ��ü�� �ɋ��� 
	//��� ������ ��� �غ�Ǽ� �ԷµǸ� ���ҳ������� ���� ���̴�.
	//� ������ �⺻ ������ ������ �Ǿ���� ������ �����Ұ��̴�.
	
	//������ �Լ� ����
	//�⺻ ������ �Լ�
	public People() {
		
	}
	//public People(String cop, String name, String tel, String mail, String birthday, String gen, String addr) {
	//	this("increpas", name, tel, mail, gen, birthday, addr);
	//}
	public People(String cop, String name, String tel, String mail, String birthday, String gen, String addr) {
		    this.cop = cop;
		    this.name = name;
		    this.tel = tel;
		    this.mail = mail;
		    this.addr = addr;
		    this.birthday = birthday;
		    this.gen = gen;
		    

	}
}