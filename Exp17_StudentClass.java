package Lab;

import java.util.Scanner;

class Students{
	int st_id;
	String st_name;
	int marks_1;
	int marks_2;
	int marks_3;
	
	Scanner sc = new Scanner(System.in);
	
	void setData() {
		System.out.println("Enter Student ID :");
		st_id = sc.nextInt();
		System.out.println("Enter Student name :");
		st_name = sc.next();
		System.out.println("Enter marks for subject 1 : ");
		marks_1 = sc.nextInt();
		System.out.println("Enter marks for subject 2 : ");
		marks_2 = sc.nextInt();
		System.out.println("Enter marks for subject 3 : ");
		marks_3 = sc.nextInt();		
	}
	
	void displayData() {
		System.out.println("Student id : " + st_id);
		System.out.println("Student name : " + st_name);
		System.out.println("Marks for subject 1 : "+ marks_1);
		System.out.println("Marks for subject 2 : " + marks_2);
		System.out.println("Marks for subject 3 : "+ marks_3);
		
		float avg = (marks_1+marks_2+marks_3)/3;
		
		System.out.println("Average marks : " + avg);
	}
}

public class Exp17_StudentClass {

	public static void main(String[] args) {
		Students st = new Students();
		
		st.setData();
		st.displayData();
	}

}
