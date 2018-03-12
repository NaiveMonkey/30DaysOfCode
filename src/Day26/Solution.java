package Day26;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String realDate = sc.nextLine();
        String dueDate = sc.nextLine();
        sc.close();
        String[] realDateArray = realDate.split("");
        String[] dueDateArray = dueDate.split("");
        String fine = checkFine(realDateArray, dueDateArray);
        System.out.println(fine);
    }

    private static String checkFine(String[] realDateArray, String[] dueDateArray) {
        int mDiffer = 0;
        int dDiffer = 0;
        if (Integer.parseInt(realDateArray[2]) > Integer.parseInt(dueDateArray[2])) return "10000";
        else if (Integer.parseInt(realDateArray[2]) < Integer.parseInt(dueDateArray[2])) return "0";
        if (Integer.parseInt(realDateArray[1]) > Integer.parseInt(dueDateArray[1])) {
            mDiffer += Integer.parseInt(realDateArray[1]) - Integer.parseInt(dueDateArray[1]);
            mDiffer *= 500;
        } else if (Integer.parseInt(realDateArray[0]) > Integer.parseInt(dueDateArray[0])) {
            dDiffer += Integer.parseInt(realDateArray[0]) - Integer.parseInt(dueDateArray[0]);
            dDiffer *= 15;
        }
        return String.valueOf(mDiffer + dDiffer);
    }
}
