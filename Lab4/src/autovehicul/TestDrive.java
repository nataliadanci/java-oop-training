package autovehicul;

public class TestDrive {
    public static void main(String[] args){
        Rezervor rezervor = new Rezervor(20,7);
        Autovehicul autovehicul = new Autovehicul("Audi","albastru",60,3,rezervor);
        System.out.println("Viteza initiala este: " + autovehicul.getViteza()) ;
        Autovehicul autovehicul1 = new Autovehicul();
        System.out.println(autovehicul);
        autovehicul.accelereaza(10);
        System.out.println(autovehicul);
        autovehicul.schimbaViteza();
        System.out.println(autovehicul);
        autovehicul.accelereaza(5);
        System.out.println(autovehicul);
        autovehicul.schimbaViteza();
        System.out.println(autovehicul);
        autovehicul.decelereaza(30);
        System.out.println(autovehicul);
        autovehicul.schimbaViteza();
        System.out.println(autovehicul);
        autovehicul.decelereaza(50);
        System.out.println(autovehicul);
        autovehicul.oprire();
        System.out.println(autovehicul);
        autovehicul.decelereaza(10);
        System.out.println(autovehicul);
        autovehicul.accelereaza(160);
        System.out.println(autovehicul);

        Sofer sofer = new Sofer("Danci","Natalia",20,25);
        autovehicul.setSofer(sofer);
        System.out.println(autovehicul.getSofer());

        System.out.println(autovehicul.getGradUmplere());
        autovehicul.alimenteaza(4);
        System.out.println(autovehicul.getGradUmplere());
        autovehicul.alimenteaza(10);
        System.out.println(autovehicul.getGradUmplere());
    }
}
