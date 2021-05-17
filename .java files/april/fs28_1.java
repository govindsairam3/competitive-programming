import java.util.*;

class fs28_1
{
    static void minimumSteps(int N,int step)
    {
        if(N==1)
        {
            System.out.println(step);
            return;
        }
        if(N%2!=0)
            Math.min(minimumSteps(N-1,step+1),minimumSteps(N-1,step+1));
        else
            minimumSteps(N/2,step+1);
    }
    public static void main(String args[])
    {
        int N = new Scanner(System.in).nextInt();
        minimumSteps(N,0);
    }
}