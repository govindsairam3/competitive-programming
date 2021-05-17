/*
You are playing a shooting game.
There are N bottles hanging to a rod, i-th bottle numbered bottle[i].

If you shoot i-th bottle, you will get bottle[i-1]*bottle[i]*bottle[i+1] points.
The more points you score, the more rewards you can win.

Your task is to score the maximum points by shooting all the ballons wisely.

Note: After you shoot bottle at i-th index, bottles at i-1 and i+1 positions
become adjacent. if there is no existing 'i-1' or 'i+1' positions for selected bottle.
you can assume that bottle[i-1] = bottle[i+1] = 1.

Input Format:
-------------
N space separated integers bottles[].

Output Format:
--------------
Print an integer, maximum points you can get.


Sample Input:
---------------
3 1 5 8

Sample Output:
----------------
167

Explanation:
------------
Given bottles = [3, 1, 5, 8] 
position 	points
--------------------
1				3*1*5 =  15
5				3*5*8 = 120
3				1*3*8 =  24
8				1*8*1 =   8
--------------------    167
Total = 167

*/

3 1 5 8 

3*1*5 =  15 //3 5 8
3*5*8 = 120 //1*3*8
1*3*8 =  24 //1*8*1
1*8*1 =   8
        167

2 1 3 5 4
2*1*3 =  6 //2 3 5 4
3*5*4 = 60 //2 3 4
2*3*4 = 24 //1 2 4
1*2*4 =  8 //
1*4*1 =  4
		102
		
49 9 11 4 43

11*4*43 = 1892 // 49 9 11 43
49*9*11 = 4851 // 49 11 43
49*11*43=23177 // 49 43 1
49*43*1 = 2107 // 1 49 1
1*49*1  =   49
         32076