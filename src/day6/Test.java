package day6;

public class Test {
	public static void main(String[]args) {
		//data type is student
		//variable is student1
		//create an object of student class and
		//save it under reference variable
	Student	student1 =new Student();
	student1.sid=1001;
	student1.name="David";
	student1.grade='A';
	student1.printStudentData();
	String s = new String("welcome");
	s.length();
	s.replace("W", "x");
	/*
	Emplyee emp1= new Emplyee();
	emp1.eid= 7001;
	emp1.name= "smith";
	emp1.department= "finance";
	emp1.salary= 13000;
	
	emp1.display();
	*/
	
	new Emplyee().name= "sravani";
	new Emplyee().eid=800;
	new Emplyee().department= "qality Aassurance";
	new Emplyee().salary =125000;
	new Emplyee().display();
	
	
	
		
	}

}
