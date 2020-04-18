package net_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
public class Jjokji {
	// 이름을 알려주면 주소를 찾아내는 맵
	// 주소를 알려주면 이름을 찾아내는 맵
	Properties nameToIp, ipToName;
	JList list;
	JButton senB;
	JFrame frame;
	
	DatagramSocket sSoket, rSoket;
	/*
	 	소켓은 하나만 가지고도 보내기와 받기를 할 수 있다.
	 	그런데 문제는 보내는 경우에는 보내는 도중에 받기는 못한다.
	 	따라서 안전한 통신을 위해서 
	 	보내는 소켓과 받는 소켓을 구분해서 처리하는 것이 좋다.
	 */
	public Jjokji() {
		setMap();
		System.out.println("전은석 IP :" + nameToIp.get("전은석"));
	}
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		//우리는 데이터를 파일에 저장을 했고
		//파일은 외부 장치이니 스트림이 필요하겠다.
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
