public class B extends A{
    public B() {
        super();
        System.out.println("In B");
    }
    public B(int n){
//        The super method calls the constructor of the parent/super class so giving parameters will call the constructor which allows parameter in the super class.
//        super(n);
//        Whereas this will execute the constructor of the same class.
//        this();
        System.out.println("In B int");
    }
}
