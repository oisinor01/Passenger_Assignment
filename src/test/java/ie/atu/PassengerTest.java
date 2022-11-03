package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
      Passenger Title;
      Passenger Name;
      Passenger Id;
      Passenger Phone;
      Passenger age;

    @BeforeEach
    void setUp() {

        Title = new Passenger();
        Name = new Passenger();
        Id = new Passenger();
        Phone = new Passenger();
        age = new Passenger();


    }

    @Test
    void testTitle(){
        assertEquals("Mr", Title.title("Mr"));
    }

    @Test
    void testName(){
        assertEquals("Oisin", Name.name("Oisin"));

    }

    @Test
    void testID(){

    }

    @Test
    void testPhone(){

    }

    @Test
    void testAge(){
       // int age = new determineAge();
       // assertEqual(<16,)

    }

    @AfterEach
    void tearDown() {
    }
}