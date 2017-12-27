public class Employee
{	private String name;
	private double salary;

	public Employee()
	{
		name="";
		salary=0.0;
	}
	public String getName()
	{return name;}
	public double getSalary()
	{return salary;}
	public void setName(String n){name =n;}
	public void setSalary(double s){salary=s;}
	public boolean equals(Employee other)
	{
	if ((name.equalsIgnoreCase(other.name)) && (Math.abs(salary-other.salary)<0.01))
	return true;
	else
	return false;
	}
}



