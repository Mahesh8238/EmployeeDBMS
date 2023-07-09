package Dbms;

public class Employee {
private String id;
private String name;
private int age;
private double salary;
static int count=101;
public Employee( String name, int age, double salary) {
	super();
	this.id ="JSP"+count;
	this.name = name;
	this.age = age;
	this.salary = salary;
	count++;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
}


}
