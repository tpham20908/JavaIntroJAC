/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Minh
 */
public class Convert 
{
  public static void main(String[] args)
  {
    double cm;
    int in, ft, remainder;
    final double CM_PER_INCH = 2.54;
    final int INCH_PER_FOOT = 12;
    
    Scanner input = new Scanner(System.in);
    
    // get input from user
    System.out.print("How many cm exactly: ");
    cm = input.nextDouble();
    in = (int)(cm / CM_PER_INCH);
    ft = in / INCH_PER_FOOT;
    remainder = in % INCH_PER_FOOT;
    
    System.out.printf("%.2f cm = %d feet and %d inches\n", cm, ft, remainder);
  }
}
