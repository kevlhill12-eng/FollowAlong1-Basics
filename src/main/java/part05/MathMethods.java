package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    public static void main(String[] args){
        double x = 3.14; // set x to pi
        double y = -10; // set y to a negative number

        double z = Math.max(x,y); // find the bigger number between x and y
        System.out.println(z); // print out z
        double z2 = Math.min(x,y); // find the smaller number between x and y
        System.out.println(z2); // print out z2
        double z3 = Math.abs(y); // turn y positive with absolute value
        System.out.println(z3); // print out z3
        double z4 = Math.sqrt(y); // try to square root a negative (returns NaN)
        System.out.println(z4); // print out z4
        double z5 = Math.sqrt(x); // find the square root of x
        System.out.println(z5); // print out z5
        double z6 = Math.round(x); // round x to the nearest whole number
        System.out.println(z6); // print out z6
        double z7 = Math.ceil(x); // round x up to the next whole number
        System.out.println(z7); // print out z7
        double z8 = Math.floor(x); // round x down to the whole number below
        System.out.println(z8); // print out z8
    }
}
