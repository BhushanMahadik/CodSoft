package codesoft;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Task 1 :- Number Game
		
		Scanner sc = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            int min = 1;
            int max = 100;
            int count = 0;
            int score = 0;

            while (count < 3) {
                int randomNum = (int)(Math.random() * (max - min + 1)) + min;
                System.out.println("Enter a number between " + min + " and " + max + ":");
                int num = sc.nextInt();

                if (num == randomNum) {
                    System.out.println("Your guess is correct! Random number: " + randomNum);
                    score++;
                    System.out.println("Your score: " + score);
                } else if (num > randomNum) {
                    System.out.println("Your guessed number is too high.");
                    System.out.println("Random generated number was: " + randomNum);
                } else {
                    System.out.println("Your guessed number is too low.");
                    System.out.println("Random generated number was: " + randomNum);
                }

                count++;
                System.out.println("Attempts: " + count+"/3");
            }

            System.out.println("\nDo you want to play again? (yes/no):");
            sc.nextLine(); 
            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice) {
                case "yes":
                    break;
                case "no":
                    keepPlaying = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid input. Game will exit.");
                    keepPlaying = false;
                    break;
            }
        }
        sc.close();
	}

}
