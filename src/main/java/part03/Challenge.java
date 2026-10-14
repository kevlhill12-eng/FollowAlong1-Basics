package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.


import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a thief:");
        String thief = scanner.nextLine();

        System.out.println("Name a target:");
        String target = scanner.nextLine();

        System.out.println("Pick a number:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Name a gadget:");
        String gadget = scanner.nextLine();

        String temp = thief;
        thief = target;
        target = temp;

        System.out.println(thief + " sneaked into the museum using " + gadget + ".");
        System.out.println("There were " + number + " guards patrolling the grand hall.");
        System.out.println("Plot twist: " + target + " was guarding the vault all along!");
    }
}