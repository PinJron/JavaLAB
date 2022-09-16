public class Complex {
    double x;
    double y;

    public Complex() {}

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;

    }
    
    public Complex add(Complex b) {
        return new Complex(x + b.x, y + b.y);
    }

    public Complex sub(Complex b) {
        return new Complex(x - b.x, y - b.y);
    }

    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    public double arg() {
        if (this.x >= 0) {
            return 180*(Math.atan(this.y / this.x))/Math.PI;
        } else if (this.y < 0) {
            return 180*(Math.atan(this.y / this.x) - Math.PI)/Math.PI;
        } else {
            return 180*(Math.atan(this.y / this.x) + Math.PI)/Math.PI;
        } 
    }
    
    public String toString() {
        if (this.x == 0) {
            return y + "i";
        }
        if (this.y == 0) {
            return ""+ x;
        }
        return x + " + " + y + "i";
    }
}