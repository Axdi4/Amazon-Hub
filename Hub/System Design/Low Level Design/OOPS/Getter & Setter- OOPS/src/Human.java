public class Human {
    private int age = 21;
    private String name = "Aadi";

//    Getter and setter methods are used to get and set values to or from local private methods in a class and give it to a different class by calling it's object.
//    The method name can be anything it doesn't have to be setAge() or getAge(). But the method name should be defining what the method working on because the code should be readable and understandable.
    public void setAge(int Age){
        age = Age;
    }

    public void setName(String Name){
        name = Name;
    }
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
