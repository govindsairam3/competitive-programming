import java.util.*;

class fs22_2
{
	static int crcl = 10;
	static int totalPatternFromCur(boolean visit[], int jump[][], int cur, int toTouch) 
	{ 
		if (toTouch <= 0) 
			return (toTouch == 0) ? 1 : 0;  
		int ways = 0; 
		visit[cur] = true; 
		for (int i = 1; i < crcl; i++) 
		{ 
			if (!visit[i] && (jump[i][cur] == 0 || visit[jump[i][cur]])) 
			ways += totalPatternFromCur(visit,jump,i,toTouch - 1); 
		} 
		visit[cur] = false; 
		return ways; 
	} 
	static int digitalLock(int mi,int mx)
	{ 
		int[][] jump = new int[crcl][crcl];
		jump[1][3] = jump[3][1] = 2;
		jump[1][3] = jump[3][1] = 2; 
		jump[7][9] = jump[9][7] = 8; 
		jump[1][7] = jump[7][1] = 4; 
		jump[3][9] = jump[9][3] = 6; 
		jump[1][9] = jump[9][1] = jump[2][8] = jump[8][2] = jump[3][7] =  jump[7][3] = jump[4][6] = jump[6][4] = 5; 
		boolean []visit = new boolean[crcl]; 
		int ways = 0; 
		for (int i = mi; i <= mx; i++) 
		{
			ways += 4 * totalPatternFromCur(visit,jump, 1, i - 1); 
			ways += 4 * totalPatternFromCur(visit,jump, 2, i - 1); 
			ways += totalPatternFromCur(visit,jump, 5, i - 1); 
		} 
		return ways; 
	} 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int mi = sc.nextInt();
		int mx = sc.nextInt();
		System.out.println(digitalLock(mi,mx));
	}
}