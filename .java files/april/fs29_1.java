/*
Given an array of orginal grades of students print upgraded grades based on the following rules.

i) every student receives a grade in the inclusive range from 0 to 100

ii) any grade is less than 40 is failing grade

iii) if the difference between the grade and the next multiple of 5 is less than 3, then round the original grade to the next multiple of 5.

iV) if the value of grade is less than 38, no rounding occurs as the result will still be failing grade


input =
4
73
67
38
33
output =
75
67
40
33

Explanation
73 becomes 75 because round to 75 and it is multiple of 5
67 becomes 67 because next multiple of 5 is 70 but difference between new grade and old grade is not less than 3 so dont update this.
38 becomes 40 above reasons
33 is <38 so will not change




Given an array of elements of size, find the sum of the sums of all possible subsets.

forexample:

input =
2
3 7
output =
20


The subsets are: {3} {7} {3, 7}
{3, 7} = 10
{3} = 3
{7} = 7
10 + 3 + 7 = 20 so print 2o





Sorting is useful as the first step in many different tasks. 
The most common task is to make finding things easier, 
but there are other uses as well. In this case, 
it will make it easier to determine which pair or 
pairs of elements have the smallest absolute difference between them.

For example, if you've got the list [5,2,3,4,1], 
sort it as [1,2,3,4,5] to see that several pairs have the minimum difference
of 1:[(1,2),(2,3),(3,4),(4,5)] . 
The return array would be [1,2,2,3,3,4,4,5].

Given a list of unsorted integers,arr, 
find the pair of elements that have the smallest absolute difference between them. 
If there are multiple pairs, find them all.

Input Format
------------
The first line contains a single integer n, the length of arr.
The second line contains n space-separated integers, arr[i].

Output Format
-------------
Output the pairs of elements with the smallest difference. 
If there are multiple pairs, output all of them in ascending order, 
all on the same line with just a single space between each pair of numbers. 
A number may be part of two pairs when paired with its predecessor and its successor.


input = 5
5 2 3 4 1
output =
1 2 2 3 3 4 4 5

input =
4
5 4 3 2
output =
2 3 3 4 4 5

Explanation 2
--------------
Here, the minimum difference will be 1. 
Valid pairs are (2, 3), (3, 4), and (4, 5). 
We print the elements of each pair, space-separated on a single line.

input =
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
output =
-520 -470 -20 30

Explanation 1
--------------
(-470) - (-520) = 30 - (-20) = 50, which is the smallest difference.


Program 1 test cases

case = 1
input =
4
73
67
38
33
output =
75
67
40
33
case = 2
input =
5
50
47
99
14
55
output =
50
47
100
14
55
case = 3
input =
3
67
73
83
output =
67
75
85
case = 4
input =
5
1004
2145
5005
9999
7777
output =
1005
2145
5005
10000
7777


Program 2 test cases


case = 1
input =
4
10 16 14 9
output =
392

case =2 
input =
2
3 7
output =
20

case = 3
input =
5
102 201 306 1000 1
output =25760

case = 4
input =
4
-111 111 2222 -222
output =16000



Program 3 test cases

case = 1
input =
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
output =
-520 -470 -20 30
case = 2
input =
4
5 4 3 2
output =
2 3 3 4 4 5
case = 3
input = 5
5 2 3 4 1
output =
1 2 2 3 3 4 4 5
*/


import java.util.*;

class fs29_1
{
	static void studentMarks(int i,int[] marks)
	{
		if(i==marks.length)
			return;
		if(marks[i]>37)
		{
			int div = marks[i]%5;
			if(div>2)
				marks[i]+=(5-div);
		}
		System.out.println(marks[i]);
		studentMarks(i+=1,marks);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		studentMarks(0,arr);
	}
}