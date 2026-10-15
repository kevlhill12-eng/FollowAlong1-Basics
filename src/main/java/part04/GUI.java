package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
//Allows GUI to be in this system
import javax.swing.JOptionPane;
//makes a class name FUI
public class GUI {
    //makes the program run
    public static void main(String[] args) {
        //sets the name to what you put into the input
    String name = JOptionPane.showInputDialog("Enter your name");
    //prints out the graphic result on screen
    JOptionPane.showMessageDialog(null, "Hello "+name);
        //sets the age to what you put into the input and the parse allows the values that are not a string
    int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
        //prints out the graphic result on screen
        JOptionPane.showMessageDialog(null, "You are "+age+ " years old.");
        //sets the name to what you put into the input
        double height = Double.parseDouble( JOptionPane.showInputDialog("Enter your height"));
        //prints out the graphic result on screen
        JOptionPane.showMessageDialog(null, "You are "+height+ " cm tall.");

    }
}
