package Lab;

import java.util.Scanner;

// Write a java program to add two numbers using class and object.
public class Exp16_Add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter value of y : ");
		int y = sc.nextInt();
		
		int sum = x + y;
		
		System.out.println("Addition : " + sum);
		
		sc.close();
	}

}
