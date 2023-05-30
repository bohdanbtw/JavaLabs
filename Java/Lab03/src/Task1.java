public class Task1 {
    public Task1() {
    }
    public void Init(){
        String phrase = "Hello, world!"; // Change this to any phrase you like

        // Using a for loop
        System.out.print("Using a for loop:");
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Using a while loop
        System.out.print("Using a while loop:");
        int count = 0;
        while (count < 50) {
            System.out.println(phrase);
            count++;
        }
    }
}
