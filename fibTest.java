import java.util.Scanner;
public class fibTest
{
	public static void main (String[]args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Please enter a number.");
		int n=kb.nextInt();
		System.out.println(fib(n));
			
	}
public static int fib(int n)
{
if(n<=1)
return 1;
else
return fib(n-1)+fib(n-2);
}
}
