/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class GuessStarter 
{
  public static void main(String[] args) 
  {
    int guessingNumber;
    Scanner input = new Scanner(System.in);
    // Create a random number
    Random random = new Random();
    int myNumber = random.nextInt(100) + 1;
    
    // Message to the user
    System.out.println("I'm thinking of a number between 1 and 100");
    System.out.println("(including both). Can you guess what it is?");
    
    // prompt user for the input
    System.out.print("Type your number: ");
    // Read input from user
    guessingNumber = input.nextInt();
    // Compare the result
    if (guessingNumber == myNumber) 
    {
      System.out.println("You've got it right!");
    }
    
    // compute and display the difference
    int dif = Math.abs(myNumber - guessingNumber);
    System.out.printf("You guessed %d, but my number is %d\n", 
            guessingNumber, myNumber);
    System.out.printf("You were off by %d\n", dif);
  }
}
