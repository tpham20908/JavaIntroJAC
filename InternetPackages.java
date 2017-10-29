package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Thanh-Tung Pham IPD12
 */
public class InternetPackages 
{
  public static void main(String[] args)
  {
    // declare a variable of number of hours used and package name
    // extra hours used and pagkage prices
    double hrsUsed, extraFee = 0, totalAmount = 0;
    double pkgAExtraFee = 2.00, pkgBExtraFee = 1.00;
    double pkgAFee = 9.95, pkgBFee = 13.95, pkgCFee = 19.95;
    String pkgName;
    
    // get package name from user. It should be A, B, C or Q (to quit)
    pkgName = getPkgName();

    // in case pkgName is not Q, it is either A, B or C
    if (!pkgName.equals("Q"))
    {
      // ask user about number of hours used
      System.out.print("How many hours did you use last month? ");
      // assign var hrsUsed
      hrsUsed = getHrsUsed();

      // calculate customer monthly bill
      switch (pkgName) 
      {
        case "A":
          // calculate extraFee
          extraFee = hrsUsed <= 10 ? 0 : Math.ceil(hrsUsed - 10) * pkgAExtraFee;

          // calculate totalAmount
          totalAmount = pkgAFee + extraFee;
          break;

        case "B":
          // calculate extraFee
          extraFee = hrsUsed <= 20 ? 0 : Math.ceil(hrsUsed - 20) * pkgBExtraFee;

          // calculate totalAmount
          totalAmount = pkgBFee + extraFee;
          break;

        case "C":
          // No extraFee applied
          // calculate totalAmount
          totalAmount = pkgCFee;
          break;
      }

      // display total charge
      printCharge(pkgName, hrsUsed, extraFee, totalAmount);
    }
    // in case pkgName is Q, user wants to quit
    else 
    {
      // offering user to try out service
      offeringService();
    }
  }     // finish main method
  
  // define method printCharge
  public static void printCharge(String pkgName, double hrsUsed,
                          double extraFee, double totalAmount)
  {
    System.out.print("\n");
    System.out.print("You are using package " + pkgName + ".\n");
    System.out.print("You used " + hrsUsed + " hours last month.\n");
    System.out.printf("The extra fee is $%.2f.\n", extraFee);
    System.out.printf("Your total amount will be $%.2f.\n", totalAmount);
    System.out.println("Thank you for using our service!".toUpperCase());
  }
  
  // define method getPkgName
  public static String getPkgName()
  {
    String name;
    Scanner in = new Scanner(System.in);
    // ask user about package name
    System.out.print("What kind of package are you using? (A, B or C) ");
    // assign input to var name
    name = in.next().toUpperCase();

    // prompt user again for name if it's not one of A, B or C
    while (!(name.equals("A") || 
             name.equals("B") || 
             name.equals("C")))
    {
      // remind user about correct input
      System.out.print("Please choose A, B or C or Q to quit.\n");
      name = in.next().toUpperCase();

      if (name.equals("Q"))
        break;
    }
    return name;
  }     // finish getPkgName method
  
  // define method offeringService
  public static void offeringService()
  {
    // declare variable answer, count
    String answer;
    int count = 1;
    // instantiate an object Scanner
    Scanner in = new Scanner(System.in);
    
    // offering user to use provider service
    System.out.printf("But do you want to try out our service"
            + " with %d month free? Y/N ", count);
    answer = in.next().toUpperCase();

    // prompt user to re-input if his answer is not Y or N
    while (!(answer.equals("Y") || answer.equals("N")))
    {
      System.out.print("Y or N, please. ");
      answer = in.next().toUpperCase();
    }

    // if answer N, give out better offer 
    while (answer.equals("N") && count < 3) {
      count++;
      System.out.print("Come on! You can get better offer somewhere.\n");
      System.out.printf("How about %d months free? ", count);
      answer = in.next().toUpperCase();
    }
    // print out statements
    if (answer.equals("Y"))
      System.out.print("YOU ROCK!\nYou can't go wrong with your decision!\n\n");
    else
      System.out.println("You are really unbelievable. GO TO HELL!!!\n");
  }     // finish offeringService method
  
  public static double getHrsUsed() 
  {
    // instantiate a scanner object
    Scanner input = new Scanner(System.in);
    // return a double value
    return input.nextDouble();
  }     
}   // finish InternetPackages Class