import java.util.*;

class Log
{
int func(int a)
{
if(a==1)
return 0;
else
return 1+func(a/2);
}

public static void main(String args[])
{
Log obj = new Log();
Scanner s=new Scanner(System.in);
int N=s.nextInt();
System.out.println(obj.func(N));
}
}