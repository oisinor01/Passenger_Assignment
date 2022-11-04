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
      Passenger Age;

    @BeforeEach
    void setUp() {

        Title = new Passenger();
        Name = new Passenger();
        Id = new Passenger();
        Phone = new Passenger();
        Age = new Passenger();

    }

    @Test
    void testTitle(){
        assertEquals("Mr", Title.title("Mr"));
    }

    @Test
    void testTitle2(){
        assertEquals("Ms", Title.title("Ms"));
    }

    @Test
    void testTitle3(){
        assertEquals("Mrs", Title.title("Mrs"));
    }


    @Test
    void testTitleFail(){
        Exception msgTitle = assertThrows(IllegalArgumentException.class, () -> {Title.title("Mister");});
        assertEquals("Error invalid title\n", msgTitle.getMessage());
    }

    @Test
    void testName(){
        assertEquals("Oisin", Name.name("Oisin"));

    }

    @Test
    void testNameFail(){
        Exception msgName = assertThrows(IllegalArgumentException.class, () -> {Name.name("Tj");});
        assertEquals("Name  must be minimum 3 characters.... I don't make the rules\n", msgName.getMessage());
    }

    @Test
    void testID(){
        assertEquals("g0037985000", Id.id("g0037985000"));

    }

    @Test
    void testIDFail(){
        Exception msgID = assertThrows(IllegalArgumentException.class, () -> {Id.id("123456789");});
        assertEquals("ERROR invalid ID...\n", msgID.getMessage());
    }

    @Test
    void testPhone(){
        assertEquals("0871234567", Phone.phone("0871234567"));

    }

    @Test
    void testPhoneFail(){
        Exception msgNum = assertThrows(IllegalArgumentException.class, () -> {Phone.phone("654");});
        assertEquals("Error Phone number must be minimum 7 characters\n", msgNum.getMessage());
    }

    @Test
    void testAge(){
        assertEquals(21, Age.age(21));
    }


    @Test
    void testAgeFail(){
        Exception msgAge = assertThrows(IllegalArgumentException.class, () -> {Age.age(15);});
        assertEquals("Sorry you must be 16 or over...\n", msgAge.getMessage());
    }



    @AfterEach
    void tearDown() {
    }
}