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
public class ConvertCToF 
{
  public static void main(String[] args) 
  {
    double degC, degF;
    Scanner input = new Scanner(System.in);
    
    // prompt the user for input
    System.out.print("Degree in Celcius: ");
    // read a double value from the keyboard
    degC = input.nextDouble();
    // calculate the result
    degF = degC * 9.0 / 5.0 + 32;
    // format the output to one decimal place
    System.out.printf("%.1f C = %.1f F\n", degC, degF);
  }
}
