public class Task4{
    public Task4() {
    }

    public void Init(){
        for (int h = 0; h < 3; h++) { // hours loop
            for (int m = 0; m < 60; m++) { // minutes loop
                for (int s = 0; s < 60; s++) { // seconds loop
                    System.out.printf("%d h %d min %d sec\n", h, m, s);
                }
            }
        }
        
    }
}