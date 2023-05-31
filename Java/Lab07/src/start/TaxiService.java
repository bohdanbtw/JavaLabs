package start;
import java.util.ArrayList;
import java.util.List;

public class TaxiService {
    public static void Init() {
        List<Car> cars = new ArrayList<>();

        Driver driver1 = new Driver("John", 30, 7);
        Driver driver2 = new Driver("Alice", 28, 3);
        // Create more drivers

        Car car1 = new Car("Toyota", 150, driver1, 10000.0, 2015);
        Car car2 = new Car("Honda", 120, driver2, 8000.0, 2012);
        // Create more cars

        cars.add(car1);
        cars.add(car2);
        // Add more cars to the list

        // Perform repairs and hire new drivers
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.repairEngine();
            Driver newDriver = new Driver("New Driver", 25, 2);
            car.hireNewDriver(newDriver);
        }

        // Increase power and price of every second car
        for (int i = 0; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            car.increasePowerAndPrice();
        }

        // Check driver experience
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getExperience() < 5 && driver.getAge() > 25) {
                driver.takeQualificationCourse();
            }
        }

        // Print random car and driver arrival
        TaxiServiceHelper.printRandomCar(cars);
    }
}