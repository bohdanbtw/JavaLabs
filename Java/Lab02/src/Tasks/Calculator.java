package Tasks;
import java.util.Scanner;
public class Calculator {
    private double num1;
    private double num2;
    Scanner scanner = new Scanner(System.in);


    public Calculator(){
    }

    public void Launch(){
        GetResultFromOperation();
    }

    private void GetResultFromOperation(){

        System.out.println("Choose operation:");
        System.out.println("1. Calculate product");
        System.out.println("2. Calculate sum");
        System.out.println("3. Calculate difference");

        int choice = scanner.nextInt();

        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                double product = num1 * num2;
                System.out.println("product " + num1 + " і " + num2 + " = " + product);
                break;
            case 2:
                double sum = num1 + num2;
                System.out.println("sum " + num1 + " і " + num2 + " = " + sum);
                break;
            case 3:
                double difference = num1 - num2;
                System.out.println("difference " + num1 + " і " + num2 + " = " + difference);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
