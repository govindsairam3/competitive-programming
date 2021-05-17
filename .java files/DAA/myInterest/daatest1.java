/*
There are N persons standing in a line, all of them stands in ascending order 
of their heights, You are given heights of N persons in an array, 
and also you are given an height H.

Your task is to find the height of the person, nearest to H.

Input Format:
-------------
Line-1: Two space separated integers, N and H.
Line-2: N space separated integers, heights of N persons.

Output Format:
--------------
Print an integer, nearest height of H.


Sample Input-1:
---------------
6 5
2 4 7 8 9 10

Sample Output-1:
----------------
4


Sample Input-2:
---------------
8 4
2 3 5 6 7 8 9 10

Sample Output-2:
----------------
6

Explanation:
------------
both 3 and 5 are nearest heights,
you have to print max height in such case.

*/

import java.util.*;
import java.math.*;

class daatest1
{
	static void findHeight(int key,int[] arr)
	{
		int first = 0;
		int last =arr.length;
		while(first<=last)
		{
			int mid=(first+last)/2;
			int fval=Math.abs((arr[mid-1]-key));
			int mval=Math.abs((arr[mid]-key));
			int lval=Math.abs((arr[mid+1]-key));
			if(mval<=fval && mval<=lval)
			{
				System.out.println(arr[mid]);
				break;
			}
			if(fval<mval)
				last=mid-1;
			else if(lval<mval)
				first=mid+1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int find = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		findHeight(find,arr);
	}
}
