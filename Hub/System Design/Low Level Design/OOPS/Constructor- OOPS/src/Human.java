public class Human {
    private int age;
    private String name;
//  a constructor is a special block of code used to initialize objects when they are created.  It shares the same name as the class, has no return type (not even void), and is automatically invoked when the new keyword is used to instantiate a class.

    public Human(){
        System.out.println("Constructor created!");
//        giving default values.
        age = 21;
        name = "Aadi";
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
