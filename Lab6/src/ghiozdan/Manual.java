package ghiozdan;

public class Manual extends Rechizita{

    private String materie;
    private String autor;
    private int nrCapitole;


    public Manual(String eticheta, String materie, String autor, int nrCapitole){
        this.materie = materie;
        this.autor = autor;
        this.nrCapitole = nrCapitole;
        setEticheta(eticheta);
    }

    public String getNume(){
        return "manual " + getEticheta();
    }

    public String toString(){
        return "" + this.materie + "," + this.autor + "," + this.nrCapitole + "," + getEticheta();
    }
}
