package Theory_Assignment1;

public class Complex {
    int real=0,real2=0,real3=0;
    int imag=0,imag2=0,imag3=0;

    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }
    Complex(int real,int real2, int imag, int imag2){
        this.real = real;
        this.real2 = real2;
        this.imag = imag;
        this.imag2 = imag2;
    }
    Complex(int real,int real2,int real3, int imag, int imag2, int imag3){
        this.real = real;
        this.real2 = real2;
        this.real3 = real3;
        this.imag = imag;
        this.imag2 = imag2;
        this.imag3 = imag3;
    }

    Complex add(Complex c){
        c.real = real+real2+real3;
        c.imag = imag+imag2+imag3;

        return c;
    }
}
