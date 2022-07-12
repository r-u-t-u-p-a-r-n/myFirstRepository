/* 7. Palidrome Number, mr. Lalwani have Some Currency. The currency having number as Palidrome gets
      3 times more than the currency. So help out Mr. Lalwani to check which currency going to give him
      3 times return. */

import java.util.Scanner;
class checkForPalindrome
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter any integer : ");
	  if(checkForPalindrome(s.nextInt()))
	  {
	  	System.out.print("Mr. Lalwani should use this currency.");
	  }
	  else
	  {
	    System.out.print("Mr. Lalwani shouldn\'t use this currency.");	
	  }
	}

	public static boolean checkForPalindrome(int a)
	{
	  int a1 = a ;
	  int c = 1 ;
	  while(a1>0)
	  {
	  	a1 = a1 / 10 ;
	  	c = c * 10 ;
	  }
	  c = c / 10 ;
	  a1 = a ;
	  while(a1>0)
	  {
	  	if(a%10 != a1/c) { return false ; }
	  	a = a / 10 ;
	  	a1 = a1 % c ;
	  	c = c / 10 ;
	  }
	  return true ;
	}
}