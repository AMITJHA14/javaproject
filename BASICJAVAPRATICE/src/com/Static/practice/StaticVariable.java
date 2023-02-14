package com.Static.practice;

public class StaticVariable {
	int studentid;
	double studentpercent;
	String studentname;
	static String collegename = "sindhu";
	 
	//defaultconstructor
	
	public StaticVariable() { 
		System.out.println("iam a constructor");
	}
	
//     Prameterized constructor
	public StaticVariable(int studentid, double studentpercent, String studentname) {
		super();
		this.studentid = studentid;
		this.studentpercent = studentpercent;
		this.studentname = studentname;
	}
	public static void caption() {
		System.out.println("this is my code");
		System.out.println("this is my programme");
	}

	@Override
	public String toString() {
		return "StaticVariable [studentid=" + studentid + ", studentpercent=" + studentpercent + ", studentname="
				+ studentname +", collegename=" + StaticVariable.collegename +"]";
	}

	public static void main(String[] args) {
		StaticVariable College1=new StaticVariable(1,99.9,"Amit");
		System.out.println(College1);
		StaticVariable College2=new StaticVariable(2,99.9,"shubham");
		System.out.println(College2);
		StaticVariable College3=new StaticVariable(3,99.9,"vishal");
		System.out.println(College3);
		StaticVariable College4=new StaticVariable(4,99.9,"vivek");
		System.out.println(College4);
		StaticVariable College5=new StaticVariable(5,99.9,"pratik");
	    System.out.println(College5);
	    College5.caption();
	    StaticVariable.caption();
	    
	}
}
