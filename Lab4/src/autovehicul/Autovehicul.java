package autovehicul;

public class Autovehicul {

    private String marca;
    private String culoare;
    private int viteza;
    private int treaptaViteza;
    private static final int VITEZA_MAXIMA = 150; // asa se definesc constantele
    private static final int NUMAR_TREPTE_VITEZA = 5;
    // static = tine de clasa si se apeleaza Autovehicul.VITEZA_MAXIMA
    // final= nu mai poate fi modificat dupa ce i s-a atribuit o valoare

    private Sofer sofer;
    private Rezervor rezervor;

    public Autovehicul(String marca, String culoare, int viteza, int treaptaViteza, Rezervor rezervor){
        this.marca = marca;
        this.culoare = culoare;
        this.viteza = viteza;
        this.treaptaViteza = treaptaViteza;
        this.rezervor = rezervor;
    }

    public Autovehicul(){

    }

    public int getViteza(){
        return this.viteza;
    }

    public Sofer getSofer(){
        return this.sofer;
    }
    public void setSofer(Sofer sofer){
        this.sofer = sofer;
    }

    public void accelereaza(int kmOra) {
        if (this.viteza + kmOra <= 150) {
            this.viteza += kmOra;
        }
        else System.out.println("viteza depasita");
    }
    public void decelereaza(int kmOra){
        if(this.viteza - kmOra > 0){
            this.viteza = this.viteza - kmOra;
        }
        else System.out.println("viteza prea mica");
    }
    public void schimbaViteza(){
        if(this.viteza <= 0){
            this.treaptaViteza = 0; // pe liber
        }
        if( this.viteza > 0 && this.viteza <= 20){
            this.treaptaViteza = 1;
        }
        if( this.viteza > 20 && this.viteza <= 40){
            this.treaptaViteza = 2;
        }
        if( this.viteza > 40 && this.viteza <= 60){
            this.treaptaViteza = 3;
        }
        if( this.viteza > 60 && this.viteza <= 80){
            this.treaptaViteza = 4;
        }
        if( this.viteza > 80 && this.viteza <= VITEZA_MAXIMA) {
            this.treaptaViteza = 5;
        }
    }

    public void oprire(){
        if(this.viteza <= 0){
            System.out.println("masina este deja oprita");
        }
        else{
            this.treaptaViteza = 1;
            this.viteza = 0;
            System.out.println("masina a fost oprita");
        }

    }

    public void alimenteaza(int nrLitri){
        rezervor.umpleRezervor(nrLitri);
    }

    public String toString(){
        return "" + this.marca + "," + this.culoare + "," + this.viteza + "," + this.treaptaViteza;
    }

    public int getGradUmplere(){
       return rezervor.getNivelCurentUmplere();
    }

}
