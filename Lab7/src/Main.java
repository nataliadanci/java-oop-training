public class Main {
    public static void main(String[] args) {
        NumeInterfata obiect1 = new NumeClasa();
        NumeClasa obiect2 = new NumeClasa();
        //NumeInterfata obiect3 = new NumeInterfata(); //nu putem instantia interfete
                                                        // la fel precum nu putem instantia clase abstracte
        obiect2.numeMetoda();
        obiect2.numeMetodaDefault();
        NumeInterfata.numeMetodaStatica();

    }
}