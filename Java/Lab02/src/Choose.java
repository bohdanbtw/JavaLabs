import Tasks.Calculator;
import Tasks.CheckNumbers;
import Tasks.FindX;
import Tasks.Quadrant;
import Tasks.QuadraticEquation;

public class Choose {
    private final String task;
    public Choose(String arg) {
        task = arg;
    }


    public void Run() {
        switch (task) {
            case "1":
            QuadraticEquation obj = new QuadraticEquation();
            obj.Launch();
                break;
            case "2":
            Quadrant ob = new Quadrant();
            ob.Launch();
                break;
            case "3":
            CheckNumbers num = new CheckNumbers();
            num.Launch();
                break;
            case "4":
            FindX x = new FindX();
            x.Launch();
                break;
            case "5":
            Calculator calc = new Calculator();
            calc.Launch();
                break;
            default:
                System.out.println("The current task doesnt exist!");
        }
    }   

    }

