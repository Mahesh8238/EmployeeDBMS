package Dbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import customException.EmployeeNotFoundException;
import customException.InvalidChoiceException;
import customSorting.SortEmployeeByAge;
import customSorting.SortEmployeeById;
import customSorting.SortEmployeeByName;
import customSorting.SortEmployeeBySalary;



public class EmployeeMannagementSystemImp2 implements EmployeeMangementSystem {
	Scanner scan=new Scanner(System.in);
	Map<String,Employee> db=new LinkedHashMap<String,Employee>();
	@Override
	public void addEmployee() {
		
		
		System.out.println("Enter employee Name");
		String name=scan.next();
		System.out.println("Enter employee age");
		int age=scan.nextInt();
		System.out.println("Enter employee salary");
		double salary=scan.nextDouble();
		Employee emp= new Employee(name, age,salary);
		db.put(emp.getId(), emp);
		System.out.println("Employee Record Inserted Sucessfully");
		System.out.println("Employee id is"+emp.getId());
		
	
		
	}

	@Override
	public void displayEmployee() {
		System.out.println("enter Employee id:");
		String id=scan.next();
		id=id.toUpperCase();
			if(db.containsKey(id))
			{
				Employee emp=db.get(id);
				System.out.println(id);
				System.out.println("id:"+emp.getId());
				System.out.println("Age"+emp.getAge());
				System.out.println("Name:"+emp.getName());
				System.out.println("Marks:"+emp.getSalary());
				
			}
			else {
				try
				{
					throw new EmployeeNotFoundException("kindaly with"+id+" is not found");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		
			
			
		
		
		
	}

	@Override
	public void displayAllEmployee() {
		System.out.println("Employee details are follws:");
		System.out.println("---------------------");
		Set<String> keys=db.keySet();
		for(String key:keys)
		{
			//Employee obj=db.get(key);
			System.out.println(db.get(key));//System.out.println(db.get(key);
			
		}
     
	}

	@Override
	public void removeEmployee() {
	System.out.println("enter Employee id:");
	String id=scan.next().toUpperCase();
	if(db.containsKey(id))
	{
		System.out.println("Employee Record found");
		System.out.println(db.get(id));
		db.remove(id);
		System.out.println("Employee Record  Deleted Sucessfully");
		
	
	}
	else
	{
		try
		{
			throw new EmployeeNotFoundException("Employee with id "+id+"is not found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	}

	@Override
	public void removeAllEmployee() {
		if(db.size()!=0)
		{
			System.out.println("Availble Employee Record"+db.size());
			db.clear();
			System.out.println("All the student deleted sucessfully");
		}
			else
			{
				try {
					throw new EmployeeNotFoundException("No Student Records do Delete");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
	}

	@Override
	public void updateEmployee() {
		System.out.println("enter student id:");
		String id=scan.next();
		id=id.toUpperCase();
		if(db.containsKey(id))
		{
		 Employee emp=db.get(id);
		 System.out.println("1.update age\n2.Update name\n3:Upates Salary");
		 System.out.println("Enter choice:");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the Employee age");
		 int age=scan.nextInt();
		 emp.setAge(age);
		 System.out.println("Age upated Sucessfully");
		break;
		case 2:
			System.out.println("enter the Employee name");
			 String name=scan.next();
			emp.setName(name);//std.setName(scan.nextInt());
			 System.out.println("name upated Sucessfully");
			break;
		case 3:
			System.out.println("enter the Employee salary");
			 double salary=scan.nextDouble();
			 emp.setSalary(salary);
			 System.out.println("marks upated Sucessfully");
			
			break;
			default:
				try {
					throw new InvalidChoiceException("kindly enter valid choice!");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
		}
		else
		{
			try
			{
				throw new EmployeeNotFoundException("Student with id"+id+" is not found");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void countEmployee() {
			System.out.println("no of Employee"+db.size());
		}


	@Override
	public void sortEmployee() {
		Set<String> keys=db.keySet();
		List<Employee> list=new ArrayList<Employee>();
		for(String key:keys)
		{
			Employee s=db.get(key);
			list.add(s);//list.add(db.get(key));
		}
		System.out.println("1:sort by id\n2:sort by age\n3:Sort by name");
		System.out.println("4:sort by Salary\nenter choice:" );
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(list,new SortEmployeeById());
			display(list);
			break;
		case 2:
			Collections.sort(list,new SortEmployeeByAge());
			display(list);
			
			break;
		case 3:
			Collections.sort(list,new SortEmployeeByName());
			display(list);
			break;
		case 4:
			Collections.sort(list,new SortEmployeeBySalary());
			display(list);
			break;
			default:
				try {
					throw new EmployeeNotFoundException("No Student Records do Delete");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
		}
				private static void display(List<Employee> list)
				{
					for(Employee s:list)
					{
						System.out.println(s);
					}
		
	}

	@Override
	public void getEmployeeWithHighestSalary() {
		 Set<String> keys=db.keySet();
		 List<Employee>list=new ArrayList<Employee>();
		 for(String key:keys)
		 {

			 list.add(db.get(key));
		 }
		 Collections.sort(list,new SortEmployeeBySalary());
		 System.out.println("Student Details with Highest Salary:");
		 System.out.println(list.get(list.size()-1));
			
	}

	@Override
	public void getEmployeeWithLowestsalary() {
		Set<String> keys=db.keySet();
		 List<Employee>list=new ArrayList<Employee>();
		 for(String key:keys)
		 {

			 list.add(db.get(key));
		 }
		 Collections.sort(list,new SortEmployeeBySalary());
		 System.out.println("Student Details with Lowest Salary:");
		 System.out.println(list.get(0));
	}


}
