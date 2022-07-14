/* 3.Java Program to Check Whether a Number is Positive or Negative */

//--->
import java.util.Scanner;
class PositiveNegative
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a Number:");
				int no=sc.nextInt();
				if(no>0)
					{
						System.out.println("Entered Number is Positive");
					}
				else
					{
						System.out.println("Entered Number is Negative");
					}
			}
	}