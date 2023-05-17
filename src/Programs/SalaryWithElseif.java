package Programs;

import java.util.Scanner;

public class SalaryWithElseif {
	
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.nextLine();
		String Role=sc.nextLine();
		
		
		
		if(age ==25 && Role.equals("Assosiate Engineer"))
		{
			System.out.println("Salary is 10000");
		}
		else if(age == 30 && Role.equals("Senior Assosiate Engineer")) {
			System.out.println("Salary is 20000");
		}
		else if(age == 35 && Role.equals("Manager")) {
			System.out.println("Salary is 30000");
		}
		else {
			System.out.println("Salary is not aplicable");
		}
		
	}
}
