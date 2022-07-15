// 33. Java programm to find the second largest element in an array.

import java.util.Scanner;
class secondLargest
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
	  System.out.print("The second largest number among given is : "+secondLargest(A));
	}

	public static int secondLargest(int[] A)
	{
		int m = 0, n ;
		for(int i : A)
		{
			n = 0 ;
			for(int j : A)
			{
				if(i<j && n>m)
				{
					A[m] = j ; A[n] = i ; i = j ;
				}
				n++ ;
			}
			if(m == 1) { return i ; }
			m++ ;
		}
		return A[1] ;
	}
}