package start;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task [1-2-3-4]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Task 1");
                Task1 t1 = new Task1();
                t1.Init();
                break;
            case 2:
                System.out.println("Task 2");
                Task2 t2 = new Task2();
                t2.Init();
                break;
            case 3:
                System.out.println("Task 3");
                Task3 t3 = new Task3();
                t3.Init();
                break;
            case 4:
                System.out.println("Task 4");
                Task4 t4 = new Task4();
                t4.Init();  
                break;
            default:
                System.out.println("Wrong number");
                break;       
        }
        




        


       
    }
}
