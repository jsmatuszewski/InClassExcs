import java.util.*;
public class SelectionTest
{
public static void main(String[]args)
{
int[]test={9,7,11,12,2};
SelectionSort.sort(test);
int i=0;
do{
System.out.println(test[i]);
i++;}
while (i<test.length);
}
}
