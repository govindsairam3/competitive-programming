import java.util.*;

class Argument
{
public String name="sai";
{System.out.println("instance initializer");}
Argument()
{
this.name="junnu";
System.out.println("constructor called");
}
{System.out.println("ram");}
public static void main(String args[])
{
Argument a=new Argument();
System.out.println(a.name);
}
}