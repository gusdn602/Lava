package Myproj.VO;

import java.sql.*;
import java.text.*;
public class Member {
	private int mno, ano;
	private String oriname, id, pw, mail, tel, gen, avatar, sdate;
	private Date joinDate; //jdbc������ �����ͺ��̽��� ��¥�����͸� �����ö� ��¥�� �ð��� �и��ؼ�  �����;� �Ѵ�.
	private Time joinTime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getOriname() {
		return oriname;
	}
	public void setOriname(String oriname) {
		this.oriname = oriname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate() {
		String str = "";
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm");
		str = form1.format(joinDate) + " " + form2.format(joinTime);
		
		this.sdate = str;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Time getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Time joinTime) {
		this.joinTime = joinTime;
	}
	
	} 
	

