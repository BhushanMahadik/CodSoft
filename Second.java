package codesoft;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Task 2 :- Student Grade Calculator
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's name: ");
	    String a= sc.next();
		
		int b = getValidMarks(sc,"Marathi");
		int c = getValidMarks(sc,"English");
		int d = getValidMarks(sc, "Hindi");
		int e = getValidMarks(sc, "Science");
		int f = getValidMarks(sc, "Maths");
		int g = getValidMarks(sc, "Geography");
		int TotalMarks = b+c+d+e+f+g;
		double percentage = TotalMarks/6.0;
		System.out.println("Name of student: "+a);
		System.out.println("Total marks (out of 600): "+TotalMarks);
		System.out.println("Average percentage: "+percentage);
		
		String grade;
		if(percentage >= 90) {
			grade = "A+";
		}
		else if(percentage >= 80) {
			grade = "A";
		}
		else if(percentage >= 70) {
			grade = "B";
		}
		else if(percentage >= 60) {
			grade = "C";
		}
		else if(percentage >= 35) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		System.out.println("Grade: "+grade);
		
		
	}
	public static int getValidMarks(Scanner sc, String subjectName) {
		int marks ;
		while(true) {
			System.out.println("Enter " + subjectName + " marks (out of 100): ");
			marks = sc.nextInt();
		 if (marks >= 0 && marks <= 100) {
             break;
         } else {
             System.out.println("Invalid input. Marks should be between 0 and 100. Please try again.");
         }
		}
		return marks;
	}

}
