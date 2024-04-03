package matematica;

public class Fractie implements Numeric {

    private int numarator;
    private int numitor;

    public Fractie(int numarator,int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }

    @Override
    public void adunare(Numeric number2) {
        Fractie fractie2 = (Fractie) number2;
        this.numarator = this.numarator* fractie2.numitor + fractie2.numarator*this.numitor;
        this.numitor = this.numitor* fractie2.numitor;
    }

    @Override
    public void scadere(Numeric number2) {
        Fractie fractie2 = (Fractie) number2;
        this.numarator = this.numarator * fractie2.numitor - fractie2.numarator * this.numitor;
        this.numitor = this.numitor * fractie2.numitor;
    }

    @Override
    public void inmultire(Numeric number2) {
        Fractie fractie2 = (Fractie) number2;
        this.numitor = this.numitor * fractie2.numitor;
        this.numarator = this.numarator * fractie2.numarator;
    }

    public String toString(){
        return this.numarator + "/" + this.numitor;
    }
}
