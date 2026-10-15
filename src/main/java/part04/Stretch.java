package part04;

import java.sql.SQLOutput;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
/*

    2
    2
    2.5
    11
    10
    9
    9 it didnt even out put
    10 it didnt print out
    3.5
    7 i forgot it wouldnt count as 3.5 as an int
 */
public class Stretch {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(n / 4);
        System.out.println(n % 4);
        System.out.println(n / 4.0);
        n++;
        System.out.println(n);
        n--;
        n--;
        System.out.println(n);
        System.out.println((double) 7 / 2);
        System.out.println(7 / 2 * 2);

        int people = 4;
        double bill = 50.00;
        System.out.println("Each person pays $"+(bill/people));

        int seconds = 500;
        int minutes;
       int seconds2;

        minutes = seconds/ 60;
        seconds2 = seconds%60;
        System.out.println(seconds +" seconds is "+minutes+ " minutes and "+ seconds2+" seconds");

        int num1 = 90;
        int num2 = 85;
        int num3 = 78;
        int average = (num1+ num2 + num3)/3;
        double average2 = ((double) num1+ num2 + num3)/3;
        System.out.println(average);
        System.out.println(average2);


    }

}
