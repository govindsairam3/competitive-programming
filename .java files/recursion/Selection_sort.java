import java.util.*;

class Selection_sort
{
	int minIndex(int[] arr,int s,int l)
	{
		int max=Integer.MAX_VALUE;
		int min=0;
		for(int i=s;i<l;i++)
		{
			if(max>arr[i]-'0')
			{
				max=arr[i]-'0';
				min=i;
			}
		}
		return min;
	}

	String[] array_sort(String[] arr,int start,int last)
	{
		if(start>=last)
			return arr;
		int min;
		String temp;
		min=minIndex(arr,start,last);
		temp=arr[start];
		arr[start]=arr[min];
		arr[min]=temp;
		//arr[start]=arr[start]-arr[min];
		//arr[min]=arr[start]+arr[min];
		//arr[start]=arr[min]-arr[start];
		return array_sort(arr,start+1,last);
	}
	/*
	5 11
	a=a-b;//-6 11
	b=a+b;//-6 5
	a=b-a;//11 5
	*/
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String[] N=s.nextInt().split(" ");
		
		Selection_sort obj = new Selection_sort();
		long stime=System.currentTimeMillis();
		System.out.println(Arrays.toString(obj.array_sort(arr,0,arr.length-1)));
		long etime=System.currentTimeMillis();
		System.out.println(etime-stime+"milli seconds taken!!");
	}
}