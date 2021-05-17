/*
5

1 2 3 4 5
15 14 13 12
6 7 8
11 10
9

5%2!=0 
1 2 3 4 5
15 14 13 12
6 7 8
11 10

*/


import java.util.*;

class fs26_3
{
	static int forward(int N,int v)
	{
		while(N>0)
		{
			System.out.print(v + " ");
			v++;
			N--;
		}
		return v;
	}
	static int backward(int N,int v)
	{
		while(N>0)
		{
			System.out.print(v + " ");
			v--;
			N--;
		}
		return v;
	}
	public static void pattern(int N)
	{
		int total = N*(N+1)*1/2;
		int fv=1;
		for(int i=N;i>0;i--)
		{
			if(i%2!=0)
			{
				fv=forward(i,fv);
				System.out.println();
			}
			else
			{
				total=backward(i,total);
				System.out.println();
			}
		}
	}
	public static void main(String args[])
	{
		int N = new Scanner(System.in).nextInt();
		pattern(N);
	}
}