package Seminar_7_HW.Model;

public class OperationDivide extends OperationModel {

    @Override
    public ComplexNumber result(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException {
        double denomination = (num2.getRealPart()*num2.getRealPart()) + (num2.getImaginaryPart()* num2.getImaginaryPart());
        if (denomination == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        double real = ((num1.getRealPart()*num2.getRealPart())
                + (num1.getImaginaryPart()* num2.getImaginaryPart()))
                /denomination;
        double imaginary = ((num1.getImaginaryPart()*num2.getRealPart())
                - (num1.getRealPart()*num2.getImaginaryPart()))
                /denomination;
        return new ComplexNumber(real, imaginary);
    }
}
