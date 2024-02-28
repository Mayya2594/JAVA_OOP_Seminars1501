package Seminar_7_HW.Presenter;

import Seminar_7_HW.Logger.CalculatorLogger;
import Seminar_7_HW.Model.*;
import Seminar_7_HW.View.View;

import java.util.InputMismatchException;

public class Presenter<T extends OperationModel> {

    View v;
    T model;

    public Presenter(View v, T model) {
        this.v = v;
        this.model = model;
    }

    public void startOperation()  {
        CalculatorLogger logger = new CalculatorLogger();
        String txt = "";
        try {
            ComplexNumber num1 = v.inputNumber.apply("Введите первое комплексное число (действительную и мнимую часть через пробел): ");
            ComplexNumber num2 = v.inputNumber.apply("Введите второе комплексное число (действительную и мнимую часть через пробел): ");
            int choice = v.getChoice();
            switch (choice) {
                case 1: {
                    OperationSum sum = new OperationSum();
                    ComplexNumber result = sum.result(num1, num2);
                    txt = logger.getExpression(num1, num2, result, choice);
                    System.out.println(result);
                    break;
                }
                case 2: {
                    OperationMultiply multiply = new OperationMultiply();
                    ComplexNumber result = multiply.result(num1, num2);
                    txt = logger.getExpression(num1, num2, result, choice);
                    System.out.println(result);
                    break;
                    }
                case 3: {
                    OperationDivide divide = new OperationDivide();
                    ComplexNumber result = divide.result(num1, num2);
                    txt = logger.getExpression(num1, num2, result, choice);
                    System.out.println(result);
                    break;
                }
            }
            logger.writeFile(txt, "Seminar_7_HW/Logger/Log.txt");
        } catch (InputMismatchException e) {
            System.out.println("Значения введены некорректно, повторите ввод");
        }
    }
}
