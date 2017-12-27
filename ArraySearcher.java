public class ArraySearcher
{
	public static int binarySearch(int[]a, int target, int first, int last)
	{
	int result;
	if(first>last)
		result=-1;
	else
	{
	int mid=(first+last)/2;
	if(target==a[mid])
		result=mid;
	else if(target<a[mid])
	result=binarySearch(target, first,mid-1);
	else
	result=binarySearch(target,mid+1,last);
	}
	return result;
	}
	public static int sequentialSearch(int[]a, int target)
	{
	for(int i=0; i<a.length;i++)
		if(a[i]=target)return i;
		break;
	}
}
