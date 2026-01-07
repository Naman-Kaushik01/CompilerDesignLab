import java.util.Scanner;

/*
Aim 1: Design a DFA which will accept all the strings containing even number of 0's over
an alphabet {0, 1} and write a program to implement the DFA.
 */

public class Experiment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.next();

        int state = 0;
        boolean invalid = false;

        for (char ch : input.toCharArray()) {
            if (ch == '0') {
                state = (state == 0) ? 1 : 0;
            } else if (ch == '1') {
                // do nothing, state remains same
                continue;
            } else {
                // invalid character
                invalid = true;
                break;
            }
        }

        if (!invalid && state == 0) {
            System.out.println("String ACCEPTED (Even number of 0's only)");
        } else {
            System.out.println("String REJECTED");
        }
    }
}
