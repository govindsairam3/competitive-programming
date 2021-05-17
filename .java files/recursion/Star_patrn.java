import java.util.*;

class Star_patrn
{
	static void print(int a)
	{
		if(a>1)
		print(a-1);
		for(int i=1;i<=a;i++)
		{
		    System.out.print(i);
		}
		System.out.println();
		}
	public static void main(String... args)
	{
		print(5);
	}
}