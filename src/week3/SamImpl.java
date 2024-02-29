package week3;

public class SamImpl implements Sam{
    @Override
    public double addition(double first, double second) {
        return first + second;
    }

    @Override
    public double subtraction(double first, double second) {
        return first - second;
    }

    @Override
    public double multiplication(double first, double second) {
        return first * second;
    }
    @Override
    public double division(double first, double second) {
        return first / second;
    }

        public static void  display (Sam sam){
            System.out.println(sam.toString());
        }

    public static void main(String[] args) {
        Sam sam = new SamImpl();
        System.out.println(sam.addition(4.5, 6.8));
        System.out.println(sam.subtraction(6.3, 1.2));
        System.out.println(sam.multiplication(2.3, 1.2));
        System.out.println(sam.division(6.3, 3.8));
        display(sam);
    }
}
