import java.util.*;
class arrSort
{
	static int recurArrSort(int[] arr,int i,int j)
	{
		if(i==j)
			return arr[i];
		else
			if(arr[i]>arr[j])
				return recurArrSort(arr,i,j-1);
			else
				return recurArrSort(arr,i+1,j);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		System.out.println(recurArrSort(arr,0,size-1));
	}
}