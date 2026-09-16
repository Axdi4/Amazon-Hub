public class Main {
    public static void main(String[] args){
//        creating the object of the inherited class.
 AdvCalculator Calc = new AdvCalculator();
 int r1 = Calc.add(67, 69);
 int r2 = Calc.sub(91, 34);
 int r3 = Calc.divide(76, 82);
 int r4 = Calc.multiply(74, 90);
 double r5 = Calc.pow(23, 34);

        System.out.println("Adding n1 & n2: " + r1);
        System.out.println("Subtracting n1 & n2: " + r2);
        System.out.println("Dividing n1 & n2: " + r3);
        System.out.println("Multiplying n1 & n2: " + r4);
        System.out.println("Power of n1 & n2: " + r5);

    }
}