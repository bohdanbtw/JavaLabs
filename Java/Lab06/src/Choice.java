import figures.Ball;
import figures.Cylinder;
import figures.Pyramid;
import figures.Shape;
import figures.SolidOfRevolution;
import figures.Task3;
import library.LibraryCard;

public class Choice {
        public Choice() {
          
        }
    
        public  void Run(String task) {
            switch (task) {
                case "1":
                    Person person = new Person("Andrii",19);
                    person.Move();
                    person.Talk();
                    break;
                case "2":
                    Phone phone = new Phone();
                    phone.receiveCall("Andrii");
                    phone.receiveCall("Andrii","112324332");
                    phone.SendMessage("Andrii",new String[]{"apple", "banana", "orange"});
                    break;
                case "3":
                    Task3 task3 = new Task3();
                    task3.TestFigures();
                    break;
                case "4":
                    Sedan sedan = new Sedan();
                    sedan.Init();
                    break;
                case "5":
                    LibraryCard card = new LibraryCard();
                    card.Run();
                    break;
                default:
                    System.out.println("The current task doesnt exist!");
            }
        
    
        }
    
    }

