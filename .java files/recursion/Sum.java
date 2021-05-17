import java.util.*;

class Sum
{
	int func(int a)
	{
		if(a==0)
			return 0;
		else
			return a+func(a-1);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Sum obj = new Sum();
		System.out.println(obj.func(a));
	}
}