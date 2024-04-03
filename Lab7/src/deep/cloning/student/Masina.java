package deep.cloning.student;

public class Masina implements Cloneable {

    private String brand;
    private String color;

    public Masina(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
