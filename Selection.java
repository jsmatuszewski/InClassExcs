import java.util.*;
public class Selection
{
public static int smallestIndex(int[] a, int StartIndex)
{
int min=a[StartIndex];
int minIndex=StartIndex;
for(int i=StartIndex+1;i<a.length;i++)
	{
	if(a[i]<min)
	{
	min=a[i];
	minIndex=i;
	}
	}
	return minIndex;
}

public static void swap(int[]a,int i,int j)
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}

public static void sort(int[]a)
{
for(int i=0;i<a.length-1;i++)
{int nextMinIndex=smallestIndex(a,i);
if(i!=nextMinIndex)
swap(a,i,nextMinIndex);}
}

}
