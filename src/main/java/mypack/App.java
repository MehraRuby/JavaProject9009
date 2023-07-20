package mypack;

public class App 
{
	public String greet(String name)
	{
		return "Good Morning! "+name;
	}
	
	
	public static boolean isEven(int a)
	{
		return a%2==0?true : false;			
	}
	
	
	public static String isEquals(int a, int b)
	{
		return a == b?"true":"false";
	}
		
		
public static void main(String[] args)
	{		
		System.out.println(App.isEven(100));	
		System.out.println(App.isEven(89));	
	}		
}
