package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import java.sql.SQLOutput;

/*
My character is Naruto from the anime naruto. He is a ninja from the leaf village and his goal is to save his true love SASUKE!
 */
public class Challenge {
    public static void main(String[] args) {
        //Name
        String name = "Naruto";
        // kunai's
        int kunaiCount = 10;
        //yen
        long yenCount = 900000000000L;
        //health
        double health = 186.5;
        //defence
        float defence = 10.2F;
        boolean rasengan = true;
        char tier = 'A';

        System.out.println("===== CHARACTER =====");
        System.out.println("Name:\t"+ name);
        System.out.println("Kunai's:\t"+kunaiCount);
        System.out.println("Yen:\t" + yenCount);
        System.out.println("Health:\t"+ health);
        System.out.println("Defence:\t"+ defence);
        System.out.println("Rasengan:\t"+ rasengan);
        System.out.println("Tier:\t"+ tier);
    }



}
