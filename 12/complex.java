class Complex {
    double real, img;

    // constructor to initialise complex number
    Complex(int r, int i) {
        real = r;
        img = i;
    }

    // function to add to complex numbers
    Complex addComp(Complex C1, Complex C2) {
        Complex sum = new Complex(0, 0);
        sum.real = C1.real + C2.real;
        sum.img = C1.img + C2.img;
        return sum;
    }
}

class ComplexMain {
    public static void main(String[] args) {
        // create 3 complex numbers using objects of Complex class
        Complex C1 = new Complex(2, 3);
        Complex C2 = new Complex(5, 6);
        Complex C3 = new Complex(0, 0);

        // print two complex numbers
        System.out.println("Complex number 1 : " + C1.real + " + " + C1.img + "i");
        System.out.println("Complex number 2 : " + C2.real + " + " + C2.img + "i");

        // add 2 complex numbers and display it
        C3 = C3.addComp(C1, C2);
        System.out.println("Sum of complex numbers : " + C3.real + " + " + C3.img + "i");
    }
}