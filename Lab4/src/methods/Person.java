package methods;

public class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }
    public static void modify1(Person p) { // in java parametrii sunt transmisi prin valoare
        p = new Person("Modified Name"); // incearca sa-i modifice valoarea, adica adresa si se creaza o copie
        System.out.print(p.getName());
    }
    public static void modify2(Person p) {
        p.setName("Modified Name"); // se opereaza pe acelasi obiect, pe aceeasi adresa, dar se modifica continutul obiectului
        System.out.print(p.getName());
    }

    public static void modify3(int number){
        number++; // pentru tipuri primitive se face o copie
        System.out.println(number);
    }

    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());
        modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());
        int initialNumber = 10;
        modify3(initialNumber);
        System.out.println(initialNumber);
    }
}