import java.util.*;

class Bodmas
{
	public static List<Integer> ways(String n)
	{
		List<Integer> ret = new LinkedList<Integer>();
		for(int i=0;i<n.length();i++)
		{
			char a = n.charAt(i);
			if(a=='-'||a=='+'||a=='*')
			{
				String one = n.substring(0,i);
				String two = n.substring(i+1);
				List<Integer> onere = ways(one);
				System.out.println(onere);
				System.out.println("done");
				List<Integer> twore = ways(two);
				
				System.out.println(twore);
				for(Integer j:onere)
				{
					for(Integer k:twore)
					{
						int c=0;
						if(a=='+')
							c=j+k;
						if(a=='-')
							c=j-k;
						if(a=='*')
							c=j*k;
						ret.add(c);
					}
				}
			}
		}
		if(ret.size()==0)
			ret.add(Integer.valueOf(n));
		return ret;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		System.out.println(ways(N));
	}
	
}