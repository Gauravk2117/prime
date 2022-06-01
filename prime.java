package findprime;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int num;
		int i;
		int count=0;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the no:");
		num = s.nextInt();
		
		for(i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.print("\nIs a Prime no");
		else
			System.out.print("\nIs not a Prime no");
		

	}

}

	
