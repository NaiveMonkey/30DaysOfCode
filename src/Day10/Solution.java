package Day10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = Integer.toBinaryString(n);
        int count = 1;
        int max = 0;
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == '1' && result.charAt(i + 1) == '1') {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
