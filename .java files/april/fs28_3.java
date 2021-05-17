import java.util.*;

class fs28_3
{
	static void betweenDays(int[] F,int[] L)
	{
		int r=0;
		int res=0;
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(F[0]>31||F[1]>12||L[0]>31||L[1]>12||F[2]>L[2])
		{
			System.out.println("-1");
			return;
		}
		else
		{
			for(int i=F[1];i<L[1];i++)
			{
				res+=months[i];
			}
			System.out.println(res);
			int red=(months[F[1]]-F[0])+(L[0]-1);
			System.out.println(red);
			System.out.println(red-res+2);
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String[] first = sc.nextLine().split("-");
		String[] last = sc.nextLine().split("-");
		int[] F = new int[first.length];
		int[] L = new int[last.length];
		for(int i=0;i<first.length;i++)
		{	
			F[i]=Integer.parseInt(first[i]);
			L[i]=Integer.parseInt(last[i]);
		}
		betweenDays(F,L);
	}
}