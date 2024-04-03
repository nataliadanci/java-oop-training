import database.Database;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DatabaseTest {

    @Test
    public void testIsAvailable(){
        Database databaseUnderTest = new Database();
        assertFalse(databaseUnderTest.isAvailable());
    }

    @Test
    public void testGetUniqueId(){
        Database databaseUnderTest = new Database();
        assertEquals(42,databaseUnderTest.getUniqueId());
    }
}
