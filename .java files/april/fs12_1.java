/*
We have a string S of lowercase letters, and an integer array shifts.

Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a'). 

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.

Return the final string after all such shifts to S are applied.

Example 1:
input =abc
3 5 9
output =rpl


input: S = abc, shifts = [3,5,9]
Output: rpl
Explanation: 
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.
*/



import java.util.*;

class fs12_1
{
	static void Shift(int[] arr,int T,String S,String res,int i)
	{
		char[] all = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//sSystem.out.println("i="+i);
		if(i==arr.length)
		{
			System.out.println(res);
			return;
		}
		else
		{
			//res+=arr[T];
			int toAdd = S.charAt(i)-'a';
			//System.out.println("toadd"+toAdd);
			int a=toAdd+T;
			//System.out.println("a"+a);
			while(a>25)
				a=a-26;
			res=res+all[a];
			//System.out.println("res "+res);
			Shift(arr,T-arr[i],S,res,i+=1);
		}
	}
	public static void main(String args[])
	{
		Scanner br = new Scanner(System.in);
		//BufferReader br = new BufferReader(new InputStreamReader(System.in));
		String S = br.nextLine();
		String[] arr = br.nextLine().split(" ");
		int[] N = new int[arr.length];
		int total = 0;
		for(int i=0;i<arr.length;i++)
		{
			N[i]=Integer.parseInt(arr[i]);
			total+=N[i];
		}
		//System.out.println(total);
		Shift(N,total,S,"",0);
	}
}







/*
 a b c d e f g h i j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z
 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 
 
 
 //abc  -> r p l
   359    1714
   
 3+5+9 = 17




*/