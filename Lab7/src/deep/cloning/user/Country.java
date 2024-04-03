package deep.cloning.user;

public class Country implements Cloneable{
    private String name;
    private String zipCode;

    public Country(String name, String zipCode){
        this.name = name;
        this.zipCode = zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
