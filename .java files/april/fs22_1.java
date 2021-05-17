import java.util.*;

class fs22_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String[] arr = new String[N.length()];
		StringBuilder sb = new StringBuilder();
		int k=0;
		for(int i=0;i<N.length();i++)
		{
			if(N.charAt(i)=='[')
			{
				sb = new StringBuilder();
				int j=i+1;
				while(N.charAt(j)!=']')
				{
					sb.append(j++);
				}
				arr[k++]=sb.toString();
			}
				
			else
				sb.append(N.charAt(i));
		}
		
		//System.out.println(Arrays.toString(N));
		System.out.println(sb.toString());
		//String a=sb.toString();
		//String b[]=a.split(" ");
		System.out.println(Arrays.asList(b));
	}
}