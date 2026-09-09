public class Main {
    public static void main(String[] args){
//        Whenever the object get created, the parameters should be created/initialized with it, instead of producing default null values, you can set up default values for the parameters, To achieve this Constructors are used.
   Human Aadi = new Human();
   Human Aadi1 = new Human();
   Aadi1.setAge(22);
   Aadi1.setName("Abhi");
        System.out.println(Aadi.getName() + " " + Aadi.getAge());
        System.out.println(Aadi1.getName() +" "+ Aadi1.getAge());


    }
}