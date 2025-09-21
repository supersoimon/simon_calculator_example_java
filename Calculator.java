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
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }

    }
}