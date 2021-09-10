package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	*Rewrite the following code by using a single if statement:
    *if (x > 0) {
    *   if (x < 10) {
    *       System.out.println("positive single digit number.");
    *   }
    *}
	*/
        int x = 9;

        if (x > 0 && x < 10){
            System.out.println("positive single digit number.");
        }
    }
}
