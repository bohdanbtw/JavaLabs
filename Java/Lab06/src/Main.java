import figures.Ball;
import figures.Cylinder;
import figures.Pyramid;
import figures.Shape;
import figures.SolidOfRevolution;
import figures.Task3;
import library.LibraryCard;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task [1-2-3-4-5]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.print("Task 1");
                Person person = new Person("Bohdan",19);
                person.Move();
                person.Talk();
                break;
            case 2:
                System.out.print("Task 2");
                Phone phone = new Phone();
                phone.receiveCall("Bohdan");
                phone.receiveCall("Bohdan","380111111111");
                phone.SendMessage("Bohdan",new String[]{"pineapple", "banana", "orange"});
                break;
            case 3:
                System.out.print("Task 3");
                Task3 task3 = new Task3();
                task3.TestFigures();
                break;
            case 4:
                System.out.print("Task 4");
                Sedan sedan = new Sedan();
                sedan.Init();
                break;
            case 5:
                System.out.print("Task 5");
                LibraryCard card = new LibraryCard();
                card.Run();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
        


        
            

        

        

            
        }
    
}
