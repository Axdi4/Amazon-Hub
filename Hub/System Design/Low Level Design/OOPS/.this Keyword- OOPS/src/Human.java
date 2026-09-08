public class Human {
    private int age;
    private String name;
//  this keyword in Java is a reference variable that refers to the current object (instance) of the class in which it is used.  It is automatically available in all non-static methods and constructors, allowing the object to refer to itself.
//  this. distinguishes between instance variables and method parameters or local variables that share the same name (e.g., this.name = name;).
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
