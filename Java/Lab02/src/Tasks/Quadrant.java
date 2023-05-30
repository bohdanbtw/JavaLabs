package Tasks;
import java.util.Scanner;

public class Quadrant {
    private int x;
    private int y;
     Scanner in = new Scanner(System.in);

    public Quadrant() {
        
    }


    public void Launch() {
        System.out.print("Enter the x-coordinate: ");
         x = in.nextInt();

        System.out.print("Enter the y-coordinate: ");
        y = in.nextInt();

        System.out.println(getQuadrant());
    }

    
    private String getQuadrant() {
        if (x > 0 && y > 0) {
            return "First quadrant";
        } else if (x < 0 && y > 0) {
            return "Second quadrant";
        } else if (x < 0 && y < 0) {
            return "Third quadrant";
        } else if (x > 0 && y < 0) {
            return "Fourth quadrant";
        } else {
            return "Origin"; // point is on the origin
        }
    }
    
    
}
