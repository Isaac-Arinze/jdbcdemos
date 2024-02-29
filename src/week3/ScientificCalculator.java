package week3;


public class ScientificCalculator extends SimpleCalculator implements ComplexArithmetic {
    @Override
    public double power(double number, double power) {
        return Math.pow(number, power);
    }

    @Override
    public double max(double... numbers) {
        double max = Double.MIN_VALUE;
        for( double x : numbers ){
            if( x > max ){
                max = x;
            }
        }
        return max;
    }

    @Override
    public double average(double figure, double digit) {

        return average(34, 12);
    }

    public double doAdditionAgain(Arithmetic arithmetic, double x, double y){
        return arithmetic.addition(x, y);
    }

    public double findMax(ComplexArithmetic complexArithmetic, double... numbers){
        return complexArithmetic.max(numbers);
    }
}