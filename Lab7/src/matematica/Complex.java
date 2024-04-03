package matematica;

public class Complex implements Numeric {

    private int re;
    private int im;

    public Complex(int re,int im){
        this.re = re;
        this.im = im;
    }
    @Override
    public void adunare(Numeric number2) {
        Complex complex2 = (Complex) number2;
        this.re = this.re + complex2.re;
        this.im = this.im + complex2.im;
    }
    @Override
    public void scadere(Numeric number2) {
        Complex complex2 = (Complex) number2;
        this.re = this.re - complex2.re;
        this.im = this.im - complex2.im;
    }
    @Override
    public void inmultire(Numeric number2) {
        Complex complex2 = (Complex) number2;
        this.re = this.re*complex2.re;
        this.im = this.im*complex2.im;
    }

    public String toString(){
        return " " + this.re + " + " + this.im + "i";
    }
}
