import java.util.*;

class fs5_1
{
	static int getele(int i,int j,int[][]arr)
	{
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
		a=arr[i][j];
		b=arr[i][j+1];
		c=arr[i][j+2];
		d=arr[i+1][j+1];
		e=arr[i+2][j];
		f=arr[i+2][j+1];
		g=arr[i+2][j+2];
		int res=a+b+c+d+e+f+g;
		return res;
	}
	public static void hourGlass(int[][] arr)
	{
		int maxi = Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				int sum = getele(i,j,arr);
				if(sum>maxi)
					maxi=sum;
			}
		}
		System.out.println(maxi);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				arr[i][j] = sc.nextInt();
		hourGlass(arr);
	}
}
