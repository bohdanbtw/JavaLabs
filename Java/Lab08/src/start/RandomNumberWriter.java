package start;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumberWriter {
    public static void Init(String[] args) {
        String fileName = "random_numbers.txt";
        int b1 = 1;
        int b2 = 100;
        int count = 10;

        try {
            FileWriter writer = new FileWriter("Lab08/src/" + fileName);

            for (int i = 0; i < count; i++) {
                int randomNumber = generateRandomNumber(b1, b2);
                writer.write(randomNumber + "\n");
            }

            writer.close();
            System.out.println("Файл " + fileName + " був створений та заповнений випадковими числами.");
        } catch (IOException e) {
            System.out.println("Виникла помилка при роботі з файлом: " + e.getMessage());
        }
    }

    private static int generateRandomNumber(int b1, int b2) {
        return new Random().nextInt(b2 - b1 + 1) + b1;
    }
}
