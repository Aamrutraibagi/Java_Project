package Programs;

import java.util.Scanner;

public class WithAllOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("Addition");
		System.out.println(a+b);
		System.out.println("Minus");
		System.out.println(a-b);
		System.out.println("Multiplication");
		System.out.println(a*b);
		System.out.println("Divission");
		System.out.println(a/b);
		System.out.println("Modules");
		System.out.println(a%b);
		
		System.out.println("And Condition");
		System.out.println(a<b&&a<c);
		
		System.out.println("increamental and decremental");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
		System.out.println((a>b)?a:b);
		
		
	}

}
