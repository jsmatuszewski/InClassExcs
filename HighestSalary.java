import java.util.Scanner;
public class HighestSalary
{
	public static void main(String[]args)
	{
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter the size of your set.");
	int size=kb.nextInt();
	Employee[]staff=new Employee[size];
	for (int i=0; i<staff.length; i++)
	staff[i]=new Employee();
	for(int i=0; i<staff.length;i++)
	{
	System.out.println("Enter a name followed by a salary:");
	staff[i].setName(kb.next());
	staff[i].setSalary(kb.nextDouble());
	}
	double nextSalary, highestSalary=(staff[0]).getSalary();
	for(int i=1; i<staff.length;i++)
	{
	nextSalary=(staff[i]).getSalary();
	if(nextSalary>highestSalary)
	highestSalary=nextSalary;
	}
	System.out.println(highestSalary);
	}
}

