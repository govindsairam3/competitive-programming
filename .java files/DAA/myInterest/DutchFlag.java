import java.util.*;

class DutchFlag
{
	static void DNS(int[] arr,int size)
	{
		int mid=0,low=0,high=size-1,temp=0;
		while(mid<=high)
		{
			switch(arr[mid])
			{
				case 0:{
					temp=arr[low];
					arr[low]=arr[mid];
					arr[mid]=temp;
					low++;
					mid++;
					break;
					}
				case 1:{
					mid++;
					break;
				}
				case 2:{
					temp=arr[mid];
					arr[mid]=arr[high];
					arr[high]=temp;
					high--;//mid++;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		sc.close();
		DNS(arr,size);
	}
}