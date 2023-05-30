package Tasks;
import java.util.Scanner;

public class CheckNumbers {
    private int num;
    Scanner input = new Scanner(System.in);

    public CheckNumbers() {
       
    }

    public void Launch() {
        System.out.print("Enter a number: ");
        num = input.nextInt();
        CheckIfEvenAndTwoDigit();

    }

    private void CheckIfEvenAndTwoDigit() {
        if (num >= 10 && num < 100 && num % 2 == 0) 
            System.out.println("A number " + num + " is even and two-digit");
        else {
            System.out.println("A number " + num + " is not  even and two-digit");

        }


    }
}
