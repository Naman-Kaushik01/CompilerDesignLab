import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String input = sc.next();

        int state = 0; // q0 = 0, q1 = 1

        for(char ch : input.toCharArray()) {
            if(ch == '0') {
                state = state;
            }
            else if(ch == '1') {
                state = (state == 0) ? 1 : 0;
            }
            else {
                System.out.println("Invalid input");
                return;
            }
        }

        if(state == 1) {
            System.out.println("String is ACCEPTED (Odd number of 1's)");
        } else {
            System.out.println("String is REJECTED (Even number of 1's)");
        }
    }
}
