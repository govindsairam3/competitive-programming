import java.util.*;

class Balan_prnths
{
static int balanceLong(String prnt,int len)
{
int sum=0;
int maxi=0;
for(int i=0;i<len;i++)
{
if(prnt.charAt(i)=='(')
sum+=1;
else
sum-=1;
if(sum==0)
maxi=i;
}
return maxi+1;
}

public static void main(String args[])
{
Scanner s = new Scanner(System.in);
String inp=s.next();
System.out.println(balanceLong(inp,inp.length()));
}
}