package org.emp;

public class Employee {
	private void empId() {
		System.out.println("My id is ");
	}
	private void empName() {
		System.out.println("koda");
	}
	private void empDob() {
		System.out.println("29");
	}
	private void empPhone() {
		System.out.println("90");
	}
	private void empEmail() {
		System.out.println("mega");
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
