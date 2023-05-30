package library;
import java.util.Scanner;
public class LibraryCard {
    private  String firstName;
    private  String lastName;
    private  int takenBooks;
    private final int limit = 10;
    Scanner scanner = new Scanner(System.in);

    public LibraryCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public LibraryCard(){}

    public void SetFirstame(String firstName){
        this.firstName = firstName;
    }

    public String GetFName(){
        return firstName;
    }

    public String GetLName(){
        return lastName;
    }    

    public void SetLastname(String lastName){
        this.lastName = lastName;
    }

    public void SetTakenBooks(int takenBooks){
        this.takenBooks = takenBooks;
    }

    public void DecrementTakenBooks(int count){
        if(takenBooks == 0 || takenBooks - count < 0){
            System.out.println("Incorrect number.Taken books are: " + takenBooks);
        }
        else{
            takenBooks -= count;
        }
    }

    public void IncrementTakenBooks(int count){
        if(takenBooks >=  limit){
            System.out.println("You cannot take more that 10 books!");
        }
        else{
            takenBooks += count;
        }
    }
    public boolean IsWantToRegister(String input){
        return input.equals("y");
    }

    private void Print(String sentence){
        System.out.print(sentence);
    }

    private void ChangeCountOfBok(String res){
        String result = res;
        if(result.equals("y"))
        {
                Print("1.Increment\n2.Decrement\nEnter: (1/2):");
                String choice = scanner.next();
                if(choice.equals("1"))
                {
                    Print("Enter a number:");
                    IncrementTakenBooks(scanner.nextInt());
                    Print(String.format("Books in list: %d", takenBooks));

                }
                else if(choice.equals("2"))
                {
                    Print("Enter a number:");
                    DecrementTakenBooks(scanner.nextInt()); 
                    Print(String.format("Books in list: %d", takenBooks));
                }
                else{
                    Print("Incorrect input number!");
                }
          
        }
        else{
            Print("Goodbye!");
        }
}


    public void Init(){    
        Print("Welocme to library!\n Do you want to register library card?(Y/n)");
        
        String choise = scanner.nextLine();

        if(IsWantToRegister(choise)){
            String result;
     
            Print("Enter a firstName: ");
            SetFirstame(scanner.nextLine());

            Print("Enter a secondName: ");
            SetFirstame(scanner.nextLine());

            Print("Enter a count of borrowed books: ");
            SetTakenBooks(scanner.nextInt());
            
            Print("Do you want to change value of borrowed books?(Y/n)");
            String a = scanner.next();
            ChangeCountOfBok(a);
            
        }
        else{
            Print("Have a good day!");
        }
    }

    public void Run(){
        Init();
    }
}