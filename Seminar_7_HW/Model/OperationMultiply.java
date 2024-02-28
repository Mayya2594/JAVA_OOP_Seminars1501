package Seminar_7_HW.Model;

public class OperationMultiply extends OperationModel {

    @Override
    public ComplexNumber result(ComplexNumber num1, ComplexNumber num2) {
        double real = (num1.getRealPart()*num2.getRealPart()) - (num1.getImaginaryPart()*num2.getImaginaryPart());
        double imaginary = (num1.getRealPart()*num2.getImaginaryPart()) + (num1.getImaginaryPart()*num2.getRealPart());
        return new ComplexNumber(real, imaginary);
    }
}
