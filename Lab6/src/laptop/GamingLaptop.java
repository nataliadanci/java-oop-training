package laptop;

public class GamingLaptop extends Laptop {

    private String videoCardBrandName;

    public GamingLaptop(String brandName, float price, String color, String videoCardBrandName){
        super(brandName,price,color);
        this.videoCardBrandName = videoCardBrandName;
    }

    public boolean hasPriceBelow(float maxPrice){
       /* if(maxPrice < price){
            return false;
        }
        return true;*/
        return maxPrice < price ? false : true;
    }
    @Override
    public void printMessage(){
        System.out.println("I am a gaming laptop");
        // se face supraincarcarea metodei printMessage din clasa laptop.Laptop
    }

}
