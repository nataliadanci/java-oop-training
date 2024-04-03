package tablouri;

public class Matrice {

    private Complex[][] matrix;
    private int nrLines;
    private int nrColumns;

    public Matrice(Complex[][] matrix, int nrLines, int nrColumns){
        this.matrix = matrix;
        this.nrLines = nrLines;
        this.nrColumns = nrColumns;
    }

    public Complex[][] getMatrix(){
        return matrix;
    }

    public int getNrLines(){
        return nrLines;
    }
    public int getNrColumns(){
        return nrColumns;
    }

    public void multiplyMatrixByScalar(int scalar){
        for(int i = 0 ; i < nrLines ; i++){
            for(int j = 0 ; j < nrColumns ; j++){
               matrix[i][j].multiplyByScalar(scalar);
            }
        }
    }

    public void addMatrix(Matrice matrice2){
        for(int i = 0;i<nrLines;i++){
            for(int j=0; j < nrColumns ;j++){
                matrix[i][j].add(matrice2.matrix[i][j]);
            }
        }
    }


    @Override
    public String toString() {
        String result = "";
        for(int i = 0 ; i < nrLines ; i++){
            for(int j = 0 ; j < nrColumns ; j++){
                result = result + matrix[i][j] + "   ";
            }
            result = result + "\n";
        }
        return result;
    }
}
