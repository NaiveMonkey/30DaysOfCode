package Day25;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (checkPrime(num)) sb.append("Prime").append(System.lineSeparator());
            else sb.append("Not prime").append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }

    private static boolean checkPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        if (num / 2 > 2) num = num / 2;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
