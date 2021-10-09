package org.emp;

public class Employee_Details {
	public void empId() {
		System.out.println("employee id is : 101");
	}
	public void empName(){
		System.out.println("employee name is : Mahendran");
	}
	public void empDob(){
		System.out.println("employee dob is :10/02/1998");
	}
	public void empPhone() {
		System.out.println("employee phone :9889655342");
	}
	public void empEmail() {
		System.out.println("employee email is : mahendran@gmail.com");
	}
	public void empAddress() {
		System.out.println("empadress is : 1 main street dpm");
	}
	
	public static void main(String[] args) {
		System.out.println("creating a employee details");
		Employee_Details emp=new Employee_Details();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empEmail();
		emp.empAddress();
		emp.empPhone();
	}
	

}
