package facebook;


import java.util.ArrayList;
import java.util.List;

public class FacebookAccountDemo {
    public static void main(String[] args){

        FacebookAccount facebookAccount1 = new FacebookAccount("Dana",22,"Madrid");
        FacebookAccount facebookAccount2 = new FacebookAccount("John",30,"Paris");
        FacebookAccount facebookAccount3 = new FacebookAccount("Maria",27,"Lisbon");
        FacebookAccount facebookAccount4 = new FacebookAccount("Jake",42,"Dublin");
        FacebookAccount facebookAccount5 = new FacebookAccount("Alexandra",18,"Bucharest");

        facebookAccount1.addFriend(facebookAccount2);
        facebookAccount1.addFriend(facebookAccount3);
        facebookAccount2.addFriend(facebookAccount4);
        facebookAccount2.addFriend(facebookAccount5);
        facebookAccount3.addFriend(facebookAccount2);
        facebookAccount4.addFriend(facebookAccount1);

        ArrayList<FacebookAccount> facebookAccounts = new ArrayList<>(List.of(facebookAccount1,
                facebookAccount2, facebookAccount3, facebookAccount4, facebookAccount5));

        for(FacebookAccount facebookAccount : facebookAccounts ){
            System.out.println("The friend list of " + facebookAccount.getName() + " is: ");
            System.out.println(facebookAccount.getFriendsList());
        }

        facebookAccount1.removeFriend(facebookAccount3);
        facebookAccount2.removeFriend(facebookAccount5);

        for(FacebookAccount facebookAccount : facebookAccounts ){
            System.out.println("The friend after removal list of" + facebookAccount.getName() + "is: ");
            System.out.println(facebookAccount.getFriendsList());
        }

    }
}
