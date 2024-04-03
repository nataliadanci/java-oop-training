package autovehicul;

public class Rezervor {

    private int capacitateMax;
    private int nivelCurentUmplere;

    public Rezervor(int capacitateMax, int nivelCurentUmplere){
        this.capacitateMax = capacitateMax;
        this.nivelCurentUmplere = nivelCurentUmplere;
    }

    public int getNivelCurentUmplere(){
        return this.nivelCurentUmplere;
    }
    public void umpleRezervor(int nrLitri){
        if(this.nivelCurentUmplere + nrLitri<=this.capacitateMax){
            this.nivelCurentUmplere = this.nivelCurentUmplere + nrLitri;
        }
        else System.out.println("Rezervorul depaseste astfel capacitate maxima");
    }
}

