package biblioteca;

public class ImprumutCarte {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Carte carte1 = new Carte("Summer","Primavara","Toamna",5);
        Carte carte2 = new Carte("Decembrie","Ianuarie","Februarie",20);
        Carte carte3 = new Carte("Ioana","Maria","Toamna",15);
        Carte carte4 = new Carte("Italia","Spania","Febraurie",5);
        Carte carte5 = new Carte("Winnie","Iepure","Lumanare",50);
        Carte carte6 = new Carte("Vara","Primavara","Toamna",5);
        biblioteca.adaugamCarte(carte1);
        biblioteca.adaugamCarte(carte2);
        biblioteca.adaugamCarte(carte3);
        biblioteca.adaugamCarte(carte4);
        biblioteca.adaugamCarte(carte5);
        biblioteca.adaugamCarte(carte6);

        System.out.println("numar carti curente: " + biblioteca.getNrCartiCurente());

        Carte[] cartiToamna = biblioteca.cautaCarteDupaEditura("Toamna");
        System.out.println("nr de carti din editura Toamna este: " + cartiToamna.length); // se uita la cate elem am alocat, nu la cate am adaugat efectiv
        System.out.println("nr de carti din editura Toamna este: " + calculeazaNrCarti(cartiToamna));
        System.out.println("cartile din editura Toamna: ");
        afiseazaCarti(cartiToamna); // nu ar putea apela aceasta metoda daca nu ar fi statica pentru ca main
                                    // este metoda statica
        Persoana persoana1 = new Persoana("Butuc","Ioana","UBB",255);

        try{
            biblioteca.imprumutaCarte(persoana1,"Gabriel");
        } catch (LendingBookNotSupportedException e){
            System.out.println("Cartea 'Gariel' nu poate fi imprumutata");
        }

        try{
            biblioteca.imprumutaCarte(persoana1,"Decembrie");

        } catch (LendingBookNotSupportedException e) {
            System.out.println("Cartea 'Decembrie' nu poate fi imprumutata");
        }
        try{
            biblioteca.imprumutaCarte(persoana1,"Vara");
        } catch (LendingBookNotSupportedException e) {
            System.out.println("Cartea 'Vara' nu poate fi imprumutata");
        }
        try{
            biblioteca.imprumutaCarte(persoana1,"Winnie");
        } catch (LendingBookNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Nr carti imprumutate: " + persoana1.getNrCartiImprumutate());

        System.out.println("nr carti ramase: " + biblioteca.getNrCartiCurente());
        afiseazaCarti(biblioteca.getListaCarti());
        System.out.println("Numar carti imprumutate de persoana " + persoana1.getNrCartiImprumutate());
        afiseazaCarti(persoana1.getCartiImprumutate());
    }

    public static void afiseazaCarti(Carte[] carti){

        for(Carte carteCurenta: carti){
            if(carteCurenta!=null) {
                System.out.println(carteCurenta);
            }
        }

    }
    public static int calculeazaNrCarti(Carte[] carti){
        int nrCarti = 0;
        for(Carte carteCurenta: carti){
            if(carteCurenta!=null) {
                nrCarti++;
            }
        }
        return nrCarti;
    }
}
