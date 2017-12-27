import java.util.*;
public class BubbleSortTest
{
public static void main(String[]args)
{
int[]test={9,7,11,12,2};
BubbleSort.bubbleSort(test);
int i=0;
do{
System.out.println(test[i]);
i++;}
while (i<test.length);
}
}


