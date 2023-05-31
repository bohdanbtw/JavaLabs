package start;
import java.util.Scanner;

public class Main {
    public static void main(String[] arrays){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose task [1-2-3-4-5]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Task 1");
                Calculator calc = new Calculator();
                calc.Launch();
                break;
            case 2:
                System.out.println("Task 2");
                CheckNumbers cn = new CheckNumbers();
                cn.Launch();
                break;
            case 3:
                System.out.println("Task 3");
                FindX fx = new FindX();
                fx.Launch();
                break;
            case 4:
                System.out.println("Task 4");
                Quadrant qd = new Quadrant();
                qd.Launch();
                break;
            case 5:
                System.out.println("Task 5");
                QuadraticEquation qe = new QuadraticEquation();
                qe.Launch();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    
    }
}
