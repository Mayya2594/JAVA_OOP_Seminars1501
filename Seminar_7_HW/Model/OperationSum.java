package Seminar_7_HW.Model;

public class OperationSum extends OperationModel {

    @Override
    public ComplexNumber result(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getRealPart() + num2.getRealPart();
        double imaginary = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new ComplexNumber(real, imaginary);
    }
}
