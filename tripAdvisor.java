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
public class tripAdvisor
{
    public static void main(String arg[])
    {
        //Declartion of variables
        int startLocation;
        int endLocation;

        double startTime;
        double endTime;
        double speed;
        //Assignment
        startLocation = 100;
        endLocation = 200;
        startTime = 2.0;
        endTime = 4.0;
        speed = (endLocation - startLocation)/(endTime-startTime);

        System.out.print("You started you trip at:\t" + startLocation
        + "\tTrip ended at:\t" + endLocation +
                "\nTime elapsed = " + (endTime-startTime)
        + "\nYour speed was \t"+ speed + "\n");

    }
}
