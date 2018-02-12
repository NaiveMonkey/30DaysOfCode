package Day2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        int total = calculateTotalCost(meal_cost, tip_percent, tax_percent);
        System.out.println("The total meal cost is " + total +" dollars.");
    }

    private static Integer calculateTotalCost(double mealCost, int tipPercent, int taxPercent){
        double tip = mealCost * tipPercent/100;
        double tax = mealCost * taxPercent/100;
        int total = (int)Math.round(mealCost + tip + tax);
        return total;
    }
}
