/*
You are given a list of digits( 0 to 9) digits[].
A number is formed using the given order of the list.
for example: given list is [1,3,2], then number is 132.

Find the next biggest number in the lexographic order using 
the same list of digits, by using the each digit in the list only once,
and print the digit list of such biggest number.

If such biggest number is not possible, 
print the smallest lexographic order of the digits.

Input Format:
-------------
Line-1 : An integer N, number of digits.
Line-2 : N space separated integers, list of digits.

Output Format:
--------------
Print an integer list.


Sample Input-1:
---------------
4
1 2 4 3

Sample Output-1:
----------------
[1, 3, 2, 4]


Sample Input-2:
---------------
4
4 3 2 1

Sample Output-2:
----------------
[1, 2, 3, 4]
*/

import java.util.*;

class fs19_2
{
	static List<Long> res = new ArrayList<>();
	static void allSwaps(char[] a,int b)
	{
		if(b==a.length-1)
		{
			String to="";
			for(int i=0;i<a.length;i++)
				to+=a[i];
			res.add(Long.parseLong(to));
			//System.out.println(to);
			return;
		}
		HashSet<Character> dupli = new HashSet<Character>();
		int pos = b;
		for(;b<a.length;b++)
		{
			if(dupli.contains(a[b]))
				continue;
			dupli.add(a[b]);
			swap(a,b,pos);
			allSwaps(a,pos+1);
			swap(a,b,pos);
		}
	}
	
	static void swap(char[] a,int i,int j)
	{
		char b = a[i];
		a[i] = a[j];
		a[j] = b;
	}
	static void print(String a)
		{
			char[] bc = new char[a.length()];
			for(int i=0;i<bc.length;i++)
				bc[i]=a.charAt(i);
			System.out.println(Arrays.toString(bc));
		}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.next());
		char[] arr = new char[N];
		String c= "";
		int count=0;
		for(int i=0;i<N;i++)
		{
			arr[i]=s.next().charAt(0);
			c+=arr[i];
		}
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
				count++;
		}
		if(count==arr.length-1)
			System.out.println(Arrays.toString(arr));
		else
		{
		
		Long check = Long.parseLong(c);
		//System.out.println(Arrays.toString(arr));
		allSwaps(arr,0);
		Collections.sort(res);
		System.out.println(res);
		int index=0;
		for(int i=0;i<res.size();i++)
		{
			if(check==res.get(i))
			{
				index=i;
				break;
			}		
		}
		StringBuilder sb = new StringBuilder();
		if(index>=res.size()-2)
		{
			sb.append(c);
			String ab =String.valueOf(sb.reverse());
			//System.out.println(ab.toCharArray());
			print(ab);
			System.out.println(res.size());
		}
		else
		{
			String ab = String.valueOf(res.get(index+1));
			print(ab);
			System.out.println(res.size());
		}
		}
	}
}