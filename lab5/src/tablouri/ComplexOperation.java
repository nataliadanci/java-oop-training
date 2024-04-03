package tablouri;

public class ComplexOperation {
    public static Complex add(Complex complex1, Complex complex2){
        int reResult = complex1.getRe()+complex2.getRe();
        int imResult = complex1.getIm() + complex2.getIm();
        return new Complex(reResult,imResult);
    }
}
