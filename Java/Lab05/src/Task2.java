public class Task2 {
    private int first,second,third;
    public Task2(int First,int Second,int Third) {
        first = First;
        second = Second;
        third = Third; 
    }
    public Task2() {
    }

    public void GetTheSmallestNumber(){
        System.out.println("The smalllest number is: " + CalculateSMallestNumber());
    }
    private int CalculateSMallestNumber(){
        if(first < second && first < third){
            return first;
        }
        else if(second < first && second < third){
            return second;
        }
        else{
            return third;
        }
    }

    public void Init(){
        Task2 a = new Task2(1,676,235);
        a.GetTheSmallestNumber();
    }
}
