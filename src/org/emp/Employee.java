package org.emp;

public class Employee {
	private void empId() {
		System.out.println("My id is :1234");
	}
	private void empName() {
		System.out.println("kodamkkam");
	}
	private void empDob() {
		System.out.println("2/01/89");
	}
	private void empPhone() {
		System.out.println("72716");
	}
	private void empEmail() {
		System.out.println("mega@gmail.com");
	}
	private void empAddress() {
		System.out.println("nnai");
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
