package Dbms;

import java.util.Scanner;

import customException.InvalidChoiceException;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Database Management System");
		System.out.println("---------------------------------");
	Scanner scan=new Scanner(System.in);
	EmployeeMangementSystem e1=new EmployeeMannagementSystemImp2();
	while(true)
	{
		System.out.println("1.Add Employee\n2.Display Employee\n3.displayAllEmployee\n4.removeEmployee\n5.removeAllEmployee\n6.updateEmployee\n7.countEmployee\n8.sortEmployee\n9.exit\n10.getStudentWithHighestMarks\n11.getStudentWithLowestMarks");
		System.out.println("display the choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			e1.addEmployee();
			break;
		case 2:
			e1.displayEmployee();
			break;
		case 3:
			e1.displayAllEmployee();
			break;
		case 4:
			e1.removeEmployee();
			break;
		case 5:
			e1.removeAllEmployee();
			break;
		case 6:
			e1.updateEmployee();
			break;
		case 7:
			e1.countEmployee();
			break;
		case 8:
			e1.sortEmployee();
			break;
		case 9:
			System.out.println("Thank you");
			System.exit(0);
			break;
		case 10:
			e1.getEmployeeWithHighestSalary();
			break;
		case 11:
			e1.getEmployeeWithLowestsalary();
			break;
			default:
				try{
					//String message="Invalid choice,kindaly enter valid choice";
					//throw new InvalidChoiceException(message);
					throw new InvalidChoiceException("Invalid choice,kindaly enter valid choice");
					
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			
			
		}
		System.out.println("--------------------------");
	}
	

	}

}
