package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
import java.util.Scanner;
import java.util.Random;


public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        int dice1 = random.nextInt(6)+ 1;
        int dice2 = random.nextInt(6)+1;
        System.out.println(name+ " rolled a "+ dice1+ " and a "+ dice2);

        int total = dice1 + dice2;
        System.out.println("Total:\t"+ total);


        int max = Math.max(dice1, dice2);
        int min = Math.min(dice1, dice2);
        System.out.println("Higher die:\t"+ max);
        System.out.println("Lower die:\t"+ min);

        int difference = max - min;
        System.out.println("Difference:\t"+ difference);

        double average = (dice1 + dice2)/2;
        System.out.println("Average:\t"+ average);

        System.out.println(Math.round(average));

    }
}
