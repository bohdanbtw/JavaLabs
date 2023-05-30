package start;

public class User {

    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    private User[] users;
    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    public User(){}

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }


    public void Init(){
         users = new User[] {
            new User(1, 20, "John", "Doe", 70.5, 175.0),
            new User(2, 25, "Jane", "Doe", 65.0, 165.0),
            new User(3, 30, "Bob", "Smith", 80.0, 180.0),
            new User(4, 35, "Alice", "Smith", 55.5, 160.0),
            new User(5, 40, "Tom", "Johnson", 90.0, 185.0),
            new User(6, 45, "Mary", "Johnson", 75.0, 170.0),
            new User(7, 50, "David", "Williams", 68.0, 175.0),
            new User(8, 55, "Samantha", "Williams", 60.0, 160.0),
            new User(9, 60, "George", "Brown", 95.0, 190.0),
            new User(10, 65, "Elizabeth", "Brown", 85.0, 175.0)

    };
    }

    public void PrintUserInfo(){
        int age = 0;
        double weight = 0;
        double height = 0;

        for (User user : users) {
            age += user.age;
            weight += user.weight;
            height += user.height;
        }

        System.out.println("The age of ten users is: " + age);
        System.out.println("The weight of ten users is: " + weight);
        System.out.println("The height of ten users is: " + height);
    }

}
        
        
