package Tasks;
import java.util.Scanner;


public class QuadraticEquation {
    private   double a;
    private   double b;
    private   double c;
    Scanner scanner = new Scanner(System.in);
    public QuadraticEquation(){
        
    }

    public void Launch(){
        System.out.println("Enter a coefficient for a:");
        a = scanner.nextInt();
        System.out.println("Enter a coefficient for b:");
        b = scanner.nextInt();
        System.out.println("Enter a coefficient for c:");
        c = scanner.nextInt();
        System.out.println(calculateRoots());
    }

    private double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    private String calculateRoots() {
        double discriminant = calculateDiscriminant();

        if (discriminant < 0) {
            return "Equation does not have roots!";
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return String.format("The equation has one real root: %.2f", root);

        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return String.format("The equation has two real roots: %.2f and %.2f", root1, root2);
        }
    }


}
