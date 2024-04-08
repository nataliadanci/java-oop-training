package tablouri;

public class Complex {

    private int re;
    private int im;

    public Complex(int re, int im){
        this.re = re;
        this.im = im;
    }
    public int getRe(){
        return re;
    }
    public int getIm(){
        return im;
    }
    public void multiplyByScalar(int scalar){
        re = re*scalar;
        im = im*scalar;
    }

    public void add(Complex nr2){
        re = re + nr2.re;
        im = im + nr2.im;
    }

    @Override
    public String toString(){
        return re + "+" + im + "i";
    }

}
