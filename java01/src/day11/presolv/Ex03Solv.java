package day11.presolv;

public class Ex03Solv {
	public Ex03Solv() {
		//���� �ټ����� �̸��� ������ �迭�� ������.
		String[] name = {"������", "�ڱ���", " ������", " �ڱ�ȣ", " ����ö","�����"}; 
		
		//�ټ����� �����͸� �����ҹ迭�� �����.
		Stud[] ban = new Stud[name.length];
		
		//ban = setArr1(ban, name );
		setArr (ban, name );
		//�迭�� �ϼ��� ��� �����ϱ�
		
		//ban = setSort1(ban);
		 setSort(ban);
		
		//����Ѵ�.
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %4s | %5s\n", "�̸�", "����", "����", "����", "����", "�ڵ�", "����", "���");
		System.out.println("------------------------------------------------------------------");
		for(int i = 0; i<ban.length; i++) {
			ban[i].toPrint();
		}
		
	}
	
	// �����μ��� �̸��� �Է¹޾Ƽ� �迭�� �������ִ� �Լ��� ����� ����
	//�׷��� �����μ��� �տ��� �Ϲ� ������ �͵� ���������, �ڿ��� ���� ����� �ȵȴ�.
	public Stud[] setArr1(Stud[] s, String...name) {
		for(int i = 0; i<name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		return s;
	}
	
	public void  setArr(Stud[] s, String...name) {
		for(int i = 0; i<name.length; i++) {
			s[i] = new Stud(name[i]);
		}
	}
	//Stud Ÿ���� �迭�� �Է����ָ� �������ִ� �Լ��� ������.
	public Stud[] setSort1(Stud[]s) {
		for(int i = 0; i <s.length; i++) {
			
			for(int j = i+1; j < s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
				}
			}
		}
		return s;
	}
	
	public void setSort(Stud[]s) {
		for(int i = 0; i <s.length; i++) {
			
			for(int j = i+1; j < s.length; j++) {
				if(s[i].getSum() < s[j].getSum()) {
					Stud tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
					
				}
			}
		}
		
	}
	public static void main(String[] args) {
		new Ex03Solv();

	}

}
