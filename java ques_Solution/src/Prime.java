import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number to check whether it is prime or not:: ");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		
		int count =0;
		for(int i = 1; i<=a; i++)
		{
			if(a % i==0)
			{
				count++;
			}
		}
		if(count > 2)
			System.out.println(a + "is not a prime number.");
		else
			System.out.println(a + "is a prime number.");
	}

}
