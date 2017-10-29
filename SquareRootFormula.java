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
public class SquareRootFormula {
  public static void main(String[] args)
  {
//    double num;
//    System.out.print("Enter a number: ");
//    Scanner input = new Scanner(System.in);
//    num = input.nextDouble();
//    System.out.printf("Square root of %.2f is %.2f \n", num, squareRoot(num));
    
    double base;
    int pow;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter base: ");
    base = input.nextDouble();
    System.out.print("Enter power: ");
    pow = input.nextInt();
    System.out.printf("Result: %.2f \n", power(base, pow));
  }
  
  // define methods below
  
  public static double squareRoot(double num)
  {
    double init = num/2, result = num;
    while (Math.abs(init - result) > 0.000002)
    {
      init = result;
      result = (init + num/init)/2;
    }
    return result;
  }
  
  public static double power(double base, int pow) 
  {
//    return pow == 0 ? 1 : base * power(base, pow - 1);
    double result = 1;
    for (int i = pow; i > 0; i--)
    {
      result = result * base;
    }
    return result;
  }
  
}
