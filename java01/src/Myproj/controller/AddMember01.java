package Myproj.controller;

import Myproj.DAO.*;
import Myproj.VO.*;
import java.util.*;
import javax.swing.*;
public class AddMember01 {
/*
	ALTER TABLE
    member
add(
    joinDate Date DEFAULT sysdate
    CONSTRAINT MEMB_JOIN_NN NOT NULL
);
    
	
 */
	public AddMember01() {
		//ȸ�� �Ѹ��� �߰��� ����
		//ȸ�� �����ʹ� VO�� ��Ƽ� �Ѱ��ֱ�� ��������Ƿ� VO�� �غ��Ѵ�.
		
		Member mVO = new Member();
		mVO.setOriname("������");
		mVO.setId("whw");
		mVO.setPw("12346");
		mVO.setMail("whw@incre");
		mVO.setGen("M");
		mVO.setTel("010-4721-6527");
		mVO.setAno(11);
		
		//�����ʹ� �غ� �Ǿ�����
		//�����ͺ��̽� ó���Լ��� ȣ�����ش�.
		MemberDAO mDao = new MemberDAO(); 
		
		//�����ͺ��̽� ó���Լ��� ȣ�����ش�.
		int cnt = mDao.addMember(mVO);
		
		if(cnt == 1) {
			JOptionPane.showMessageDialog(null, mVO.getOriname() + "���� �����߽��ϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, mVO.getOriname() + "���� ������ �����Ǿ����ϴ�.");
		}
	}

	public static void main(String[] args) {
		new AddMember01();

	}

}
