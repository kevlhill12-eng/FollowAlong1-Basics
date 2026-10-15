package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import javax.swing.*;

public class Challenge {



    public class Challenge1 {
        public static void main(String[] args) {
            String costInput = JOptionPane.showInputDialog("Enter the cost of the meal:");
            double mealCost = Double.parseDouble(costInput);

            String tipInput = JOptionPane.showInputDialog("Enter the tip percent:");
            int tipPercent = Integer.parseInt(tipInput);

            String peopleInput = JOptionPane.showInputDialog("Enter the number of people:");
            int numPeople = Integer.parseInt(peopleInput);

            double tipAmount = mealCost * tipPercent / 100.0;
            double totalCost = mealCost + tipAmount;
            double perPerson = totalCost / numPeople;

            int wholeDollarsEach = (int) perPerson;
            int totalCents = (int) (totalCost * 100);
            int remainderCents = totalCents % numPeople;

            String boxOne = "Tip: $" + tipAmount + "\nTotal: $" + totalCost + "\nEach person pays $" + perPerson;
            String boxTwo = "If everyone pays whole dollars ($" + wholeDollarsEach + "), you are short by " + remainderCents + " cents.";

            JOptionPane.showMessageDialog(null, boxOne);
            JOptionPane.showMessageDialog(null, boxTwo);
        }
    }
}
