/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author aref.mourtada
 */
public class MathOperation 
{
    public static void main(String args[])
    {

        double randomNum = Math.random();
        randomNum = randomNum * 100;
        System.out.println("The winning ticker is: "+
                (int) randomNum);
        double num1, num2, num3, num4;
        
        num1 = Math.random()*10;
        num2 = Math.random()*10;
        num3 = Math.random()*10;
        
        System.out.println(
                num1 + " to the power of " + num2 
         + " = " + Math.pow(num1, num2));
        
        System.out.printf("Square root of %.2f = %.2f\n", num3, Math.sqrt(num3));
        
        num4 = Math.pow(num2, num2) * 15 /num2 + num1%num2; 
        
    }
    
}
