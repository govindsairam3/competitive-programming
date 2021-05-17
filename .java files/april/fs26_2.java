/*
Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "hello"
Output: 0

Example 2:

Input: s = "ississipi"
Output: 7

Example 3:

Input: s = "aabb"
Output: -1
*/

import java.util.*;

class fs26_2
{
	static int firstNonRepeat(String s)
	{
		char b='\u0000';
		HashMap<Character,Integer> result = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			result.put(a,result.getOrDefault(a,0)+1);
		}
		for(Map.Entry<Character,Integer> entry : result.entrySet())
		{
			if(entry.getValue()==1)
			{
				b=entry.getKey();
				break;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(b==s.charAt(i))
				return i;
		}
		return -1;
	}
	public static void main(String args[])
	{
		String s = new Scanner(System.in).next();
		int index=firstNonRepeat(s);
		if(index==-1)
			System.out.println("-1");
		else
			System.out.println(index);
		
		//(firstNonRepeat(s)==-1)?System.out.println("-1"):System.out.println(index);
	}
}