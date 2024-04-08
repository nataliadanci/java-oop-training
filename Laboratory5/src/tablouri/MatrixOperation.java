package tablouri;

public class MatrixOperation {

    public static Matrice add(Matrice matrice1, Matrice matrice2){
        int lines = matrice1.getNrLines();
        int columns = matrice1.getNrColumns();
        Matrice result = new Matrice(new Complex[lines][columns], lines, columns);
        for(int i = 0; i < lines ;i++){
            for(int j = 0; j < columns ;j++){
                result.getMatrix()[i][j] = ComplexOperation.add(matrice1.getMatrix()[i][j], matrice2.getMatrix()[i][j]);
            }
        }
        return result;
    }
}
