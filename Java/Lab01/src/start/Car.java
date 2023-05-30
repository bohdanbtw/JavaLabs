package start;
public class Car {
    public int power;
    public int capacity;
    public String model;
    public int year;
    public String color;
    public int maxSpeed;
    public int miles;

    private Car[] cars;

    public Car(int power, int capacity, String model, int year, String color, int maxSpeed, int miles) {
        this.power = power;
        this.capacity = capacity;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.miles = miles;
    }

    public Car(){

    }

    public void  Init(){
         cars = new Car[] {
            new Car(200, 4, "Toyota Camry", 2019, "White", 180, 5000),
            new Car(300, 5, "Ford Mustang", 2022, "Red", 220, 1000),
            new Car(150, 3, "Honda Civic", 2015, "Black", 160, 80000),
            new Car(250, 4, "Mercedes Benz", 2021, "Silver", 200, 3000),
            new Car(180, 4, "Nissan Altima", 2018, "Gray", 170, 20000),
            new Car(220, 5, "Chevrolet Camaro", 2020, "Blue", 210, 5000),
            new Car(190, 4, "Hyundai Sonata", 2017, "White", 175, 25000),
            new Car(270, 5, "Dodge Challenger", 2022, "Yellow", 230, 1000),
            new Car(200, 4, "Kia Optima", 2016, "Red", 180, 35000),
            new Car(150, 3, "Toyota Corolla", 2014, "Silver", 160, 90000),
        };
    }

    public void PrintInfo(){
        int allPower = 0;
        int allCapacity = 0;

        for (Car c : cars) {
            allPower += c.power;
            allCapacity += c.capacity;
        }

        System.out.println("The all horsepower of ten cars: " + allPower);
        System.out.println("The all capacity of ten cars: " + allCapacity);
    }
}
        
    