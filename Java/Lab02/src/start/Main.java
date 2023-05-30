package start;

public class Main {
    public static void main(String[] arrays){
        System.out.println("Task 1");
        Calculator calc = new Calculator();
        calc.Launch();


        System.out.println("Task 2");
        CheckNumbers cn = new CheckNumbers();
        cn.Launch();


        System.out.println("Task 3");
        FindX fx = new FindX();
        fx.Launch();


        System.out.println("Task 4");
        Quadrant qd = new Quadrant();
        qd.Launch();


        System.out.println("Task 5");
        QuadraticEquation qe = new QuadraticEquation();
        qe.Launch();
    }
}
