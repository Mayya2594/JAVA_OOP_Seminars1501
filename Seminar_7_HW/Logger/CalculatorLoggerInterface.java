package Seminar_7_HW.Logger;


import Seminar_7_HW.Model.ComplexNumber;

public interface CalculatorLoggerInterface {
    public void writeFile(String expression, String nameFile);
    public String getExpression(ComplexNumber num1, ComplexNumber num2, ComplexNumber result, int operation);
}
