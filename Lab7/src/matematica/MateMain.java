package matematica;

public class MateMain {
    public static void main(String[] args){
        Numeric complex1 = new Complex(1,3);
        Numeric complex2 = new Complex(2,5);
        Numeric fractie1 = new Fractie(5,7);

        complex1.adunare(complex2);
        System.out.println("Rezultatul adunarii este: " + complex1);
        //complex1.adunare(fractie1); // compileaza cu parametrul (de tip fractie) pt ca e tip numeric
                                    // dar se obtine o exceptie la cast

        Numeric complex3 = new Complex(2,2);
        Numeric complex4 = new Complex(0,1);
        Numeric complex5 = new Complex(0,2);
        Numeric complex6 = new Complex(1,2);
        Numeric[][] matrix1 = new Numeric[][]{{complex3,complex4},{complex5,complex6}};

        Numeric complex7 = new Complex(3,1);
        Numeric complex8 = new Complex(4,4);
        Numeric complex9 = new Complex(5,0);
        Numeric complex10 = new Complex(3,3);
        Numeric[][] matrix2 = new Numeric[][]{{complex7,complex8},{complex9,complex10}};


        Matrice matrice1 = new Matrice(2,2,matrix1);
        Matrice matrice2 = new Matrice(2,2,matrix2);

        matrice1.adunare(matrice2);
        System.out.println("Rezultatul adunarii matriciilor cu numere complexe: ");
        System.out.println(matrice1);


        Numeric fractie2 = new Fractie(2,1);
        Numeric fractie3 = new Fractie(3,3);
        Numeric fractie4 = new Fractie(2,4);
        Numeric fractie5 = new Fractie(1,5);
        Numeric[][] matrix3 = new Numeric[][]{{fractie2,fractie3},{fractie4,fractie5}};

        Numeric fractie6 = new Fractie(3,4);
        Numeric fractie7 = new Fractie(2,2);
        Numeric fractie8 = new Fractie(6,3);
        Numeric fractie9 = new Fractie(5,1);
        Numeric[][] matrix4 = new Numeric[][]{{fractie6,fractie7},{fractie8,fractie9}};

        Matrice matrice3 = new Matrice(2,2,matrix3);
        Matrice matrice4 = new Matrice(2,2,matrix4);

        matrice3.adunare(matrice4);
        System.out.println("Rezultatul adunarii matriciilor cu fractii: ");
        System.out.println(matrice3);

        matrice1.adunare(matrice3);
        System.out.println("Rezultatul adunarii dintre matriciile 1(complex) si 3(fractie): ");
        System.out.println(matrice1);
    }
}
