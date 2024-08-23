
// Number Guessing Game 

import java.util.Random;
import java.util.Scanner;


public class Number_game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        // Now Defining the range of the random number i.e 1 to 100
        int low = 1;
        int high = 100;

        // Generating a Random Number Between 1 to 100
        int numberToGuess = rand.nextInt(high - low + 1) + low;
        int guess = 0;
        int attempt = 0;

        System.out.println("Welcome to the Number Guessing Game....!");
        // Rules of the Game 
        System.out.println("Rules :");
        System.out.println("1. The System Will guess a number Between 1 to 100...");
        System.out.println("2. You have to guess the same Number for higher points");
        System.out.println("3. You can guess the number by typing it in the console");
        System.out.println("Lets get Started...");
        System.out.println("The System Will Guess a Number from" +low + "to" + high+ "Try to Guess It..");


        while(guess!= numberToGuess){
            System.out.println("Enter Your Guess::");
        

        if(sc.hasNextInt()){
        guess = sc.nextInt();
        attempt++;
        
            if(guess < numberToGuess){
                System.out.println("Too Low , Try Again!");
            }
            else if(guess > numberToGuess)
            {
                System.out.println("Too High , Try Again!");
            }
            else
            {
                System.out.println("Congratulations!!! , You gave Guessed the Number in "+ attempt + " Attempts");
            }
    }

    else
    {
        System.out.println("Invalid Input , Please Enter a Number in Between 1 To 100");
        sc.next();
    }
}
    sc.close();
    }

    
}
