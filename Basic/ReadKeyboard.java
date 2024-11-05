import java.lang.*;
import java.util.*;
public class ReadKeyboard
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide input:");
		String x=sc.nextLine();
		System.out.println("The input is: "+x);
	}
}