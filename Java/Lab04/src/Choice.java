public class Choice {
    private final String task;
    public Choice(String arg) {
        task = arg;
    }


    public void Run() {
        switch (task) {
            case "1":
                Task1 task1 = new Task1();
                task1.Init();
                break;
            case "2":
            Task2 task2 = new Task2();
           task2.Init();
                break;
            case "3":
            Task3 task3 = new Task3();
            task3.Init();
                break;
            case "4":
            Task4 task4 = new Task4();
                task4.Init();
                break;
            default:
                System.out.println("The current task doesnt exist!");
        }
    }   

    }

