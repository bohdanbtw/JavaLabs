package start;

public class Main{
    public static void main(String[] args){


        System.out.println("Task 1");
        OperationOnNums operationonnums = new OperationOnNums();
        operationonnums.PrintResults();
        System.out.println();


        System.out.println("Task 2");
        Car car = new Car();
        car.Init();
        car.PrintInfo();
        System.out.println();


        System.out.println("Task 3");
        ReverseNumber reverse = new ReverseNumber();
        reverse.Reverse();
        System.out.println();


        System.out.println("Task 4");
        Sentence sentence = new Sentence();
        sentence.CreateAndPrint();
        System.out.println();

        
        System.out.println("Task 5");
        User user = new User();
        user.Init();
        user.PrintUserInfo();
    }
}