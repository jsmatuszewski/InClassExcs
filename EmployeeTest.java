public class EmployeeTest
{
	public static void main (String[]args)
	{	String n1="David";
		double s1= 65000;
		String n2="David";
		double s2=65000;
		Employee e1= new Employee();
		e1.setName(n1);
		e1.setSalary(s1);
		String n3= e1.getName();
		Employee e2= new Employee();
		e2.setName(n2);
		e2.setSalary(s2);
		if(e1.equals(e2))
		System.out.println("They are the same records.");
		else
		System.out.println("They are different records.");
		System.out.println("The employee has the name \""+n2+"\" and a salary of $"+e1.getSalary());
	
	}
}

