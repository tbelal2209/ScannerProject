package Tbelal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = input.nextLine();
        System.out.println("what is your age?");
        String age = input.nextLine();
        System.out.println("Nice to meet you" +" "+ name +" "+ "And you are"+" "+ age);
    }
}
