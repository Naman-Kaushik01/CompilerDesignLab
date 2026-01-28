//Design a DFA which will accept all the strings ending with 00 over an alphabet {0,1} and write a program to implement DFA

import java.util.Scanner;

public class Experiment3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String input = sc.nextLine();

        int state = 0; // q0 = 0, q1 = 1, q2 = 2

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            switch (state) {
                case 0: // q0
                    if (ch == '0')
                        state = 1;
                    else if (ch == '1')
                        state = 0;
                    break;

                case 1: // q1
                    if (ch == '0')
                        state = 2;
                    else if (ch == '1')
                        state = 0;
                    break;

                case 2: // q2
                    if (ch == '0')
                        state = 2;
                    else if (ch == '1')
                        state = 0;
                    break;
            }
        }

        if (state == 2) {
            System.out.println("Accepted: String ends with 00");
        } else {
            System.out.println("Rejected: String does not end with 00");
        }

        sc.close();
    }
}

