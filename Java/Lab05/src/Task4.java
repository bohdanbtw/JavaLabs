public class Task4 {
    private int[] array;

    public Task4(int[] Array) {
        array = Array;
    }
    public Task4(){
    }

    public void GetTheBiggestNum(){
        System.out.println("The biggest number from array is: " + CalculateTheBiggestNum());
    }
    private int CalculateTheBiggestNum(){
        int n = array.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(array[j-1] > array[j]){  
                                 //swap elements  
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                         }  
                          
                 }  
         }  
         return array[array.length - 1];
    }

    public void Init(){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,9,32,565,76,332,2134,4};
        Task4 a = new Task4(arr);
        a.GetTheBiggestNum();
    }
}
