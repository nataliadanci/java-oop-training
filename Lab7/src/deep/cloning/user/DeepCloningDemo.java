package deep.cloning.user;

public class DeepCloningDemo {
    public static void main (String[] args){
        Country country = new Country("Romania", "233456");
        Address address1 = new Address("bulevard","Cluj",country);
        User user1 = new User("Paul","Manea",address1);

        try{
            User user2 = (User)user1.clone();
            user1.setFirstName("Daniel");
            System.out.println("First name for user 1: " + user1.getFirstName());
            System.out.println("First name for user 2: " + user2.getFirstName());
            address1.setCity("Timisoara");
            System.out.println("City for user1: " + user1.getAddress().getCity());
            System.out.println("City for user2: " + user2.getAddress().getCity());
            user1.getAddress().getCountry().setZipCode("111111");
            System.out.println("Zipcode for user 1: " + user1.getAddress().getCountry().getZipCode());
            System.out.println("Zipcode for user 2: " + user2.getAddress().getCountry().getZipCode());
        }catch (CloneNotSupportedException exception){
            exception.printStackTrace();
        }

    }
}
