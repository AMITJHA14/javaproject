package com.objectpractice;

public class objectmethod {
	int studentrollno;
    double studentmarks;
    String studentname;
	
    
    public objectmethod(int studentrollno, double studentmarks, String studentname) {
		super();
		this.studentrollno = studentrollno;
		this.studentmarks = studentmarks;
		this.studentname = studentname;
	}
    
    @Override
	public String toString() {
		return "objectmethod [studentrollno=" + studentrollno + ", studentmarks=" + studentmarks + ", studentname="
				+ studentname + "]";
	}



	public static void main(String[] args) {
		objectmethod am=new objectmethod(14,99.9 ,"amit"  );
		System.out.println(am.toString());
		objectmethod pm=new objectmethod(13,99.9 ,"shubham"  );
		System.out.println(pm.toString());
	}





	

}
