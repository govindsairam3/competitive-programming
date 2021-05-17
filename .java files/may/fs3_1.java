import java.util.*;

class fs3_1
{
	static void matchPrint(String[] F,String[] S)
	{
		int i=0,si=S.length;
		for(int j=0;j<F.length;j++)
		{
			if(F[j].equals(S[i]))
			{
				i++;
				if(i>=si)
					i=0;
				continue;				
			}
			else
			{
				System.out.println(F[j]);
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String first[] = sc.nextLine().split(" ");
		String second[] = sc.nextLine().split(" ");
		matchPrint(first,second);
	}
}