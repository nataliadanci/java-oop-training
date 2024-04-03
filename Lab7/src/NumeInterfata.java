public interface NumeInterfata {
    //constante
    public static final int X = 10;
    int Y = 20; // pare o variabila instanta, dar este o constanta

    // implicit este declarata cu modificatorii public static final
    void numeMetoda(); // metodă abstractă

    default void numeMetodaDefault() { // este permis numai începand cu Java 8
        // implementarea implicita a metodei (corpul metodei)
        System.out.println("Metoda default din interfata ");
    }

    static void numeMetodaStatica() { // este permis numai începand cu Java 8
    // implementarea metodei statice (corpul metodei)
        System.out.println("Metoda statica din interfata ");
    }
}
