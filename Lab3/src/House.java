// clasa House extinde clasa Object by default
public class House extends Object implements Comparable<House> {
    private int constructionYear;
    private int size;
    private String owner;
    private String address;
    public House (int constructionYear, int size, String owner, String address){
        this.constructionYear = constructionYear;
        this.size = size;
        this.owner = owner;
        this.address = address;
    }
    // sorteaza crescator in functie de dimensiune
   /* @Override
    public int compareTo(House o) {
        if(this.size == o.size){
            return 0;
        }
        if(this.size > o.size){
            return 1;
        }
        return -1;
    }*/


    @Override
    public String toString(){ // se apeleaza automat
        return "" + this.constructionYear + "," + this.size + "," + this.owner + "," + this.address;
    }

// sorteaza descrescator in functie de constructionYear
    @Override
    public int compareTo(House o) {
        if(this.constructionYear == o.constructionYear){
            return 0;
        }
        if(this.constructionYear < o.constructionYear){
            return 1;
        }
        return -1;
    }
}
