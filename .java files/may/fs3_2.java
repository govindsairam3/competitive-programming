import java.util.*;

class fs3_2
{
	static void noofGrp(String a)
	{
		int arr[] = {0,0,0,0,0};
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='p')
				arr[0]+=1;
			else if(a.charAt(i)=='c')
				arr[1]+=1;
			else if(a.charAt(i)=='m')
				arr[2]+=1;
			else if(a.charAt(i)=='b')
				arr[3]+=1;
			else
				arr[4]+=1;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
	public static void main(String args[])
	{
		String inp = new Scanner(System.in).next();
		noofGrp(inp);
	}
}