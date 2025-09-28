package simon_calculator_example_java;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        char operation;
        Scanner scanner;
        try {
            scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                operation = inputLine.charAt(0);
                num1 = Double.parseDouble(inputLine.substring(inputLine.indexOf(" "),
                                          inputLine.lastIndexOf(" ")));
                num2 = Double.parseDouble(inputLine.substring(inputLine.indexOf(" "),
                                          inputLine.lastIndexOf(" ")));
                System.out.printf("num1=%.2f, num2=%.2f, operation=%s\n", num1, num2, operation);
            }  
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
        

    }
}