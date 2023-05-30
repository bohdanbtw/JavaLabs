public class Person {
    private String fullName;
    private int age;


    public Person() {
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;

    }
    
    public void Talk(){
        System.out.println(fullName + " is talking now");
    }

    public void Move(){
        System.out.println(fullName + " is moving now");
    }
}
