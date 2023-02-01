package com.arraysmethod;

public class ObjectArrays {
	int objectNo;
	
	public ObjectArrays(int objectNo) {
		super();
		this.objectNo = objectNo;
	}



	public static void main(String[] args)   {
		ObjectArrays a1=new ObjectArrays(1);
		ObjectArrays a2=new ObjectArrays(2);
		ObjectArrays a3=new ObjectArrays(3);
		ObjectArrays a4=new ObjectArrays(4);
		ObjectArrays Objectarrays[]= {a1,a2,a3,a4};
	
	
	}
	}