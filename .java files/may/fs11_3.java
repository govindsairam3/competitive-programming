/*
There are row of buildings 

The civil engineer planned to construct the buildings in ascending order of their heights, 
but there is a group of contiguous buildings not constructed according to the plan, 
remove such group of buildings from that row of buildings (can be empty), 
so the buildings in the row are in sorted order of their heights.

Help Civil Engineer to return the number of buildings in such group 

Sample Input-1:
---------------
8
2 3 5 12 2 4 5 7

Sample Output-1:
----------------
3

Explanation:
------------
The minimum group of builings in a row, you can remove is [5, 12, 2] or 
[12, 2, 4]  of length 3. 
 - the remaining buildings with the heights after removal will be [2, 3, 4, 5, 7],
 OR [2, 3, 5, 5, 7], which are in ascending order.


Sample Input-2:
---------------
6
9 7 5 4 2 1

Sample Output-2:
----------------
5

Explanation:
------------
The minimum group of builings in a row, you can remove is [7, 5, 4, 2, 1] or  
[9, 7, 5, 4, 2]  of length 5. 
*/


import java.util.*;

class fs11_3
{
	static int check(int[] ar,int i,int count)
	{
		int temp =0;
		if(i>1)
			temp= ar[i-1];
		else
		{
			count=2;
			temp =ar[i];
		}
		
		for(int k=i;k<ar.length-1;k++)
		{
			if(ar[k]<temp)
				count++;
		}
		return count;
	}
	static int civilEngg(int N,int[] ar)
	{
		
		for(int i=1;i<N;i++)
		{
			if(ar[i]<ar[i-1])
			{
				return check(ar,i,0);					
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++)
			arr[i] = sc.nextInt();
		System.out.println(civilEngg(N,arr));
	}
}