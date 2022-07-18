// 37. Java programm for transpose of a given matrix.

import java.util.Scanner;
class transposeMatrix
{
	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  System.out.print("\nEnter number of rows of the matrix : ");
	  int R = s.nextInt();
	  System.out.print("Enter number of columns of the matrix : ");
	  int C = s.nextInt();
	  int A[][] = new int[R][C] ;
	  R = 0 ; C = 0 ;
	  for(int i[] : A)
	  {
	  	C = 0 ;
	  	for(int j : i)
	  	{
	  		System.out.print("Enter input for row "+(R+1)+" & column "+(C+1)+" : ");
	  		A[R][C] = s.nextInt() ; C++ ;
	  	}
	  	R++ ;
	  }
	  transposeMatrix(A);
	}

	public static void transposeMatrix(int A[][])
	{
	  int n = 0,m = 0;
	  for(int i[] : A)
	  {
	  	n = 0 ;
	  	for(int j : i)
	  	{
	  		n++ ;
	  	}
	  	m++ ;
	  }
	  int B[][] = new int[n][m];
	  n = 0 ;
	  for(int i[] : B)
	  {
	  	m = 0 ;
	  	for(int j : i)
	  	{
	  		B[n][m] = A[m][n] ;
	  		m++ ;
	  	}
	  	n++ ;
	  }
	  System.out.print("Input Matrix : \n");
	  PRINT(A);
	  System.out.print("\n\n");
	  System.out.print("It\'s Transpose : \n");
	  PRINT(B);
	  System.out.print("\n\n");
    }

    public static void displayElement(int a)
    {
    	if(a/10 == 0)
			if(a>0)
				System.out.print("   ");
			else
				System.out.print("  ");
		else
			if(a>0)
				System.out.print("  ");
			else
				System.out.print(" ");
		System.out.print(a);
    }

    public static void PRINT(int[][] M)
    {
    	for(int m[] : M)
    	{
    		for(int i : m)
    		{
    			displayElement(i);
    		}
    		System.out.print("\n");
    	}
    }
}