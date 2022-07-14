/*	1.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
	For example, if the input is 12345, the output should be 54321.   */

//--->

import java.util.Scanner;
class ReverseNumber
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Please Enter a Number:");
				int no=sc.nextInt();
				int rev=0,rem;
				while(no!=0)
					{
						rem=no%10;
						no=no/10;
						rev=rev*10+rem;	
					}
				System.out.println("The Number after Reverse:"+rev);
			}

	}