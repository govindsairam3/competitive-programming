import java.util.Scanner;
import java.math.BigInteger;
class fs5_3
{
	static BigInteger factorial(int N)
	{
		BigInteger res = new BigInteger("1");
		for(int i=2;i<=N;i++)
			res=res.multiply(BigInteger.valueOf(i));
		return res;
	}
	public static void main(String args[])
	{
		int N = new Scanner(System.in).nextInt();
		if(N<0)
			System.out.println("-1");
		else
			System.out.println(factorial(N));
	}
}


/*

// Java code for the above approach
class GFG{

// Function to find the duplicate
// value in the given array arr[]
static void findDuplicate(int arr[])
{
	
	// Initialise variables
	int tortoise = arr[0];
	int hare = arr[0];

	// Loop till we find the
	// duplicate element
	while (true)
	{
		tortoise = arr[tortoise];
		
		// Hare moves with twice
		// the speed of tortoise
		hare = arr[arr[hare]];
		if (tortoise == hare)
			break;
	}
	
	tortoise = arr[0];

	// Loop to get start point
	// of the cycle as start
	// point will be the duplicate
	// element
	while (tortoise != hare)
	{
		tortoise = arr[tortoise];
		hare = arr[hare];
	}

	// Print the duplicate element
	System.out.print(tortoise);
}

// Driver Code
public static void main (String []args)
{
	
	// Given array
	int arr[] = { 2, 6, 4, 1, 3, 1, 5 };

	// Function Call
	findDuplicate(arr);
}
}

*/