package autovehicul;

public class Sofer {
    private String nume;
    private String prenume;
    private int varsta;
    private int nrPermisConducere;

    public Sofer(String nume, String prenume, int varsta, int nrPermisConducere){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrPermisConducere = nrPermisConducere;
    }
    public String toString(){
        return "" + this.nume + "," + this.prenume + "," + this.varsta + "," + this.nrPermisConducere;
    }
}
