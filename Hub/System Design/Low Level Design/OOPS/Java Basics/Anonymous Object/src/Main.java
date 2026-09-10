public class Main {
    public static void main(){
//        Object creating with a reference variable.
        A obj = new A();
//        Object creating without reference variable. So the object get created in the heap whereas there will be no reference variable created in the stack to access it.
        new A().show();     // Anonymous Object
//        The problem with anonymous object it can't be called again.(can't be reused)
    }
    
}