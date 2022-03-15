package com.anu.practice;
class Machine{
	private String name;
	private int code;
	public Machine() {
		this("Arnie",0);
		
		System.out.println("Constructor running!");
	}
	public Machine(String name) {
		this(name,0);
		
		System.out.println("Second Constructor running!");
	}
		public Machine(String name,int code) {
			System.out.println("Third Constructor running!");
			this.name = name;
			this.code = 519;
		}
	}
	

public class ConstructorExample {
  public static void main(String[] args) {
		
Machine machine1 = new Machine();
Machine machine2 = new Machine("Kk");
Machine machine3 = new Machine("Nikki",10);
	}

}
