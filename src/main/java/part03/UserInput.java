package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

import java.util.Scanner;
//makes the class UserInput
public class UserInput{
    //Gets the proram running
    public static void main(String[] args) {
        //makes the scanner run
        Scanner scanner= new Scanner(System.in);
        // print out "What is your name"
        System.out.println("What is your name?");
        //takes the user string input and put their input into the name value
        String name = scanner.nextLine();
        //prints out "How old are you"
        System.out.println("How old are you?");
        //takes the users integer input and put it into the age varaible
        int age = scanner.nextInt();
        //this extra scanner makes sure that the next scanner  doesnt get interrupted
        scanner.nextLine();
        //prints out "Whats your favorite food"
        System.out.println("Whats your favorite food?");
        // takesthe input and puts it into the new food variable
        String food = scanner.nextLine();
        // prints out hello and prints the name variable
        System.out.println("Hello "+ name);
        //prints out you are and years old. also rints out the age variable
        System.out.println("You are "+ age + " years old");
        //prints out you like and the food variable
        System.out.println("You like " + food);

    }
}
