/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("How many people? ");
        String s1 = x.nextLine();
        Integer num1 = null;
        try {
            num1 = Integer.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("How many pizzas do you have? ");
        String s2 = x.nextLine();
        Integer num2 = null;
        try {
            num2 = Integer.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }
        System.out.print("How many slices per pizza? ");
        String s3 = x.nextLine();
        Integer num3 = null;
        try {
            num3 = Integer.valueOf(s3);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integers please.");
            System.exit(0);
        }

        int n1 = num1;
        int n2 = num2;
        int n3 = num3;
        int piz = n2*n3;
        int per = piz/n1;
        int lef = piz%n1;

        //first line
        if(per == 1 && n1==1 && n2 == 1){
            System.out.println("1 person with 1 pizza (1 slice)");
        }else if(per==1&&n2==1){
            System.out.println(n1+" people with 1 pizza (1 slice)");
        }else{
            System.out.println(n1+" people with "+n2+" pizzas ("+piz+" slices)");
        }
        //second line
        if(per==1){
            System.out.println("Each person gets 1 slice of pizza.");
        }else{
            System.out.println("Each person gets "+per+" slices of pizza.");
        }
        //third line
        if(lef==1){
            System.out.println("There is 1 leftover piece.");
            System.exit(0);
        }else{
            System.out.println("There are "+lef+" leftover pieces.");
            System.exit(0);
        }



        System.exit(0);
    }
}
