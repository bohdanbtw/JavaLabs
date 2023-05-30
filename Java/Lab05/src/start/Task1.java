package start;
public class Task1{
    private double radius;
    private final double P = 3.1415926535;
    public Task1(double R){
        radius = R;
    }
    public Task1() {
    
    }

    public void GetCircleArea(){
        System.out.println("The area of circle is: " + CalculateArea());
    }

    public double CalculateArea(){
        return P*radius*radius;
    }

    public void Init(){
        Task1 a = new Task1(2);
        a.GetCircleArea();
    }

}