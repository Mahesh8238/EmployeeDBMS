package customSorting;

import java.util.Comparator;

import Dbms.Employee;

public class SortEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		// TODO Auto-generated method stub
		return x.getId().compareTo(y.getId());
	}

}
