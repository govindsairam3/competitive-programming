import java.util.*;

class Mccarthy
{
	static int mc91(int val)
	{
		if(val>100)
		{
			//System.out.println(val);
			return val-10;
		}
		else 
		{
			//System.out.println(val);
			return mc91(mc91(val+11));
			
		}
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		System.out.println(mc91(N));
	}
}