// 31. Write a java programm to sort the given names.

import java.util.Scanner;
class sortNames
{
	public static void main(String args[])
	{
	  System.out.print("Enter the total count of names : ");
	  Scanner s = new Scanner(System.in);
	  int H = s.nextInt();
	  String str[] = new String[H];
	  int i = 0 ;
	  while(i<H)
	  {
	    System.out.print("Enter name "+(i+1)+" :");
	    str[i++] = s.next();
	  }

	  System.out.print("Enter 1 for ascending sort, and 2 for descending sort : ");
	  switch(s.nextInt())
	  {
	  	case 1 : System.out.print("\nAscending sort\n"); str = sortAsc(str); 
			  		for(String j : str)
					{
						System.out.println(j);
					}
	  				break ;
	  	case 2 : System.out.print("\nDescending sort\n"); str = sortDesc(str);
	  				for(String j : str)
					{
						System.out.println(j);
					}
	  				break ;
	  	default : System.out.print("\nInvalid choice, try again..\n"); break ;
	  }
	}

	public static String[] sortAsc(String[] str)
	{
		int m = 0,n,p ;
		for(String i : str)
		{
			n = 0 ;
			for(String j : str)
			{
				if(n>m)
				{
					p = 0 ;
					while(p<(i.length()>j.length()?j.length():i.length()))
					{
					   if((i.length()>j.length()?j:i).charAt(p)>(i.length()>j.length()?i:j).charAt(p))
					   {
					   	  str[m] = j ; str[n] = i ; i = j ; break ;
					   }
					   else if((i.length()>j.length()?j:i).charAt(p)<(i.length()>j.length()?i:j).charAt(p))
					   {
					   	 break ;
					   }
					   p++ ;
					   if(p == (i.length()>j.length()?j.length():i.length()))
					   {
					   	  str[m] = i.length()>j.length()?j:i ;
					   	  str[n] = i.length()>j.length()?i:j ;
					   	  i = i.length()>j.length()?j:i ;
					   	  break ;
					   }
					}
				}
				n++ ;
			}
			m++ ;
		}
		return str ;
	}

	public static String[] sortDesc(String[] str)
	{
	   int m = 0,n,p ;
		for(String i : str)
		{
			n = 0 ;
			for(String j : str)
			{
				if(n>m)
				{
					p = 0 ;
					while(p<(i.length()>j.length()?j.length():i.length()))
					{
					   if((i.length()>j.length()?j:i).charAt(p)<(i.length()>j.length()?i:j).charAt(p))
					   {
					   	  str[m] = j ; str[n] = i ; i = j ; break ;
					   }
					   else if((i.length()>j.length()?j:i).charAt(p)>(i.length()>j.length()?i:j).charAt(p))
					   {
					   	 break ;
					   }
					   p++ ;
					   if(p == (i.length()>j.length()?j.length():i.length()))
					   {
					   	  str[m] = i.length()>j.length()?i:j ;
					   	  str[n] = i.length()>j.length()?j:i ;
					   	  i = i.length()>j.length()?i:j ;
					   	  break ;
					   }
					}
				}
				n++ ;
			}
			m++ ;
		}
		return str ;
	}
}