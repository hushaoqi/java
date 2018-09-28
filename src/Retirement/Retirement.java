package Retirement;

import java.util.*;
public class Retirement {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("how much money do you needs to retire?");
        double goal = in.nextDouble();

        System.out.println("how much money do you contribute every year?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double banlance = 0 ;
        int  years = 0 ;
        while (banlance < goal)
        {
            banlance += payment;
            double interest = banlance + interestRate / 100 ;
            banlance += interest;
            years ++;
        }
        System.out.println("You can retire in "+ years +"years.");
    }
}
