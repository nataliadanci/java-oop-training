package tablouri;

public class DemoComplex {
    public static  void main(String[] args){
        Complex[][] m = new Complex[2][2];
        //alocam memorie si si initializam valori
        //Complex[][] m = new Complex[][]{{new Complex(5,7),new Complex(2,3)},{new Complex(3,4),new Complex(5,6)}};
        m[0][0] = new Complex(5,7);
        m[0][1] = new Complex(2,3);
        m[1][0] = new Complex(3,4);
        m[1][1] = new Complex(5,6);
        Matrice matrice1 = new Matrice(m,2,2);
        System.out.println("Initial matrix1");
        System.out.println(matrice1);
        matrice1.multiplyMatrixByScalar(10);
        System.out.println(matrice1);

        Complex[][] m2 = new Complex[2][2];
        m2[0][0] = new Complex(1,1);
        m2[0][1] = new Complex(3,3);
        m2[1][0] = new Complex(2,1);
        m2[1][1] = new Complex(1,0);
        Matrice matrice2 = new Matrice(m2,2,2);
        System.out.println("Second matrix ");
        System.out.println(matrice2);
        matrice1.addMatrix(matrice2);
        System.out.println("Rezultat adunare: ");
        System.out.println(matrice1);
        /*Matrice matrice3 = MatrixOperation.add(matrice1,matrice2);
        System.out.println("Add result: ");
        System.out.println(matrice3);*/  // preferam sa lucram cu obiecte, nu cu metode statice


    }



}
