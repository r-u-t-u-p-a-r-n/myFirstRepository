// 1. Sum of Numbers Between given Range
import java.util.Scanner;
class sumOfNumbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any two numbers : \n");
		System.out.print(GetSum(s.nextInt(),s.nextInt())+"\n");
	}

	public static int GetSum(int a, int b)
	{
		int i = 0 ;
		if(a == b) { System.out.print("Sum of the numbers between "+a+" & "+b+" is :"); return a ; }
		else if(a<b)
		{
			System.out.print("Sum is : ") ;
			while(a<=b)
			{
			    System.out.print(a);
				i+= a++ ;
				if(a<=b) { System.out.print(" + ");}
			}
			System.out.print(" = ");
			return i ;
		}
		else { return i = GetSum(b,a); }
	}
}