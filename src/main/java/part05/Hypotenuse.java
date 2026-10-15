package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

import java.util.Scanner; // bring in scanner to read user input

public class Hypotenuse {
    public static void main(String[] args) {
        double x; // declare variable for side x
        double y; // declare variable for side y
        double z; // declare variable for the hypotenuse

        Scanner scanner = new Scanner (System.in); // create scanner object

        System.out.println("Enter side x: "); // prompt for side x
        x = scanner.nextDouble(); // read the value for x
        System.out.println("Enter side y: "); // prompt for side y
        y = scanner.nextDouble(); // read the value for y

        z = Math.sqrt((x*x)+(y*y)); // use Pythagorean theorem to find the hypotenuse
        System.out.println("The hypotenuse is: "+ z); // print out the result

    }
}