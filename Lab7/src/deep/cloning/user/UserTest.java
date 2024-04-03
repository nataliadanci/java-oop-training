package deep.cloning.user;

import deep.cloning.user.Address;
import deep.cloning.user.Country;
import deep.cloning.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

//test shallow and deep copy
public class UserTest {

    @Test
    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Country country = new Country("England", "233456");
        Address address = new Address("Downing St 10", "London", country);
        User pm = new User("Prime", "Minister", address);

        // create new object with the same fields without Cloneable
        User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());

        assertNotSame(shallowCopy, pm);
    }

    @Test
    public void whenModifyingOriginalObject_ThenCopyShouldChange() {
        Country country = new Country("England", "233456");
        Address address = new Address("Downing St 10", "London", country);
        User pm = new User("Prime", "Minister", address);

        User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());

        //change the original object
        address.setCountry(country);

        assertEquals(shallowCopy.getAddress().getCountry(), pm.getAddress().getCountry());
    }

    @Test
    public void whenModifyingOriginalObject_thenCloneCopyShouldNotChange() throws CloneNotSupportedException {
        Country country = new Country("England", "233456");
        Address address = new Address("Downing St 10", "London", country);
        User pm = new User("Prime", "Minister", address);

        User deepCopy = (User) pm.clone();

        // the address changes for both objects
        address.setCountry(country);

        //assertEquals(deepCopy.getAddress().getCountry(), pm.getAddress().getCountry());
        assertNotEquals(deepCopy.getAddress().getCountry(), pm.getAddress().getCountry());
    }
}
