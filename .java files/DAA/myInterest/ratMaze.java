import java.util.*;

public class ratMaze
{
	static int N;
	static boolean isSafe(int[][] maze,int i,int j)
	{
		return (i>=0 && j>=0 && i<N && j<N && maze[i][j]==1);
	}
	
	static boolean solveMaze(int[][] maze,int i,int j,int[][] sol)
	{
		if(i==N-1 && j==N-1 && maze[i][j]==1)
		{
			sol[i][j]=1;
			return true;
		}
		if(isSafe(maze,i,j)==true)
		{
			if(sol[i][j] == 1)
				return false;
			sol[i][j] = 1;
			if(solveMaze(maze,i+1,j,sol))
				return true;
			if(solveMaze(maze,i,j+1,sol))
				return true;
			if(solveMaze(maze,i-1,j,sol))
				return true;
			if(solveMaze(maze,i,j-1,sol))
				return true;
			sol[i][j] = 0;
			return false;
		}
		return false;
	}
	
	static void findPath(int[][] maze)
	{
		int[][] sol = new int[N][N];
		if(solveMaze(maze,0,0,sol)==false)
		{
			System.out.println("false");
			return;
		}
		System.out.println("true");
		return;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][]maze = new int[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				maze[i][j] = sc.nextInt();
		//N = maze.length;
		findPath(maze);
	}
}