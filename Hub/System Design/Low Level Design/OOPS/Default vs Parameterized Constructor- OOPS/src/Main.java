public class Main {
    public static void main(String[] args){
   Human Aadi = new Human();
//   By having parameterized constructor
   Human Aadi1 = new Human(21, "Aadi");
   Aadi.setAge(22);
   Aadi.setName("Abhi");
        System.out.println(Aadi.getName() + " " + Aadi.getAge());
        System.out.println(Aadi1.getName() +" "+ Aadi1.getAge());


    }
}