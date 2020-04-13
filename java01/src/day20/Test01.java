package day20;

/*
 	�� Ŭ������ jdbc�� �׽�Ʈ �ϱ� ���� Ŭ����
 	
 	����Ŭ�� ����� ���� hello������ �����ؼ�
 	member ���̺�� �����͸� ä������
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
public class Test01 {

	public Test01() {
		//����
		/*
		 	1. JDBC��� �ܺ� �ܺε����ͺ��̽��� ������ ����̹��� �̹� �߰��� �س��Ҵ�.
		 		���� �� ���α׷����� �� ����̹��� ������ �;� �Ѵ�.
		 		�ܺ� Ŭ������ �ε��ϴ� �Լ�
		 		
		 		Class.forName(Ŭ�����̸�)
		 */
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//1. ���� ����̹� �ε��� ���� �����̴�.
			JOptionPane.showMessageDialog(null, "***DB Driver Loading Complete!!! ***");
			//2. ������ �õ��� ����.
			/*
			 	������ �����ͺ��̽����� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
			 	�� ��� ���� ���۽��� ������ û�ϼ���...
			 	
			 	�����ϴ� ����� JDBC���� ����� �ϸ� �ȴ�.
			 	DriverManager.getConncetion();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			//�� url�� �����ͺ��̽����� ���ݾ� �޶�����.
			String user = "hello";
			String pw = "hello";
			Connection con = DriverManager.getConnection(url, user, pw);
			/*
			 	��ó�� ������ �ϰ� �Ǹ� �����ڸ� �����ϴ� ������ �����ϴµ�
			 	�� ������ �����ϴ� Ŭ������ �ٷ� Connection �̴�.
			 	
			 	��������� �����ͺ��̽��� ���� ���ݾ� ������ �޶����� �κ��̴�.
			 	
			 	���ĺ��ʹ� �׻� ������ ������� JDBC���� ����� ������
			 	JDBC�� �ش� DBMS���� ����� �����Ѵ�.
			 */
			JOptionPane.showMessageDialog(null, "*** ����Ŭ ���� �Ϸ� ***");
			
			//���� ����Ŭ�� ���ӵ� �Ǿ��� ���� ���� ����� ��������.
			//3. Statement �����
			Statement stmt = con.createStatement();
			
			//4. ���� ����� �����
			ArrayList<String> avtList = new ArrayList<String>(); 
			avtList.add("INSERT INTO avatar VALUES(11, 'img_avatar1.png', 'img_avatar1.png', 'M')");
			avtList.add( "INSERT INTO avatar VALUES(12, 'img_avatar2.png', 'img_avatar2.png', 'M')");
			avtList.add( "INSERT INTO avatar VALUES(13, 'img_avatar3.png', 'img_avatar3.png', 'M')");
			avtList.add( "INSERT INTO avatar VALUES(14, 'img_avatar4.png', 'img_avatar4.png', 'M')");
			avtList.add( "INSERT INTO avatar VALUES(15, 'img_avatar5.png', 'img_avatar5.png', 'F')");
			avtList.add( "INSERT INTO avatar VALUES(16, 'img_avatar6.png', 'img_avatar6.png', 'F')");
			
			String sql1 = "INSERT INTO member VALUES(1000, '������', 'whw', '12345', 'whw@in', 'M', '010-3175-9042', 11, 'Y')";
			String sql2 = "INSERT INTO member VALUES(1001, '������', 'euns', '12346', 'euns@in', 'M', '010-4721-6527', 11, 'Y')";
			String sql3 = "INSERT INTO member VALUES(1002, '�ֵο�', 'dDragon', '12347', 'euns@in', 'M', '010-9999-9999', 11, 'Y')";
			
			// ���� Statement�� ���� ����� �Ǿ ��������
			/*
			int cnt = 0;
			 for(int i = 0; i< avtList.size(); i++) {
				 cnt += stmt.executeUpdate(avtList.get(i));
			 }
			 JOptionPane.showMessageDialog(null, "�Էµ� ������ �� :"  + cnt);
			 */
			/*
			 stmt.execute(sql1);
			 stmt.execute(sql2);
			 stmt.execute(sql3);
			 */
			 //ȸ���� �߰��غ���.
			
			String sql4 = "SELECT mon, name, id, pw, FROM member WHERE mno = 1000";
			ResultSet rs = stmt.executeQuery(sql4);
			//���� �۾����� BOF �̹Ƿ� ���� ������ ����ִ� ������ ���� ������ �Ѵ�.
			rs.next();
			/*
			int mno = rs.getInt(1);
			String name = rs.getString(2);
			String mid = rs.getString(3);
			String mpw = rs.getString(4);
			String mail = rs.getString(5);
			String gen = rs.getString(6);
			String tel = rs.getString(7);
			int ano = rs.getInt(8);
			char isshow = rs.getString(9).charAt(0);
			*/

			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("mail");
			String gen = rs.getString("gen");
			String tel = rs.getString("tel");
			int ano = rs.getInt("a");
			char isshow = rs.getString("status").charAt(0);
			
			JOptionPane.showMessageDialog(null, name +"������ ���� \n ȸ����ȣ :" + mno + 
				"\nȸ�����̵� :" + mid + "\nȸ����� : " + mpw + "\nȸ������ :" + mail + 
				"\nȸ�� ���� : " + gen + "\nȸ����ȭ : " + tel + "\n�ƹ�Ÿ��ȣ :" + ano + 
				"\nȰ�� ���� :" + ((isshow == 'Y') ? "Ȱ���� " : "Ż��ȸ��")
			);
			/*
			 if(bool) {
				JOptionPane.showMessageDialog(null, "*** ���� ��� ���� ���� ***");
			 }else {
				 JOptionPane.showMessageDialog(null, "*** ���� ��� ���� ���� ***");
			 }
			 */
			/*
			String dsql = "TRUNCATE TABLE MEMBER";
			
			stmt.execute(dsql);
			*/
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			
		}
	}

	public static void main(String[] args) {
		new Test01();

	}

}
