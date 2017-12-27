import java.util.Scanner;
public class binarySearchTest
{
public static void main (String[]args)
{
Scanner kb=new Scanner(System.in);
System.out.println("enter a sequence of numbers in chron order");
int[]measures={1,2,3,4,5,6};
System.out.println(binarySearch.binarySearch(measures,2,1,6));
System.out.println(binarySearch.binarySearch(measures,8,1,6));
}
}
