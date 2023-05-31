package start;
import java.util.Scanner;

public class Main {
    public static void main(String[] arrays){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose task [1-2]");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                TaxiService taxi = new TaxiService();
                taxi.Init();
                break;
            
            case 2:
                PhoneBook pb = new PhoneBook();
                pb.Init();
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
        
    }
    
}
