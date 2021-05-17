import java.util.*;
/*
class practice{
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
		int arr[] = {3,3,3,2,2, 6, 4, 3, 2,5 };
		findDuplicate(arr);
	}
}
*/


import java.util.*;
  
class practice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.charAt(0)>b.charAt(0))
			System.out.println("true");
		else
			System.out.println("false");
    }
}
   