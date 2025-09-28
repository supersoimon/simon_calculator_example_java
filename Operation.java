public class Operation {
    protected double number1;
    protected double number2;
    protected double result;

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public double result() {
        return this.result;
    }
}