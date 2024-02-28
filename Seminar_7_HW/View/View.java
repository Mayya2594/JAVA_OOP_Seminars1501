package Seminar_7_HW.View;

import Seminar_7_HW.Model.ComplexNumber;

import java.util.Scanner;
import java.util.function.Function;

public class View {

    Scanner sc = new Scanner(System.in);

    public Function<String, ComplexNumber> inputNumber = new Function<String, ComplexNumber>() {
        @Override
        public ComplexNumber apply(String msg) {
            System.out.println(msg);
            double realPart = sc.nextDouble();
            double imaginaryPart = sc.nextDouble();
            return new ComplexNumber(realPart, imaginaryPart);
        }
    };

    public int getChoice() {
        System.out.println("Выберите операцию: \n");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");
        return sc.nextInt();
    }
}
