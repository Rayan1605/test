package Test;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
add();
    }
    public static void add() {
        Scanner myinput = new Scanner(System.in);
        System.out.println("Please enter your number ");
        int firstnumber = myinput.nextInt();
        System.out.println("Please enter your second number ");
        int secondnumber = myinput.nextInt();

        int total = firstnumber + secondnumber;
        System.out.println("The total is " + total);
    }
}
