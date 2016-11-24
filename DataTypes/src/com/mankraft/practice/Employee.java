package com.mankraft.practice;

class Employee {
	String eid="E-101";
	String ename="kumar";
	float esal=50000.0f;
	String eadd="hyd";
	String email="b.kiritikumar@gmail.com";
	String emobile="91-9014078538";
	public void displyEmpDetails()
	{
		System.out.println("employee id:"+eid);
		System.out.println("employee Name:"+ename);
		System.out.println("employee salary:"+esal);
		System.out.println("employee Address:"+eadd);
		System.out.println("employee email:"+email);
		System.out.println("employee mobile:"+emobile);
	}
}
class Test
{
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.displyEmpDetails();
	}
}