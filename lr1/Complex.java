public class Complex {
    private double real;
    private double imaginary;

    public Complex() {}

    public Complex(double _real, double _imaginary) {
        this.real = _real;
        this.imaginary = _imaginary;
    }
    
    public void setReal(double _real) {
        this.real = _real;
    }

    public void setImaginary(double _imaginary) {
        this.imaginary = _imaginary;
    }
    
    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public Complex add(Complex _complex) {
        return new Complex(real + _complex.real, imaginary + _complex.imaginary);
    }

    public Complex sub(Complex _complex) {
        return new Complex(real - _complex.real, imaginary - _complex.imaginary);
    }
    
    public Complex multiply(Complex _complex) {
        return new Complex(real * _complex.real - imaginary * _complex.imaginary, real * _complex.imaginary + imaginary * _complex.real);
    }
    
    public Complex divide(Complex _complex) {
        double d = _complex.real * _complex.real + _complex.imaginary * _complex.imaginary;
        return new Complex((real * _complex.real + imaginary * _complex.imaginary) / d, (imaginary * _complex.real - real * _complex.imaginary) / d);
    }
    
    public double abs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double arg() {
        if (this.real >= 0) {
            return 180 * (Math.atan(this.imaginary / this.real)) / Math.PI;
        } else if (this.imaginary < 0) {
            return 180 * (Math.atan(this.imaginary / this.real) - Math.PI) / Math.PI;
        } else {
            return 180 * (Math.atan(this.imaginary / this.real) + Math.PI) / Math.PI;
        } 
    }
    
    public String toString() {
        if (this.real == 0) {
            return imaginary + "i";
        }
        if (this.imaginary == 0) {
            return ""+ real;
        }
        return real + " + " + imaginary + "i";
    }
}