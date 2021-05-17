/*
Ramu is given a number in string format. 
Now he turns his head by 180 and checks the given string. 
He saw the number that looks the same when rotated 180 defrees(looked at upside down). 

Help him to write the code and print the result as true or false. 

If same print true else print false 


Example 1:

Input: num = "69"
Output: true

Example 2:

Input: num = "88"
Output: true

Example 3:

Input: num = "962"
Output: false

Example 4:

Input: num = "1"
Output: true
*/
import java.util.*;

class fs26_1
{
	public static void rotate(String n)
	{
		StringBuilder s = new StringBuilder();
		s.append(n);
		s.reverse();
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			if(a=='1'||a=='0'||a=='8'||a=='9'||a=='6')
			{
				if(a=='6')
					res+='9';
				else if(a=='9')
					res+='6';
				else
					res+=a;
			}
		}
		if(res.equals(n))
			System.out.println("true");
		else
			System.out.println("false");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		rotate(N);
	}
}