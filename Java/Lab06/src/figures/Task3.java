package figures;

public class Task3 {
    public void TestFigures(){
        Shape shape;
                SolidOfRevolution solid = new SolidOfRevolution();
                Cylinder cylinder = new Cylinder();
                Ball ball = new Ball();
                Pyramid pyramid = new Pyramid();
                
                System.out.println("Printing solid...");
                System.out.println(solid);
                
                shape = solid;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = cylinder;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = ball;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                shape = pyramid;
                System.out.println("Printing shape...");
                System.out.println(shape);
                
                solid = cylinder;
                System.out.println("Printing solid...");
                System.out.println(solid);
                
                solid = ball;
                System.out.println("Printing solid...");
                System.out.println(solid);
    }
}
