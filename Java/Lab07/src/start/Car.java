package start;

import java.util.List;
import java.util.Random;

class Car {
    private String brand;
    private int enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, int enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void repairEngine() {
        double increasedPower = enginePower * 1.1;
        enginePower = (int) increasedPower;
    }

    public void hireNewDriver(Driver newDriver) {
        driver = newDriver;
    }

    public void increasePowerAndPrice() {
        double increasedPower = enginePower * 1.1;
        enginePower = (int) increasedPower;

        double increasedPrice = price * 1.05;
        price = increasedPrice;
    }
}

class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public void takeQualificationCourse() {
        experience++;
    }
}

class TaxiServiceHelper {
    public static void printRandomCar(List<Car> cars) {
        Random random = new Random();
        int randomIndex = random.nextInt(cars.size());
        Car randomCar = cars.get(randomIndex);

        System.out.println("Автомобіль марки " + randomCar.getBrand() +
                " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        driverArrived(randomCar);
    }

    public static void driverArrived(Car car) {
        System.out.println("Водій " + car.getDriver().getName() + " прибув на місце.");
    }
}


