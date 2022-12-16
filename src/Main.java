/*
 * @author Emircan Aktaş - 16.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        INFORMATION!
        * Write a program that calculates the VAT value and the VAT amount of the money
        * value received from the user with Java and prints it on the screen.
        * (Note: Take the VAT amount as 18%)
        * Price without VAT = 10;
        * Price with VAT = 11.8;
        * VAT amount = 1.8
        * Homework
        * If the amount entered is between 0 and 1000 TL, the VAT rate is 18%,
        * if the amount is greater than 1000 TL, write the program that calculates the VAT amount as 8%.
        */

        double vat = 0.18, price, priceVat, priceWithVat;
        Scanner inp = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("VAT amount as 18%");
        System.out.println("***************************");
        System.out.print("Enter the Price Amount :");
        price = inp.nextDouble();

        priceVat = price * vat;
        priceWithVat = price + priceVat;

        System.out.println("Product amount :"+price);
        System.out.println("VAT amount add :"+priceVat);
        System.out.println("Total amount :"+priceWithVat);


    }
}