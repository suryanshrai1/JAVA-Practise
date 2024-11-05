import java.util.*;
import java.lang.*;

public class ExcTest{
public static void main(String args[]) throws Suryansh{
int a, b, c;
a = 10;
try{
System.out.println("Enter second number");
Scanner sc = new Scanner(System.in);	
b= sc.nextInt();
c= a/b;
System.out.println(c);
throw new Suryansh("xyz");
}
catch(Suryansh abc)
{
System.out.println("Error in input "+ abc);
main(args);
}
}
}