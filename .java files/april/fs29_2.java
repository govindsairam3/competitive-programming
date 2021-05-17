
import java.util.*;
public class a{
	static void rec(int []a, int l,int r, int sum) {
		if (l > r)
		{
			al.add(sum);
			return;
		}
		rec(a, l + 1, r,sum + a[l]);
		
		rec(a, l + 1, r, sum);
		}
		 static List<Integer>al=new ArrayList<Integer>();
		    static void sum(int []a){
		        int s=0;
		        for(int i=0;i<a.length;i++)
		        s+=a[i];
		        al.add(s);
		        
		    
	}
    public static void main(String args[]){
    
       
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        rec(a, 0,n-1, 0);
        
       
        int ss=0;
        for(int i=0;i<al.size();i++)
            ss+=al.get(i);
        System.out.println(ss);
    }
}