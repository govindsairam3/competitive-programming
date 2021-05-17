

import java.util.*;

/*
3 0   //2  bg1(1,2)   bg2 (2)
5 7   //-1 
12 3  //3  bg1(3,4,5) bg2 (1,2)
*/
class sravan1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		List<Integer> res1 = new ArrayList<>();
		List<Integer> res2 = new ArrayList<>();
		int count = 0;
		int res = 0;
		int start = 0;
		for(int i=1;i<X;i++)
		{
			if(res<X)
			{
				res+=i;
				res1.add(i);
				if(res==X)
				{
					//System.out.println(res1.size());
					break;
				}
			}
			else //if(res>X)
			{
				res-=start;
				start++;
				if(res==X)
				{
					//System.out.println(res1.size());
					break;
				}
				res1.remove(0);
			}
			//else
				//System.out.println(res1.size());
		}
		
		int count1=0,start1=0,resu=0;
		for(int i=1;i<Y;i++)
		{
			if(resu<Y)
			{
				resu+=i;
				res2.add(i);
				if(resu==Y)
				{
					//System.out.println(res2.size());
					break;
				}
			}
			else //if(res>Y)
			{
				resu-=start;
				start1++;
				if(res==Y)
				{
					//System.out.println(res2.size());
					break;
				}
				res2.remove(0);
			}
			//else
				//System.out.println(res1.size());
		}
		//System.out.println(res1);
		//System.out.println(res2);
		HashMap<Integer,Integer> map = new HashMap<>();
		int finale = 0;
		for(int i=0;i<res1.size();i++)
		{
			if(!map.containsKey(res1.get(i)))
				map.put(res1.get(i),1);
			else
				finale++;
		}
		for(int i=0;i<res2.size();i++)
		{
			if(!map.containsKey(res2.get(i)))
				map.put(res2.get(i),1);
			else
				finale++;
		}
		if(finale>0)
			System.out.println("-1");
		else
			System.out.println(res1.size());
	}
}