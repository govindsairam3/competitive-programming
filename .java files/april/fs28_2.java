import java.util.*;

class fs28_2
{
	static void pattern(int N,int sqr,int odd,int r)
	{
		if(r>N)
			return;
		for(int i=0;i<odd;i++)
		{
			System.out.print(sqr*sqr+" ");
			sqr+=1;
		}
		System.out.println();
		pattern(N,sqr,odd+2,r+1);
		
	}
	public static void main(String args[])
	{
		int N = new Scanner(System.in).nextInt();
		pattern(N,1,1,1);
	}
}