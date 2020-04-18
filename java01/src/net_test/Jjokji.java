package net_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class Jjokji {
	// �̸��� �˷��ָ� �ּҸ� ã�Ƴ��� ��
	// �ּҸ� �˷��ָ� �̸��� ã�Ƴ��� ��
	Properties nameToIp, ipToName;
	JList list;
	JButton senB;
	JFrame frame;
	
	DatagramSocket sSoket, rSoket;
	/*
	 	������ �ϳ��� ������ ������� �ޱ⸦ �� �� �ִ�.
	 	�׷��� ������ ������ ��쿡�� ������ ���߿� �ޱ�� ���Ѵ�.
	 	���� ������ ����� ���ؼ� 
	 	������ ���ϰ� �޴� ������ �����ؼ� ó���ϴ� ���� ����.
	 */
	public Jjokji() {
		setMap();
		System.out.println("������ IP :" + nameToIp.get("������"));
	}
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		//�츮�� �����͸� ���Ͽ� ������ �߰�
		//������ �ܺ� ��ġ�̴� ��Ʈ���� �ʿ��ϰڴ�.
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/net_test/ip_ko.properties");
			fin2 = new FileInputStream("src/net_test/name_ko.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
			fin1.close();
			fin2.close();
		} catch(Exception e) {}
	}
}
	public static void main(String[] args) {
		new Jjokji();
	}

}
