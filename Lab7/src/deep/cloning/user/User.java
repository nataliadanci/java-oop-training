package deep.cloning.user;

class User implements Cloneable {

    private String firstName;
    private String lastName;
    private Address address;
    //private Car car;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();

        User clonedUser = (User) super.clone();
        clonedUser.address = (Address) clonedUser.getAddress().clone();// trebuie sa clonam manual si
                                                                    // adresa pt ca nu e tip primitiv
        //clonedUser.car = (Car)clonedUser.getCar().clone();// trebuie sa implementam clone si in clasa Car
        return clonedUser;
    }
}
