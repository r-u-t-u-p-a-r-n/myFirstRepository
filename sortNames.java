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
		String H ;
		int z,m,n = 0;
		for(String i : str)
		{
			m = 0 ;
			for(String j : str)
			{
				if(i.length() > j.length() && m > n)
				{
					H = i ;  i = j ;  j = H ;  str[m++] = j ;  continue ;
				}
				else if(i.length() == j.length()  && m > n)
				{
					z = 0 ;
					while(z<i.length())
					{
						if(i.charAt(z) > j.charAt(z++))
						{
							H = i ;  i = j ;  j = H ;  str[m] = j ;  break ;
						}
					}
					m++ ;	continue ;
				}
				m++ ;
			}
			str[n++] = i ;
		}
		return str ;
	}

	public static String[] sortDesc(String[] str)
	{
	   String H ;
		int z,m,n = 0;
		for(String i : str)
		{
			m = 0 ;
			for(String j : str)
			{
				if(i.length() < j.length() && m > n)
				{
					H = i ;  i = j ;  j = H ;	str[m++] = j ;	continue ;
				}
				else if(i.length() == j.length()  && m > n)
				{
					z = 0 ;
					while(z<i.length())
					{
						if(i.charAt(z) < j.charAt(z++))
						{
							H = i ;  i = j ;  j = H ;	str[m] = j ;	break ;
						}
					}
					m++ ;	continue ;
				}
				m++ ;
			}
			str[n++] = i ;
		}
		return str ;
	}
}