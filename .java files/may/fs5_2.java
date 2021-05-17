import java.util.*;

class fs5_2
{
	static void mapMatch(HashMap first,String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(first.get(arr[i])==null)
				System.out.println("0");
			else
				System.out.println(first.get(arr[i]));
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		HashMap<String,Integer> first = new HashMap<>();
		for(int i=0;i<inp1;i++)
		{
			String s = sc.next();
			first.put(s,first.getOrDefault(s,0)+1);
		}
		inp1=sc.nextInt();
		String arr[]=new String[inp1];
		for(int i=0;i<inp1;i++)
			arr[i]=sc.next();
		mapMatch(first,arr);
		//System.out.println();
		
	}
}