// By using extends we are providing a is-a relationship from the calculator to the adv calculator. So that operation of basic calculator can be done in adv calculator.
public class AdvCalculator extends Calculator{

    public double pow(double n1, double n2){
        return Math.pow(n1,n2);
    }
}
