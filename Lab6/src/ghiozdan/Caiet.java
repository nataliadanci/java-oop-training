package ghiozdan;

public class Caiet extends Rechizita{

    private String tipCaiet;
    private String materie;

    public Caiet(String eticheta,String tipCaiet, String materie){
        this.tipCaiet = tipCaiet;
        this.materie = materie;
        setEticheta(eticheta);
    }
    public String getNume(){
        return "caiet " + getEticheta();
    }

    public String toString(){
        return "" + this.tipCaiet + "," + this.materie + "," + getEticheta();
    }
}
