package org.emp;

public class EmployeeOverload {
	public void empId(int num) {
		System.out.println(num);
	}
	public void empId(byte id) {
		System.out.println(id);
	}
	public void empId(short idno) {
	}
	public void empId(long idno) {
	}
	public void empId(float a, int num) {
		System.out.println(a);
		System.out.println(num);
	}
	public void empId(double num) {
	}
	public static void main(String[] args) {
		EmployeeOverload e = new EmployeeOverload();
		e.empId(9);
		e.empId(33);
		e.empId(5678);
		e.empId(97865);
		e.empId(567, 6754);
		e.empId(3456354);
		
	}
}
