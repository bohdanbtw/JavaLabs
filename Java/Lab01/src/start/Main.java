package start;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose task [1-2-3-4-5]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Task 1");
                OperationOnNums operationonnums = new OperationOnNums();
                operationonnums.PrintResults();
                System.out.println();
                break;
            
            case 2:
                System.out.println("Task 2");
                Car car = new Car();
                car.Init();
                car.PrintInfo();
                System.out.println();
                break;

            case 3:
                System.out.println("Task 3");
                ReverseNumber reverse = new ReverseNumber();
                reverse.Reverse();
                System.out.println();
                break;
            
            case 4:
                System.out.println("Task 4");
                Sentence sentence = new Sentence();
                sentence.CreateAndPrint();
                System.out.println();
                break;
            
            case 5:
                System.out.println("Task 5");
                User user = new User();
                user.Init();
                user.PrintUserInfo();
                break;
            
            default:
                System.out.println("Wrong number!");
                break;

        }

    }
}