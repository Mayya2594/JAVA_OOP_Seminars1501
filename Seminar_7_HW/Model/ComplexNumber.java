package Seminar_7_HW.Model;

public class ComplexNumber implements ComplexNumberInterface {

    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart > 0) return "(" + realPart + "+" + imaginaryPart + "i)";
        else if (imaginaryPart == 0) return "(" + realPart + ")";
        else return "(" + realPart + imaginaryPart + "i)";
    }
}
