package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// made a class to store all the objects
public class Variables {
    // a template to get the program running
    public static void main(String[] args){
        //Variable setting x as an integer
        int x;
        //setting the x integer value to 123
        x = 123;
        //printing out the string adding the string.
        System.out.println("My number is " +  x);
        //setting a long funciton to call out large numbers
        long debt = 30000000000000L;
        // printing the dabt variable
        System.out.println(debt);
        //setting byte b to 100
        byte b = 100;
        //printing out the variable b
        System.out.println(b);
        // setting a float onto y
        float y = 3.14f;
        //printing out the float
        System.out.println(y);
        // setting out the double onto y2
        double y2 = 3.14;
        //printing the double y2 variable
        System.out.println(y2);
        //setting bool onto z
        boolean z = true;
        //printing out the bool variable
        System.out.println(z);
        //setting the char symbol  =@
        char symbol = '@';
        //printing out te char symbol
        System.out.println(symbol);
        // setting the variable name to the value of "bro"
        String name = "Bro";
        //printing out the string + the string variable
        System.out.println("Hello  "+ name);

    }
}
