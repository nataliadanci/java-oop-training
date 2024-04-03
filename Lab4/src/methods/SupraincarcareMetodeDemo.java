package methods;

public class SupraincarcareMetodeDemo {

    public int i;

    public SupraincarcareMetodeDemo(int i){
        this.i = i;
    }
    //supraincarcarea este cand avem mai multe metode cu acelasi nume, in aceeasi clasa!! , dar cu
    //parametrii diferiti
    public static int test(int i, int j) {
        return i + j;
    }
    public static int test(int i, String j) {
        return i;
    }

    public int test(String j, boolean k) {
        return i + 10;
    }

    // in supraincarcarea metodelor nu poate sa difere doar tipul returnat, este o eroare de compilare
    /*public static String test(int i, int j) {
        return "ok";
    }*/

    public static void main(String[] args){
        int result1 = SupraincarcareMetodeDemo.test(1,3);
        int result2 = test(5,"Scoala");
       /* int result3 = test(10,"Facultate",false);*/
        SupraincarcareMetodeDemo object1 = new SupraincarcareMetodeDemo(10);
        int result3 = object1.test("facultate",false);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
