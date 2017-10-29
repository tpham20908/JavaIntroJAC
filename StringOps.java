
package javaapplication1;

public class StringOps 
{
    public static void main(String args[])
    {
        String message = "Java is Great Fun!";
        String upper = message.toUpperCase();
	String lower = message.toLowerCase();
	char letter = message.charAt(2);
	int stringSize = message.length();
        System.out.println(message);
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(letter);
	System.out.println(stringSize);
        
        //
        String firstName = "Alex";
        String lastName = "Romio";
        String fullName = firstName + "\n" + lastName;
        System.out.println(firstName+lastName);
        System.out.println("Full name: " + fullName);

        //
        double interest = 2.11984521;
        String formattedDouble = String.format("%.2f", interest);  
        System.out.println(formattedDouble); // print 2.12
        formattedDouble = String.format("%.3f", interest);  
        System.out.println(formattedDouble); // print 2.119
        System.out.println("floor " + Math.floor(interest));
        System.out.println("Ceil " + Math.ceil(interest));
        
        

    }
    
}
