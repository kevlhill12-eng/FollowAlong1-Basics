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
        double x = 3.14;
        double y = -10;

        double z = Math.max(x,y);
        System.out.println(z);
        double z2 = Math.min(x,y);
        System.out.println(z2);
        double z3 = Math.abs(y);
        System.out.println(z3);
        double z4 = Math.sqrt(y);
        System.out.println(z4);
        double z5 = Math.sqrt(x);
        System.out.println(z5);
        double z6 = Math.round(x);
        System.out.println(z6);
        double z7 = Math.ceil(x);
        System.out.println(z7);
        double z8 = Math.floor(x);
        System.out.println(z8);
    }

}
