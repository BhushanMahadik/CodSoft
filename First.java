package codesoft;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Task 1 :- Number Game
		
//		Scanner sc = new Scanner(System.in);
//        boolean keepPlaying = true;
//
//        while (keepPlaying) {
//            int min = 1;
//            int max = 100;
//            int count = 0;
//            int score = 0;
//
//            while (count < 3) {
//                int randomNum = (int)(Math.random() * (max - min + 1)) + min;
//                System.out.println("Enter a number between " + min + " and " + max + ":");
//                int num = sc.nextInt();
//
//                if (num == randomNum) {
//                    System.out.println("Your guess is correct! Random number: " + randomNum);
//                    score++;
//                    System.out.println("Your score: " + score);
//                } else if (num > randomNum) {
//                    System.out.println("Your guessed number is too high.");
//                    System.out.println("Random generated number was: " + randomNum);
//                } else {
//                    System.out.println("Your guessed number is too low.");
//                    System.out.println("Random generated number was: " + randomNum);
//                }
//
//                count++;
//                System.out.println("Attempts: " + count+"/3");
//            }
//
//            System.out.println("\nDo you want to play again? (yes/no):");
//            sc.nextLine(); 
//            String choice = sc.nextLine().trim().toLowerCase();
//
//            switch (choice) {
//                case "yes":
//                    break;
//                case "no":
//                    keepPlaying = false;
//                    System.out.println("Thanks for playing!");
//                    break;
//                default:
//                    System.out.println("Invalid input. Game will exit.");
//                    keepPlaying = false;
//                    break;
//            }
//        }
//        sc.close();
		
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
