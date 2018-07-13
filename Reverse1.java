
import java.util.*;


public class Reverse1 {
	
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
	
	System.out.println("Enter a Number ");
	int n=sc.nextInt();
	System.out.println("reverse order from 1 to n");
	for(int i=0;i<=n;i++)
	{
		System.out.print(+n+ "  ");
		n=n-1;
	}
}

}
