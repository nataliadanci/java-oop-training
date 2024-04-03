package facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FacebookAccount {

    private String name;
    private int age;
    private String address;

    private Set<FacebookAccount> friendsList;

    public FacebookAccount(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        friendsList = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<FacebookAccount> getFriendsList() {
        return friendsList;
    }

    @Override
    public String toString(){
        return name + " " + age + " " + address + " ";
    }

    public void addFriend(FacebookAccount friend){
        friendsList.add(friend);
        //friend.addFriend(this); this creates an infinite loop because of recursive call
                                // of method addFriend inside addFriend
        addFriendBack(friend);
    }

    public void addFriendBack(FacebookAccount friend){
        friend.getFriendsList().add(this);
    }

    public void removeFriend(FacebookAccount friend){
        friendsList.remove(friend);
        //friend.removeFriend(this);
        removeFriendBack(friend);
    }

    public void removeFriendBack(FacebookAccount friend){
        friend.getFriendsList().remove(this);
    }

    @Override
    public boolean equals(Object o){
        FacebookAccount facebookAccount = (FacebookAccount) o;
        return this.name.equals(facebookAccount.name) && this.age == facebookAccount.age &&
                this.address.equals(facebookAccount.address) &&
                this.friendsList.containsAll(facebookAccount.friendsList) &&
                facebookAccount.friendsList.containsAll(this.friendsList);
            //verificam egalitatea celor doua HashSet-uri,verificand dca unul contine toate
            //elementele celuilalt si invers
    }

    //pentru locatie etc trebuie metode

}
