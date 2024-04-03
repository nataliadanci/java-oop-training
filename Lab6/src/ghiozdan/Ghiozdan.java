package ghiozdan;

public class Ghiozdan {

    private Rechizita[] listaRechizite;
    private static final int NR_TOTAL_RECHIZITE = 7;
    private int nrRechizite;

    public Ghiozdan(){
        listaRechizite = new Rechizita[NR_TOTAL_RECHIZITE];
        nrRechizite = 0;
    }

    public int getNrRechizite(){
        return nrRechizite;
    }

    public int getNrManuale(){
        int nrManuale=0;
        for(int i=0;i<nrRechizite;i++){
            if(listaRechizite[i] instanceof Manual){
                nrManuale++;
            }
        }
        return nrManuale;
    }
    public int getNrCaiete(){
        int nrCaiete=0;
        for(int i=0;i<nrRechizite;i++){
            if(listaRechizite[i] instanceof Caiet){
                nrCaiete++;
            }
        }
        return nrCaiete;
    }

    public void add(Caiet caiet){
        if(nrRechizite < NR_TOTAL_RECHIZITE){
            listaRechizite[nrRechizite] = caiet;
            nrRechizite++;
        }
        else{
            System.out.println("nu se mai pot adauga alte caiete");
        }
    }

    public void add(Manual manual){
        if(nrRechizite < NR_TOTAL_RECHIZITE){
            listaRechizite[nrRechizite] = manual;
            nrRechizite++;
        }
        else{
            System.out.println("nu se mai pot adauga alte manuale");
        }
    }

    public void listItems(){
        for(int i=0; i<nrRechizite;i++){
            System.out.println(listaRechizite[i]);
        }
    }
    public void listCaiet(){
        for(int i=0; i< nrRechizite ; i++){
            Rechizita rechizita = listaRechizite[i];
            if(rechizita instanceof Caiet) {
                System.out.println(rechizita);
            }
        }
    }
    public void listManual(){
        for(int i=0; i< nrRechizite ; i++){
            Rechizita rechizita = listaRechizite[i];
            if(rechizita instanceof Manual) {
                System.out.println(rechizita);
            }
        }
    }
}
