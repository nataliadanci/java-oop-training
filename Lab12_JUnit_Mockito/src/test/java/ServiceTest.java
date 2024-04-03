import database.Database;
import database.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/*
Mockito is a popular open source framework for mocking objects in software test.
Using Mockito greatly simplifies the development of tests for classes with external dependencies.
A mock object is a dummy implementation for an interface or a class.
It allows to define the output of certain method calls.
They typically record the interaction with the system and tests can validate that.
*/


@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @Mock
    Database databaseMock;

    //this is not a true Unit test because we want to test only the Service class, and we end up testing also the
    //Database class
    @Test
    public void testQueryWithoutMockedDatabase(){
        //we create a real instance (object) of type Database, which means that everytime we call a method on this
        //object the real implementation of that method will be called and the entire computation will be performed
        Database actualDatabaseObject = new Database();
        Service serviceObjectUnderTest = new Service(actualDatabaseObject);
        boolean check = serviceObjectUnderTest.query("* from serviceObjectUnderTest");
        assertFalse(check);
        String serviceObjectToString = serviceObjectUnderTest.toString();
        assertEquals("Using database with id: 42",serviceObjectToString);
    }

    //For this Test we don't use a real Database object, but we use a Mocked object(databaseMock), which is a dummy
    //object, which does not have any method implemented. It was declared using the @Mock annotation, and we need
    //to specify what each method returns
    @Test
    public void testQueryUsingMockedObject()  {
        assertNotNull(databaseMock);
        //we need to specify what the method isAvailable() return when it's called
        when(databaseMock.isAvailable()).thenReturn(true);
        Service serviceObjectUnderTest  = new Service(databaseMock);
        boolean check = serviceObjectUnderTest.query("* from serviceObjectUnderTest");
        assertTrue(check);
        //we need to specify what the method getUniqueId() returns
        when(databaseMock.getUniqueId()).thenReturn(120);
        assertEquals("Using database with id: 120",serviceObjectUnderTest.toString());
    }


    @Test
    public void testQuery2()  {
        assertNotNull(databaseMock);
        //we need to specify what the method isAvailable() return when it's called
        when(databaseMock.isAvailable()).thenReturn(false);
        Service serviceObjectUnderTest  = new Service(databaseMock);
        boolean check = serviceObjectUnderTest.query("* from serviceObjectUnderTest");
        assertFalse(check);
        //we need to specify what the method getUniqueId() returns
        when(databaseMock.getUniqueId()).thenReturn(50);
        assertEquals("Using database with id: 50",serviceObjectUnderTest.toString());
    }


}
