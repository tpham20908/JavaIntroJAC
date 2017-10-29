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
public class Factorial {
  public static void main(String[] args)
  {
    int n;
    double x, result = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number x: ");
    x = input.nextDouble();
    System.out.print("Enter number n: ");
    n = input.nextInt();
    
    for (int i = 1; i <= n; i++)
    {
      result += myexp(x, i);
    }
    
    System.out.printf("e to the x is %.2f\n", result);
    System.out.printf("Math.exp(x) is %.2f\n", Math.exp(x));

  }
  
  public static double fact(int n)
  {
    return n == 1 ? 1 : n * fact(n-1);
//    double result = 1;
//    for (int i = 1; i <= n; i++)
//    {
//      result *= i;
//    }
//    return result;
  }
  
  public static double power(double base, int pow) 
  {
    return pow == 0 ? 1 : base * power(base, pow - 1);
  }
  
  public static double myexp (double x, int n)
  {
    return power(x, n)/fact(n);
  }
}
