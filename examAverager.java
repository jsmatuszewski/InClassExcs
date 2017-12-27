import java.util.Scanner;
public class examAverager
{
	public static void main (String[]args)
	{
		System.out.println("This program computes the average of");
		System.out.println("a list on (nonnegative) exam scores");
		double sum;
		int numOfStudents;		
		double next;
		String answer;
		Scanner keyboard =new Scanner (System.in);
		do
		{
			System.out.println();
			System.out.println("Enter all of the scores to be averaged:");
			System.out.println("Enter a negative number after");
		System.out.println("you have entered all of the scores");
		sum=0;
		numOfStudents=0;
		next=keyboard.nextDouble();
		while(next>=0)
			{
			sum = sum+next;
			numOfStudents++;
			next=keyboard.nextDouble();
			}
			if(numOfStudents>0)
			System.out.println("The average is "+(sum/numOfStudents));
			else 
				System.out.println("No scores to average.");
			System.out.println("Want to average another exam?");
			System.out.println("Yes or No");
			answer=keyboard.next();
		}
		while(answer.equalsIgnoreCase("yes"));
		
	}

}
