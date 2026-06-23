package javaLearning1;

public class Employee{
   int empId;
   String empName;
   int empSalary;
   String empProfile;
   
   
   void displayEmp() {
	   System.out.println("Employee ID: "+empId);
	   System.out.println("Employee name: "+empName);
	   System.out.println("Employee Salary: "+empSalary);
	   System.out.println("Employee Designation: "+empProfile);
	   
   }
   Employee(int empId,String empName,int empSalary,String empProfile){
	   
   }
   
   public static void main(String arg[]) {
	   Employee emp1 = new Employee();
	   emp1.empId = 1;
	   emp1.empName = "Prince Jha";
	   emp1.empSalary = 50505;
	   emp1.empProfile = "SDET-1";
	   
	   emp1.displayEmp();
   }
   
}
