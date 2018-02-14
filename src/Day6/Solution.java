package Day6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for (int i = 0; i < testCase; i++) {
            String word = input.next();
            System.out.println(divideOddAndEvenString(word));
        }
    }

    private static String divideOddAndEvenString(String word) {
        String oddStr = "";
        String evenStr = "";
        for (int i = 0; i < word.length(); i++){
            if (i %2 == 0) oddStr += word.charAt(i);
            else evenStr += word.charAt(i);
        }
        return oddStr + " " + evenStr;
    }
}
