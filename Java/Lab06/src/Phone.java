public class Phone {
    private String number;
    private int weight;
    private String model;

    public Phone(String number, int weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public String GetNumber(){
        return number;
    }


    public void receiveCall(String caller){
        System.out.println("Calling " + caller);
    }

    public void receiveCall(String caller,String number){
        System.out.println("Calling: " + caller + ". Number: " + number);
    }

    public void SendMessage(String message, String[] numbers){
        for (String number : numbers) {
            System.out.println("The message was sent to: " + number);
        }
    }

}
