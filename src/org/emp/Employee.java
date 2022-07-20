package org.emp;

public class Employee {
	private void empId() {
		System.out.println("My id is :1234");
	}
	private void empName() {
		System.out.println("kodamkkam");
	}
	private void empDob() {
		System.out.println("29/05/1989");
	}
	private void empPhone() {
		System.out.println("90472716");
	}
	private void empEmail() {
		System.out.println("mega@gmail.com");
	}
	private void empAddress() {
		System.out.println("chennai");
	}

	public static void main(String[] args) {
		Employee a = new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();

	}

}
