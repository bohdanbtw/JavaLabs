public class Task3 {
    private int[] array;

    public Task3(int[] Array) {
        array = Array;
    }
    public Task3(){
    }

    public void PrintArray(){
        for(int i =0; i < array.length;i++){
            System.out.print(array[i] + ", ");
                }
    }

    public void Init(){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,9,32,565,76,332,2134,4};
        Task3 a = new Task3(arr);
        a.PrintArray();
    }
}
