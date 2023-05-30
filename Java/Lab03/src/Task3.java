public class Task3 {
    public Task3() {
    }

    public void Init() {
        int hour = 0;
        int minute = 0;

        while (hour <= 2) {
            System.out.printf("%d h %d min\n", hour, minute);
            minute++;

            if (minute == 60) {
                hour++;
                minute = 0;
            }
        }

    }
}
