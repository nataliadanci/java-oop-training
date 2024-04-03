package laptop;

public class BusinessLaptop extends Laptop {

    private String employeeName;
    private String companyPassword;

    public BusinessLaptop(){
        super(); // se apeleaza automat dar il putem scrie si noi
    }

    public BusinessLaptop(String brandName, float price, String color, String employeeName, String companyPassword){
        /*this.brandName = brandName;
        this.price = price;
        this.color = color;*/
        super(brandName,price,color);
        this.employeeName = employeeName;
        this.companyPassword = companyPassword;
    }

    public boolean hasPassword(){
        if(companyPassword == null || companyPassword == ""){ // ""- empty String
            return false;
        }
        return true;
    }

    @Override
    public void printMessage(){
        System.out.println("I am a business laptop");
        // se face supraincarcarea metodei printMessage din clasa laptop.Laptop
    }
    // se face supraincarcarea metodei getPrice() din clasa parinte
    public void setPrice(float discount){
        price -= discount;
    }
    public void setPrice(float discount, float percentageDiscount){
        float discountCalculat = percentageDiscount/100*price;
        price = price-discount-discountCalculat;
    }
}
