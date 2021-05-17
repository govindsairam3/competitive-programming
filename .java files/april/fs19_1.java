/*
Somesh is working on Number Strings.
He got an idea to find the smallest possible number by 
deleting some digits from the number without changing 
the relative order of digits in it.

You will be given a integer String 'num', and an integer n.
Find the smallest number possible after deleting n digits from 'num'.

Note: If the number string 'num' turns to empty, print 0.

Input Format:
-------------
Line-1 : A string num, consist of digits only.
Line-2 : An integer n, number of digits to delete.

Output Format:
--------------
Print the smallest possible number.


Sample Input-1:
---------------
1432219
3

Sample Output-1:
----------------
1219

Explanation: 
------------
Delete the three digits 4, 3, and 2 to form the smallest number 1219.

Sample Input-2:
---------------
10200
1

Sample Output-2:
----------------
200

Explanation:
------------
Delete the leading 1 and the smallest number is 200. 
Note that the output must not contain leading zeroes.
*/

import java.util.*;

class fs19_1
{
	static void NumberString(String s,int a)
	{
		int maxi=Integer.MAX_VALUE;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length()-a;i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(j>=i && j<i+a)
					continue;
				else
					sb.append(s.charAt(j));
			}
			int val=Integer.parseInt(sb.toString());
			sb = new StringBuilder();
			if(val<maxi)
				maxi=val;
		}
		System.out.println(maxi);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String N = s.nextLine();
		int di = s.nextInt();
		NumberString(N,di);
	}
}