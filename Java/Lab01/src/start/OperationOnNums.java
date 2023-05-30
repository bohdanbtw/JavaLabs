package start;
public class OperationOnNums {
    public void PrintResults(){
        int a = 5;
        int b = 7;
        int c = 2;
        int d = 10;
        int e = 3;
        int f = 8;
        int g = 1;
        int h = 4;
        int i = 6;
        int j = 9;
        
        int sum = a + b + c + d + e + f + g + h + i + j;
        int difference = a - b - c - d - e - f - g - h - i - j;
        int product = a * b * c * d * e * f * g * h * i * j;
        int division = a / b / c / d / e / f / g / h / i / j;
        
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The division is " + division);
    }
}
