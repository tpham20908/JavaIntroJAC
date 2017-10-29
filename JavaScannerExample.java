package javaapplication1;
import java.util.Scanner;

class JavaScannerExample
{
  public static void main (String[] args)
  {
    // create a scanner so we can read the command-line input
    Scanner scanner = new Scanner(System.in);
    
    // prompt for their age
    System.out.print("Enter your age: ");
    // get the age as an int
    int age = scanner.nextInt();
    
    //  prompt for the user's name
    System.out.print("Enter your name: ");
    // get their input as a String
    String username = scanner.next();
    
    //System.out.println(String.format("%s, your age is %d", username, age));
    System.out.println(username + ", your age is " + age);
  }
}
