import java.util.*;
public class test{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        List<Integer> al=new ArrayList<>();
        String a[]=s.nextLine().split(" ");
        int l=Integer.parseInt(s.next());
        int u=Integer.parseInt(s.next());
        for(int i=0;i<a.length;i++){
            al.add(Integer.parseInt(a[i]));
        }
        
        List<Integer> bl=new ArrayList<>();
        for(int i=l;i<=u;i++){
            bl.add(al.remove(l));
			//al.remove(i);
        }
        System.out.println(al);
        System.out.println(bl);
        Collections.sort(al);
        for(int i=l;i<=u;i++){
            al.add(i,bl.get(0));
			bl.remove(0);
        }
        System.out.println(al);
        
    }
}

