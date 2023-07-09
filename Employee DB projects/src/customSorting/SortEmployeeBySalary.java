package customSorting;

import java.util.Comparator;

import Dbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		Double i=x.getSalary();
		Double j=y.getSalary();
		return i.compareTo(j);
	}

}
//return x.getsSalary().compareTo(y.getSalary());->getSalary() return Double