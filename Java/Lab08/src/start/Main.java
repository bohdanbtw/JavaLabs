package start;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose task [1-2]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                RandomNumberWriter rnw = new RandomNumberWriter();
                rnw.Init(args);
                break;
            case 2:
                ReadFromFile rff = new ReadFromFile();
                rff.Init(args);
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
    

}
