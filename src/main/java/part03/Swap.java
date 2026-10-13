package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
//declaring the class swap
public class Swap {
    // make the class function
    public static void main(String[] args) {
       // Declaring an x  variable that store the string water
        String x = "water";
        //declaring a y variable that holds the string kool aid
        String y = "kool-aid";
        // temp is an empty string
        String temp;
        //temp holds the value of x
        temp = x;
        // x which has no value takes on y's value
        x = y;
        //y takes on temp's value which holds water
        y = temp;


// prints out x value
        System.out.println(x);
        //prints out the y value
        System.out.println(y);



    }
}
