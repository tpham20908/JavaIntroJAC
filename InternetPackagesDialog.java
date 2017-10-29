package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author Tung Pham
 */
public class InternetPackagesDialog {
  public static void main(String[] args)
  {
    // declare variables holding package name
    char pkgName = getPkgName();
    
    if (pkgName != 'Q')     // in case pkgName is either A, B or C
    {
      // declare variable holding hours used
      double hrsUsed = getHrsUsed();
      // switch of package name with 3 cases A, B and C
      switch (pkgName)
      {
        case 'A':
          pkgABill(hrsUsed);
          break;
        case 'B':
          pkgBBill(hrsUsed);
          break;
        case 'C':
          pkgCBill(hrsUsed);
          break;
      }
      // Salut
      JOptionPane.showMessageDialog(null, "Thank you for using our service".toUpperCase());
    }
    else    // in case pkgName is Q, user want to quit
      offeringService();
    
    // exit JOptionPane
    System.exit(0);
  }
    
  
  // define method getPkgName
  public static char getPkgName()
  {
    // declare a variable for package name
    String nameStr;
    char name;
    // prompt user for package name
    nameStr = JOptionPane.showInputDialog("Which package are you using?");
    name = nameStr.toUpperCase().charAt(0);
    
    // prompt user if pkgname is none of A, B or C
    while (!(name == 'A' || 
             name == 'B' || 
             name == 'C'))
    {
      nameStr = JOptionPane.showInputDialog("Please enter A, B or C.\n" + 
              " If you are not our customer, press Q to quit");
      name = nameStr.toUpperCase().charAt(0);
      
      if (name == 'Q')
        break;
    }
    return name;
  }
  
  // define method getHrsUsed which returns double
  public static double getHrsUsed()
  {
    String hoursStr;
    double hours;
    // get input from user for hours used
    hoursStr = JOptionPane.showInputDialog("How many hours did you use last month?");
    hours = Double.parseDouble(hoursStr);
    
    return hours;
  }
  
  // define method offeringService 
  public static void offeringService()
  {
    // declare variable answer and count
    String answerStr, message;
    char answer;
    int count = 1;
    // offer user to use service and get answer in String
    message = String.format("But do you want to try out" + 
            " our service with %d month FREE? Y or N", count);
    answerStr = JOptionPane.showInputDialog(message);
    answer = answerStr.toUpperCase().charAt(0);
    
    // remind user for the wright answer
    while (!(answer == 'Y' || answer == 'N'))
    {
      answerStr = JOptionPane.showInputDialog("Y or N, please.");
      answer = answerStr.toUpperCase().charAt(0);
    }

    // offer 3 times long as user says N
    while (answer == 'N' && count < 3)
    {
      count++;
      message = String.format("How about %d months FREE? Y or N", count);
      answerStr = JOptionPane.showInputDialog(message);
      answer = answerStr.toUpperCase().charAt(0);
    }
    
    if (answer == 'Y')
      JOptionPane.showMessageDialog(null, "You ROCK! You can't go wrong with that.");
    else
      JOptionPane.showMessageDialog(null, "you are unbelievable! bye!".toUpperCase());
  }
  
  // define method pkgABill
  public static void pkgABill(double hrsUsed)
  {
    // declare variables
    int extraFee = 2;
    double hrsLimit = 10, pkgAFee = 9.95;
    double extraHrs, extraAmount, totalAmount;
    // calculate extra amount
    extraAmount = (hrsUsed <= hrsLimit ? 0 : Math.ceil(hrsUsed - hrsLimit) * extraFee);
    // calculate total amount
    totalAmount = pkgAFee + extraAmount;
    // display message
    displayMessage(hrsUsed, pkgAFee, extraAmount, totalAmount);
  }
  
  // define method pkgBBill
  public static void pkgBBill(double hrsUsed)
  {
    // declare variables
    int extraFee = 1;
    double hrsLimit = 20, pkgBFee = 13.95;
    double extraHrs, extraAmount, totalAmount;
    // calculate extra amount
    extraAmount = (hrsUsed <= hrsLimit ? 0 : Math.ceil(hrsUsed - hrsLimit) * extraFee);
    // calculate total amount
    totalAmount = pkgBFee + extraAmount;
    // display message
    displayMessage(hrsUsed, pkgBFee, extraAmount, totalAmount);
  }
  
  // define method pkgCBill
  public static void pkgCBill(double hrsUsed)
  {
    // declare variables
    double pkgCFee = 19.95, extraAmount = 0, totalAmount;
    totalAmount = pkgCFee;

    // display message
    displayMessage(hrsUsed, pkgCFee, extraAmount, totalAmount);
    
  }
  
  // define method displayMessage
  public static void displayMessage(double hrsUsed, double pkgFee, 
          double extraAmount, double totalAmount)
  {
    JOptionPane.showMessageDialog(null, "Your package monthly fee $" + pkgFee
            + "\nYou used " + hrsUsed + " hours"
            + "\nExtra fee: $" + extraAmount
            + "\nTotal amount: $" + totalAmount + "\n");
  }
}