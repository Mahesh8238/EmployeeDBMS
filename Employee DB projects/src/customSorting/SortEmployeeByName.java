package customSorting;

import java.util.Comparator;

import Dbms.Employee;

public class SortEmployeeByName implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		return x.getName().compareTo(y.getName());
	}

}
