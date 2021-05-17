/*
Ramu is fond of playing with strings. He is given a string and some numbers 'n' ( 0<= n <strlength())
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
Example 3:
Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"
*/

import java.util.*;

class fs27_2
{
	static void characterSequence(String s,int[] arr)
	{
		char[] res = new char[s.length()]; 
		for(int i=0;i<arr.length;i++)
		{
			res[arr[i]]=s.charAt(i);
		}
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[s.length()];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		characterSequence(s,arr);
	}
}