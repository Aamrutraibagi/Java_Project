package Programs;

import java.util.Scanner;

public class SalarayWithSwithCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		switch(age)
		{
		case 25:
			System.out.println("Salary is 10000");
			break;
		case 30:
			System.out.println("Salary is 20000");
			break;
		case 35:
			System.out.println("Salary is 30000");
			break;
		default:
			System.out.println("Salary is not aplicable");
		}
	}

}
