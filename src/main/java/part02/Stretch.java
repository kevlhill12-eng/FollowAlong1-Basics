package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
       /* MY guess
       7
       7.0
       a+b
       a: 7
       77
       77! i thought this one wouldnt add together
       A
       true
       */
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);

        String name = "Kevin Hill";
        int age = 19;
        double GPA = 3.4;
        boolean Commuter = false;
        System.out.println(name);
        System.out.println(age);
        System.out.println(GPA);
        System.out.println(Commuter);

        char n = 'K';
        int numClass = 4;
        double creditHour = 17.5;
        boolean hasACar = false;
        String major = "Computer Science";

        System.out.println(n + " takes " + numClass + " in " + major +", for " + creditHour + "credit hours. Has a car: " + hasACar);

        String city = "Dover";
        long people = 4000000000L;
        char grade = 'B';
        float temp = 72.5F;
        System.out.println(city + " " + people + " " + grade + " " + temp);

    }
}