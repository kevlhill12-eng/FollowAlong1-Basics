package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        starts at about 48:08 — stop at about 52:25, at "get started with expressions"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 04, topic 1 — expressions: + - * / % ++ -- and casting
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Expressions.
//    Leave the "package part04;" line and the "public class Expressions" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
//class state ment / template for the objects
public class Expressions {
    //makes the program runnable
    public static void main(String[] args) {
        //set the variable int  = 10
        int friends = 10;
        //add the value of friends +1
        friends = friends + 1;
        //print out the result of friends value + 1
        System.out.println(friends);

        // multiplies the value of friends times 2
        friends = friends * 2;
        //prints out the result
        System.out.println(friends);

        //divides the value of friends divided by 2
        friends = friends / 2;
        //prints out the result
        System.out.println(friends);
        //modulates the value of friends by 3
        friends = friends % 3;
        //prints out the result
        System.out.println(friends);
        //modulates the value of friends by 2
        friends = friends % 2;
        //prints out the result
        System.out.println(friends);

        //adds friends + 1
        friends++;
        // prints out result
        System.out.println(friends);
        //add friends - 1
        friends--;
        //prints result
        System.out.println(friends);
        //divides the value of friends by 3
        friends = friends / 3;
        //prints out results
        System.out.println(friends);
        //sets the value of friends1 to 10
        double friends1 = 10;
        //prints out the value of friends
        friends1 = (double) friends1 / 3;

        System.out.println(friends1);

    }
}
