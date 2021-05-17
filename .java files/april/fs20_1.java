/*
Mounika is creating the binary strings using P 1's and Q 0's.
A binary string contains only 0's and 1's.
She has given a list of binary strings binStr[] to be formed.

Her task is to find, the maximum number of binary strings can be formed, 
with given P 1's and Q 0's only. She cannot use any more 1's or 0's.

Input Format:
-------------
Line-1 -> A single line of space separated binary strings, binStr[].
Line-2 -> Two integers P and Q, P number of 1's and Q number of 0's


Output Format:
--------------
Print an integer as output, maximum number of binary strings can be formed.


Sample Input-1:
---------------
10 0001 111001 1 0
1 0 10 0001 111001
3 5

Sample Output-1:
----------------
4

Explanation:
------------
She can form 4 strings by the using of 3 1's and 5 0's
strings are 10, 0001, 1, 0.


Sample Input-2:
---------------
10 1 0
1 1

Sample Output-2:
----------------
2

Explanation:
------------
She can form 2 strings by the using of 1 1's and 1 0's
strings are 1, 0.
*/

import java.util.*;

class fs20_1
{
	public static void binary(String[] arr,int O,int Z)
	{
		//int zero=0,one=0;
		int tCount=0;
		first:for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length();j++)
			{
				if(arr[i].charAt(j)=='0')
					O--;
					//zero++;
				else
					Z--;
					//one++;
			}
			if(O<0 || Z<0)
				break first;
			else
				tCount++;
			//System.out.println(O+" "+Z);
			
		}
		System.out.println(tCount);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String[] arr = s.nextLine().split(" ");
		int zero = s.nextInt();
		int one = s.nextInt();
		Arrays.sort(arr,(ar1,ar2)->ar1.length() - ar2.length());
		binary(arr,one,zero);
		//System.out.println(Arrays.toString(arr));
	}
}