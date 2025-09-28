package simon_calculator_example_java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        char operation;
        Scanner scanner;
        Operation equation;
        try {
            scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine().trim();
                operation = inputLine.charAt(0);
                num1 = Double.parseDouble(inputLine.substring(inputLine.indexOf(" "), inputLine.lastIndexOf(" ")));
                num2 = Double.parseDouble(inputLine.substring(inputLine.indexOf(" "), inputLine.lastIndexOf(" ")));
                System.out.printf("num1=%.2f, num2=%.2f, operation=%s\n", num1, num2, operation);
            switch(operation) {
                case '+':
                    //do addition
                    equation = new Addition(num1, num2);
                break;
                case '-':
                    //do subtraction
                    equation = new Subtration(num1, num2);
                break;
                case '*':
                    //do multiplication
                    equation = new Multiplication(num1, num2);
                break;
                case '/':
                    //do division
                    if (num2 == 0) {
                        System.err.println("Division by zero!");
                        break;
                    }
                    else {
                        equation = new Division(num1, num2);
                    }
                break;
                default:
                    System.err.println("Invalid operation!");
            }
            System.out.println("the result is " + equation.result());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
        

    }
}