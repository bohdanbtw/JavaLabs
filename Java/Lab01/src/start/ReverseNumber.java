package start;
import java.util.Scanner;

public class ReverseNumber {
    private int reverse(int n) {
        int rev = 0;
        int rem;

        while (n > 0) {

            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    public void Reverse() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a three-digit number: ");
            int n = sc.nextInt();

            System.out.print("Reversed Number is " + reverse(n));
        }
    }
}
