package biblioteca;

public class Persoana {
    private String nume;
    private String prenume;
    private String universitate;
    private int nrCardBiblioteca;
    private Carte[] cartiImprumutate;
    private int nrCartiImprumutate;

    public Persoana(String nume, String prenume, String universitate, int nrCardBiblioteca){
        this.nume = nume;
        this.prenume = prenume;
        this.universitate = universitate;
        this.nrCardBiblioteca = nrCardBiblioteca;
        cartiImprumutate = new Carte[5];
        nrCartiImprumutate = 0;
    }

    public int getNrCartiImprumutate(){
        return nrCartiImprumutate;
    }
    public Carte[] getCartiImprumutate(){
        return cartiImprumutate;
    }
    public void imprumutaCarte(Carte carte){
        if(nrCartiImprumutate < 5){
            cartiImprumutate[nrCartiImprumutate] = carte;
            nrCartiImprumutate++;
        }
    }
    public String toString(){
        return "" + this.nume + "," + this.prenume + "," + this.universitate + "," + this.nrCardBiblioteca;
    }
}
