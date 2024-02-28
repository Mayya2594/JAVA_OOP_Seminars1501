package Seminar_7_HW.Logger;

import Seminar_7_HW.Model.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;

public class CalculatorLogger implements CalculatorLoggerInterface {
    @Override
    public void writeFile(String expression, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(expression + ";");
            fw.append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getExpression(ComplexNumber num1, ComplexNumber num2, ComplexNumber result, int operation) {
        String op = "";
        if (operation == 1) {
            op = "+";
        } else if (operation == 2) {
            op = "*";
        } else {
            op = "/";
        }
        return String.format("%s %s %s = %s", num1, op, num2, result);
    }
}
