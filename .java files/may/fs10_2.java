/*
Krishna is working on strings, He is trying to modify the string 
which has to be first in lexicographic order.
You can modify the string using following operations:
	- Interchnage the characters at the given pair of indices.
	- You can perform the interchange of the pair any number of times.
	- You will be given I number of pairs

Example: 
--------
If pair is ->[i,j], you can interchange the characters at i-th and j-th indices
with each other.

Krishna is given a String S, an integer I and I pairs of indices.
Can you help Krishna to find the string that can be formed 
after performing interchange operations, which has to be first in the
lexicographical order.

Note: String contains only lowercase letters.

Input Format:
-------------
Line-1: A string S
Line-2: An integer I, number of interchanges.
Next I lines: Two space separated integers, interchange pair.

Output Format:
--------------
A string, lexicographic smallest string after the interchanges


Sample Input-1:
---------------
cba
2
0 1
1 2

Sample Output-1:
----------------
abc

Explaination: 
-------------
Interchange s[0] and s[1], s = "bca"
Interchange s[1] and s[2], s = "bac"
Interchange s[0] and s[1], s = "abc"

Sample Input-2:
---------------
dcab
2
0 3
1 2

Sample Output-2:
----------------
bacd

Explaination: 
-------------
Interchange s[0] and s[3], s = "bcad"
Interchange s[1] and s[2], s = "bacd"

Sample Input-3:
---------------
dcab
3
0 3
1 2
0 2

Sample Output-3:
----------------
abcd

Explaination: 
-------------
Interchange s[0] and s[3], s = "bcad"
Interchange s[0] and s[2], s = "acbd"
Interchange s[1] and s[2], s = "abcd"
*/


import java.util.*;

class fs10_2
{
	public static void swapChar(String s,int[] a,int[] b)
	{
		boolean res = check(String s,int[] a,int[] b)
		//char l = s.charAt(a[i]);
		//char m = s.charAt(b[i]);
		if(!res)
		{
			System.out.print(s);
			return ;
		}
		
		for(int k=0;k<a.length;k++)
			char l = s.charAt(a[k]);
			char m = s.charAt(b[k]);
			if(l>m)
				char temp = s.charAt();
				s.replace(temp,s.charAt());
				swapChar(s,a,b);
		
		return ;
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int I = sc.nextInt();
		int sw1[][] = new int[0][I];
		
		for(int i=0;i<I;i++)
		{
			int sw2[] = new int[I];
			sw1[i] = sc.nextInt();
			sw2[0][i] = sw1;
		}
		swapChar(N,sw1);
		
	}
}