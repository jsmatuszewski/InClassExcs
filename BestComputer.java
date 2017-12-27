import java.util.*;
public class BestComputer
{
public static void main(String[]args)
{
	Scanner kb=new Scanner(System.in);
	String bestModel="", nextModel="", ans="";
	double bestPrice=0.0, nextPrice=0.0;
	int bestScore=0, nextScore=0;
	boolean done=false;
	while (!done)
	{
	System.out.println("Enter a model name, price and score:");
	nextModel=kb.next();
	nextPrice=kb.nextDouble();
	nextScore=kb.nextInt();
	if(bestPrice==0 || nextScore/nextPrice>bestScore/bestPrice)
	{
	bestModel=nextModel;
	bestPrice=nextPrice;
	bestScore=nextScore;
	}
	System.out.println("More data? (y/n)");
	ans=kb.next();
	if(ans.equalsIgnoreCase("n")) done=true;
	}
	System.out.println("The best computer is"+bestModel);
}
}

