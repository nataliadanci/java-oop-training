public class DemoTablouri {
    public static void main(String[] args) {
        int[] vector = new int[10];
        for(int i=0;i< vector.length;i++){
            vector[i] = 2*i;
        }
        for(int i=0;i< vector.length;i++){
            System.out.print(vector[i]+", ");
        }
        System.out.println();
        for(int val : vector){ // e de preferat sa folosim acest for mereu cand nu avem nevoie de pozitia i
                              //for-ul itereaza prin toate elementele fara sa fie nevoie de indexul i
            System.out.print(val + ", ");
        }
    }
}