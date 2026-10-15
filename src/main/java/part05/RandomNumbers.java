package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
 import java.sql.SQLOutput;
 import java.util.Random; // bring in the random library

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random(); // create a random object

        int x = random.nextInt(6) + 1; // roll a random number from 1 to 6 like a die
        System.out.println(x); // print the random int

        double y = random.nextDouble(); // generate a random decimal between 0 and 1
        System.out.println(y); // print the random decimal

        boolean z = random.nextBoolean(); // flip a coin for true or false
        System.out.println(z); // print the random boolean
    }
}
