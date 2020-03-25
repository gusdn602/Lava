package day12;

public class Student {
	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		
		return java;
	}
	public void setJava(int java) {
		this.java = (int)(Math.random() * (100-1+1)+1);
		
	}
	public int getDb() {
		
		return db;
	}
	public void setDb(int db) {
		this.db = (int)(Math.random() * (100-1+1)+1);
	}
	public int getHtml() {
		
		return html;
	}
	public void setHtml(int html) {
		this.html = (int)(Math.random() * (100-1+1)+1);
	}
	public int getJs() {
		
		return js;
	}
	public void setJs(int js) {
		this.js = (int)(Math.random() * (100-1+1)+1);
	}
	public int getCss() {
		
		return css;
	}
	public void setCss(int css) {
		this.css = (int)(Math.random() * (100-1+1)+1);
	}
	
	
	
	
	
}
