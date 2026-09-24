public class Main{
    public static void main(String[] args){
        CustomCalculator calc = new CustomCalculator();
        Calculator calcu = new Calculator();
        int r1 = calc.calculate(4,5);
        int r2 = calcu.calculate(4,5);
        System.out.println(r1);
        System.out.println(r2);
    }
}