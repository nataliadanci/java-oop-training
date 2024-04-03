package deep.cloning.user;

class Address implements Cloneable {

    private String street;
    private String city;
    private Country country;

    public Address(String street, String city, Country country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Address addressCloned = (Address) super.clone();
        addressCloned.country = (Country) addressCloned.country.clone();
        return addressCloned;
    }
}
