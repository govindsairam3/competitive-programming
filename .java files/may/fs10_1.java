/*
Ramu is given some rows and columns of numbers which contain 
only '1' and '0'. Now his madam gave him a task to find the square 
in the given matrix which contains only's 1 and he has to return the area 

Input 
5 5
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
output = 4

Explanation :
The Second row third column froms the square matrix whose area is 4

Input 
3 4
1 1 1 0
1 1 1 0
1 1 1 0
output = 9 
*/

import java.util.*;
import java.math.*;

class fs10_1
{
	static void onesSubMatrix(int[][] arr,int r,int c)
	{
		int maxi = 0;
		int[][] sol = new int[r][c];
		for(int i=0;i<r;i++)
			sol[i][0] = arr[i][0];
		
		for(int j=0;j<c;j++)
			sol[0][j] = arr[0][j];
		
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				if(arr[i][j]==1)
				{
					sol[i][j] = Math.min(sol[i][j-1],Math.min(sol[i-1][j-1],sol[i-1][j]))+1;
					if(maxi<sol[i][j])
						maxi = sol[i][j];
				}
			}
		}
		for(int i=0;i<r;i++)
			System.out.println(Arrays.toString(sol[i]));
		System.out.println(maxi*maxi);
	}
	public static void main(String args[])
	{
		//for square matrix only!!
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] ar = new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ar[i][j]=sc.nextInt();
		onesSubMatrix(ar,r,c);
	}
}


/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.

Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
*/