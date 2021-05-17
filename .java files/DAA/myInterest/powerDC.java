import java.util.*;

class powerDC
{
	static double power(double x,int y)
	{
		if(y==0)
			return 1;
		if(y%2==0)
				return power(x,y/2)*power(x,y/2);
		else
		{
			if(y>0)
				return x*power(x,y/2)*power(x,y/2);
			else
				return (1/x)*power(x,y/2)*power(x,y/2);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double base = sc.nextInt();
		int pow = sc.nextInt();
		System.out.println(power(base,pow));
	}
}