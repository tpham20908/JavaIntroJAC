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
public class SoftwarePackages {
  public static void main(String[] args)
  {
    // declare package price as a constant variable
    final int UNIT_PRICE = 99;
    // declare variables for packages purchased, discount and purchase
    int pkgPurchased, discount;
    double totalAmount, discountAmount, purchasedAmount;
    
    // instantiate a Scanner object
    Scanner input = new Scanner(System.in);
    
    // prompt user for pkgPurchased
    System.out.print("How many packages have you purchased? ");
    // scan input from user and assign it to pkgPurchased
    pkgPurchased = input.nextInt();
    
    // calculate amount of discount 
    if (pkgPurchased < 10) 
      discount = 0;
    else if (pkgPurchased < 20)
      discount = 20;
    else if (pkgPurchased < 50)
      discount = 30;
    else if (pkgPurchased < 100)
      discount = 40;
    else
      discount = 50;
    
    // calculate total total amount without discount
    totalAmount = UNIT_PRICE * pkgPurchased;
    // calculate total amount of discount and purchase
    discountAmount = discount * totalAmount / 100;
    purchasedAmount = totalAmount - discountAmount;
    // display amount of discount and purchase
    System.out.print("\nYou have purchased " + pkgPurchased + " packages.\n");
    System.out.printf("Unit price for each package is %d dollars.\n", UNIT_PRICE);
    System.out.print("You can have " + discount + "% of discount.\n");
    System.out.printf("Total amount of discount is %.2f dollars.\n", discountAmount);
    System.out.printf("Total amount of purchase after the discount is %.2f dollars.\n", purchasedAmount);
  }
}
