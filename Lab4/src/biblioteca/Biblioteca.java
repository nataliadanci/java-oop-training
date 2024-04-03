package biblioteca;

public class Biblioteca {

    private static final int NR_CARTI_TOTALE = 5;
    private int nrCartiImprumutate;
    private int nrCartiCurente;
    private Carte[] listaCarti;


    public Biblioteca(){
        listaCarti = new Carte[NR_CARTI_TOTALE];
        nrCartiCurente = 0;
        nrCartiImprumutate = 0;
    }

    public int getNrCartiCurente(){
        return nrCartiCurente;
    }
    public Carte[] getListaCarti(){
        return listaCarti;
    }
    public void adaugamCarte(Carte carte){
        if(nrCartiCurente < NR_CARTI_TOTALE){
            listaCarti[nrCartiCurente] = carte;
            nrCartiCurente++;
        }
        else{
            System.out.println("nu se mai pot adauga carti in biblioteca");
        }

    }

    public Carte[] cautaCarteDupaEditura(String editura){
        Carte[] cartiGasite = new Carte[nrCartiCurente];
        int indexCartiGasite = 0;
        for(Carte carteCurenta: listaCarti ){
            if(carteCurenta.getEditura() == editura){
                cartiGasite[indexCartiGasite++] = carteCurenta;
            }
        }
        return cartiGasite;
    }

    public Carte cautaCarteDupaTitlu(String titlu){
        for(Carte carteCurenta: listaCarti ){
            if(carteCurenta.getTitlu() == titlu){
               return carteCurenta;
            }
        }
        return null;
    }

    public void imprumutaCarte(Persoana persoana, String titlu){

        Carte carteDeImprumutat = cautaCarteDupaTitlu(titlu);
        if(carteDeImprumutat == null){
            System.out.println("Cartea " + titlu + " nu este disponibila");
        }
        else{
            persoana.imprumutaCarte(carteDeImprumutat);
            nrCartiImprumutate++;
            //sa stergem din biblioteca cartea
            stergeCarteDinColectie(titlu);

        }
    }

    private void stergeCarteDinColectie(String titlu){

        for(int i = 0; i < NR_CARTI_TOTALE; i++){
            if(listaCarti[i].getTitlu() == titlu){
                listaCarti[i] = null;
            }
        }
        nrCartiCurente--;

    }
}
