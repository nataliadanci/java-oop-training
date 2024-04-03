package laptop;

import laptop.BusinessLaptop;

public class DemoMostenire {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Lenovo",5000,"gri");
        Laptop businessLaptop = new BusinessLaptop("Dell",4000,"negru","Liviu","laptop0000");
        Laptop gamingLaptop = new GamingLaptop("Toshiba",2500,"albastru","video card Toshiba");

        System.out.println(laptop.getBrandName());
        System.out.println(businessLaptop.getBrandName());
        System.out.println(gamingLaptop.getBrandName());
        System.out.println(((BusinessLaptop)businessLaptop).hasPassword()); // am facut cast la subclasa deoarece businesslaptop e declarat ca laptop
        //System.out.println(gamingLaptop.hasPassword());  -subclasele nu mostenesc una de la alta
        System.out.println(((GamingLaptop)gamingLaptop).hasPriceBelow(1000));
        //System.out.println(businessLaptop.hasPriceBelow(1000));
        //System.out.println(laptop.hasPriceBelow(1000)); -metodele noi din subclasa nu exista in parinte

        Laptop[] listLaptops = new Laptop[3];
        listLaptops[0] = laptop;
        listLaptops[1] = businessLaptop;
        listLaptops[2] = gamingLaptop;
        System.out.println();

        for( Laptop lap : listLaptops){
            System.out.println(lap.getBrandName());
            lap.printMessage();
        }

        System.out.println();

        if(businessLaptop instanceof BusinessLaptop){
            System.out.println("Da");
        } else System.out.println("Nu");

        if(businessLaptop instanceof Laptop){ // instanceof = verifica tipul(clasa) obiectului
            System.out.println("Da");
        } else System.out.println("Nu");

        ((BusinessLaptop) businessLaptop).setPrice();
        System.out.println(businessLaptop.getPrice());
        ((BusinessLaptop) businessLaptop).setPrice(100);
        System.out.println(businessLaptop.getPrice());
        ((BusinessLaptop) businessLaptop).setPrice(100,10);
        System.out.println(businessLaptop.getPrice());
    }
}