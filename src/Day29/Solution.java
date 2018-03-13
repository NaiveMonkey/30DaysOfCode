package Day29;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int max = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int i = 1; i < n - 1; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int newVal = i & j;
                    if (newVal > max && newVal < k)
                        max = newVal;
                }
            }
            System.out.println(max);
        }
    }
}
