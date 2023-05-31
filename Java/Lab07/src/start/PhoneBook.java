package start;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void StartPhone() {
        // Створюємо об'єкт HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додаємо елементи в карту (прізвище - номер телефону)
        phoneBook.put("Smith", "1234567890");
        phoneBook.put("Johnson", "9876543210");
        phoneBook.put("Williams", "5555555555");
        phoneBook.put("Brown", "9999999999");
        phoneBook.put("Taylor", "7777777777");
        phoneBook.put("Miller", "1111111111");
        phoneBook.put("Anderson", "2222222222");
        phoneBook.put("Thomas", "3333333333");
        phoneBook.put("Clark", "4444444444");
        phoneBook.put("Martin", "6666666666");

        // Виводимо всю інформацію з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String surname = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println(surname + ": " + phoneNumber);
        }

        // Знаходимо номер телефону за прізвищем
        String searchSurname = "Adolf";
        if (phoneBook.containsKey(searchSurname)) {
            String phoneNumber = phoneBook.get(searchSurname);
            System.out.println("Номер телефону для прізвища " + searchSurname + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній абонент з прізвищем " + searchSurname);
        }

        // Видаляємо довільний запис з книги
        String removeSurname = "Miller";
        phoneBook.remove(removeSurname);
        System.out.println("Запис для прізвища " + removeSurname + " видалено");

        // Виводимо кількість записів у книзі
        int numberOfEntries = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + numberOfEntries);
    }
}

