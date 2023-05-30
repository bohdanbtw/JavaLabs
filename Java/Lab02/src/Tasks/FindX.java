package Tasks;
import java.util.Scanner;

public class FindX {
    private double x;
    Scanner scanner = new Scanner(System.in);

    public FindX() {
    
    }

    public void  Launch(){
        System.out.print("Enter a x: ");
        x = scanner.nextInt();
        SolveForX(); 
    }

    public void SolveForX(){
        if(x <= 0.5)
        {
            System.out.println("x is: " + Math.abs(3 - Math.tan(x)));
        }
        else if( x < 1 && x > 0.5){
            System.out.println("x is: " + Math.pow(0.2, Math.sqrt((2 - x) / 3)));
        }
        else if(x >= 1){
            System.out.println("x is: " + (Math.sin(x) - ((1/3) * Math.cos(Math.pow(0.2, x)))));

        }
        else{
            System.out.println("Cannot solve for x: " + x);
        }
    }

    
}
