package Prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
		int temp;
		boolean isPrime=true;
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter any number:");
		
		//capture the input in an integer
		int num = scan.nextInt();
		scan.close();
		
		for (int i = 2 ; i <= num/2 ; i++ )
		{
			temp=num%i;
			
			if (temp == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		//if isPrime is true then the number is Prime else not
		
		if (isPrime)
			System.out.println(num + "Is a prime number");
		
		else
			
			System.out.println(num + "Is not a prime number");

	}

}
