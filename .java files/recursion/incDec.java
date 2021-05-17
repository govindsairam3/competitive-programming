import java.util.*;

class incDec
{
	static void print(int N,int end)
	{
	if(N>end) return ;
	if(N<=0) return ;
	System.out.println(N);
	print(2*N,end);
	System.out.println(String.format("%d",N));
	}
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	print(s.nextInt(),s.nextInt());
	}
}