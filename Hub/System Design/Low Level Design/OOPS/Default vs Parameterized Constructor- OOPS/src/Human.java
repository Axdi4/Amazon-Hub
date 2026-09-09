public class Human {
    private int age;
    private String name;
// Default Constructor, we assign default values.
    public Human(){
        System.out.println("Constructor created!");
//        giving default values.
        age = 21;
        name = "Aadi";
    }
// Parameterized Constructor, the values are taken from the object. we are using this. keyword to share the same name.
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){

        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
