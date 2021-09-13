import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class exerciseTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double itemOne= input.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int itemOnequantity = input.nextInt();

        System.out.print("Enter the price of item 2: ");
        double itemTwo= input.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        int itemTwoquantity = input.nextInt();

        System.out.print("Enter the price of item 3: ");
        double itemThree= input.nextDouble();

        System.out.print("Enter the quantity of item 3: ");
        int itemThreequantity = input.nextInt();

        double subTotal = ((itemOne*itemOnequantity)+(itemTwo*itemTwoquantity)+(itemThree*itemThreequantity));
        double tax = subTotal*.055;
        double total = tax+subTotal;

        System.out.println("Subtotal: $"+ subTotal);
        System.out.println("Tax: $"+ tax);
        System.out.println("Total: $"+total);
    }
}
