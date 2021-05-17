/*

Write a program to generate the following pattern for any given value 'n'


input = 25
output =
* * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W *
* X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q *
* R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K *
* L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E *
* F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y *
* Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S *
* T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M *
* N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G *
* H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A *
* B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U *
* V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O *
* P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I *
* * * * * * * * * * * * * * * * * * * * * * * * *


input = 30 
output = 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

*/

/*

Ramu is fond of playing with strings. He is given a string and some numbers 'n' ( 0<= n <strlength())

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

 

Example 1:

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

Example 3:

Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"

*/
/*
You are given a string allowed consisting of distinct characters and an array of strings words.

A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

If it not appears then print 0

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

The first line of input contains the array of words followed by "allowed" word  

*/






import java.util.*;

class fs27_1
{
	static void pattern(int n)
	{
		char a = 65;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1||j==n-1)
					System.out.print("* ");
				else
				{
					System.out.print(a+" ");
					a++;
					if(a==91)
						a=65;
					
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int N = new Scanner(System.in).nextInt();
		pattern(N);
	}
}