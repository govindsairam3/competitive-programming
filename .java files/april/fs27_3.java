/*
You are given a string allowed consisting of distinct characters and an array of strings words.

A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

If it not appears then print 0

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

The first line of input contains the array of words followed by "allowed" word  

*/

import java.util.*;

class fs27_3
{
	static void check(char[] allow,String[] words)
	{
		int res=0;
		List<Character> lit = new ArrayList<>();
		for(int i=0;i<allow.length;i++)
			lit.add(allow[i]);
		for(int i=0;i<words.length;i++)
		{
			int cnt=0;
			for(int j=0;j<words[i].length();j++)
			{
				if(lit.contains((Object)words[i].charAt(j)))
				{
					cnt++;
				}
			}
			if(cnt==words[i].length())
				res++;
		}
		System.out.println(res);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String words[] = sc.nextLine().split(" ");
		String allow = sc.next();
		check(allow.toCharArray(),words);
	}
}