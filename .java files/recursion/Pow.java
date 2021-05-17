import java.util.*;

class Pow{

static int calcu(int a,int b)
{
int temp;
if(b==0)
return 1;
temp=calcu(a,b/2);
if(b%2==0)
return temp*temp;
else
{
if(b>0)
return a*temp*temp;
else
return (temp*temp)/a;
}
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
System.out.println(calcu(a,b));
}
}