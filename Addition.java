public class Addition extends Operation {
    public Addition(double n1, double n2) {
        super(n1, n2);
        this.result = this.number1 + this.number2;
    }
    public double result() {
        System.out.println("Performing addition");
        return this.result;
    }
    
}
