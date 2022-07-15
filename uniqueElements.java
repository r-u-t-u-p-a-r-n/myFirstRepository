// 32. Java programm to count a total number of unique elements in an array.

import java.util.Scanner;
class uniqueElements
{
	public static void main(String args[])
	{
	  System.out.print("Enter the size of array : ");
	  Scanner s = new Scanner(System.in);
	  int S = s.nextInt();
	  int A[] = new int[S];
	  S = 0 ;
	  for(int i : A)
	  {
	  	System.out.print("Enter Input "+(S+1)+" : ");
	  	A[S++] = s.nextInt();
	  }
	  uniqueElements(A);
	}

	public static void uniqueElements(int[] a)
	{
		int n,n1 = 0 ;
		for(int i : a)
		{
			n = 0 ;
			for(int j : a)
			{
				if(i == j)  { n++ ; }
				if(n == 2) { break ; }
			}
			if(n == 1) { n1++ ; }
		}
		System.out.print("Total count of unique elements in given array : "+n1);
	}
}