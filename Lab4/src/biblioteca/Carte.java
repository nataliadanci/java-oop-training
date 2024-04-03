package biblioteca;

public class Carte {
    private String titlu;
    private String autor;
    private String editura;
    private int nrCapitole;


    public Carte(String titlu, String autor, String editura, int nrCapitole){
        this.titlu = titlu;
        this.autor = autor;
        this.editura = editura;
        this.nrCapitole = nrCapitole;
    }

    public String getEditura(){
        return editura;
    }

    public String getTitlu(){
        return titlu;
    }
    public String toString(){
        return "" + this.titlu + "," + this.autor + "," + this.editura + "," + this.nrCapitole;
    }
}
