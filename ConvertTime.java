/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Tung
 */
public class ConvertTime 
{
  public static void main(String[] args)
  {
    int secs, secsRemaining, mins, hrs;
    Scanner input = new Scanner(System.in);
    
    // prompt user for input
    System.out.print("How many seconds? ");
    // read integer from keyboard
    secs = input.nextInt();
    // calculate the result
    mins = secs / 60;
    secsRemaining = secs % 60;
    hrs = mins / 60;
    mins = mins % 60;
    // printf to display the output
    System.out.printf("%d seconds = %d hours, %d minutes and %d seconds\n",
            secs, hrs, mins, secsRemaining);
  }
}
