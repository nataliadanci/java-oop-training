package matematica;

public class Matrice {

    private int nrLines;
    private int nrColumns;
    private Numeric[][] matrix;

    public Matrice(int nrLines,int nrColumns,Numeric[][] matrix){
        this.nrLines = nrLines;
        this.nrColumns = nrColumns;
        this.matrix = matrix;
    }

    public void adunare(Matrice matrice2){
        for(int i=0;i<nrLines;i++){
            for(int j=0;j<nrColumns;j++){
                this.matrix[i][j].adunare(matrice2.matrix[i][j]);
            }
        }
    }

    public String toString(){

        String result = "";
        for(int i=0;i<nrLines;i++){
            for(int j=0;j<nrColumns;j++){
                result = result + this.matrix[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }

}
