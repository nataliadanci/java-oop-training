package ghiozdan;

public class TestGhiozdan {
    public static void main(String[] args){
        Ghiozdan ghiozdan = new Ghiozdan();
        Manual manual1 = new Manual("eticheta1","Economie","Emil",7);
        Manual manual2 = new Manual("eticheta2","Marketing","Gabriel",10);
        Caiet caiet1 = new Caiet("eticheta3","Seminar","Matematica");
        Caiet caiet2 = new Caiet("eticheta4","Curs","Informatica");

        ghiozdan.add(caiet1);
        ghiozdan.add(caiet2);
        ghiozdan.add(manual1);
        ghiozdan.add(manual2);
        System.out.println(" Afisare rechizite: ");
        ghiozdan.listItems();
        System.out.println("Afisam caietele: ");
        ghiozdan.listCaiet();
        System.out.println("Afisam manualele: ");
        ghiozdan.listManual();
        System.out.println("Afisam numarul rechizitelor: " + ghiozdan.getNrRechizite());
        System.out.println("Afisam numarul manualelor: " + ghiozdan.getNrManuale());
        System.out.println("Afisam numarul caietelor: " + ghiozdan.getNrCaiete());
    }



}
