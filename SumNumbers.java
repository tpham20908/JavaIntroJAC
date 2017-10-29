/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class SumNumbers 
{
    public static void main(String args[])
    {
        //declaration
        int num1, num2, num3, num4, num5;
        int sum;
        double avg;
        
        //assignment
        num1 = (int)(Math.random()*1000);
        num2 = (int)(Math.random()*1000);
        num3 = (int)(Math.random()*1000);
        num4 = (int)(Math.random()*1000);
        num5 = (int)(Math.random()*1000);
        
        //operations
        sum = num1+num2+num3+num4+num5;
        avg = (double)sum/5;
        
        System.out.println("The sum of your 5 numbers\n"+
                num1 + "\t+ " + num2 + "\t+ " + num3 + "\t+ " +
                num4 + "\t+ " + num5 + " =\t" + sum +
                "\nAverage =\t" + avg);
        
    }
    
}
