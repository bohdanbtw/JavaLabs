public class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }
    public Sedan() {
        super();
    }

    @Override
    public void brake() {
        System.out.println("Braking the sedan!");
    }

    public void Init() {
        Sedan sedan = new Sedan("BMW", "Black", 200);
        Truck truck = new Truck("Volvo", "Red", 150);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();

    }
}
