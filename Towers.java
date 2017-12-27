import java.util.Scanner;
public class Towers
{
public static void TH(int count, String source, String space, String desti)
	{
	if(count==1)
	System.out.println("Move your disk from "+source+" to "+desti+".");
	else
	{TH(count-1, source, desti, space);
	 TH(1, source, space, desti);
	 TH(count-1, space, source,desti);}
	}
public static void main(String[]args)
	{
	Scanner kb=new Scanner(System.in);
	System.out.println("Input a number of disks.");
	int count=kb.nextInt();
	TH(count,"A","B","C");
	}
}
