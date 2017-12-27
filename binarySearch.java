public class binarySearch
{
	public static int binarySearch(int[]a, int target, int first, int last)
	{
	int result;
	if(a[first]>a[las]t)
		result=-1;
	else
	{
	int mid=(first+last)/2;
	if(target==a[mid])
		result=mid;
	else if(target<a[mid])
	result=binarySearch(a,target, first,mid-1);
	else
	result=binarySearch(a,target,mid+1,last);
	}
	return result;
	}
}
