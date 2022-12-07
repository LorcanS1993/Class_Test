import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFailure {

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestNameFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 2222, 23322, "Female", "unemployed", 20);});
        assertEquals("Invalid Name Error", failMessage.getMessage());
    }

    @Test
    void TestppsIDFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 12363, 23322, "Female", "unemployed", 20);});
        assertEquals("Invalid PPS number Error", failMessage.getMessage());
    }

    @Test
    void TestPhoneFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 12363, 12345667, "Female", "unemployed", 20);});
        assertEquals("Invalid Phone Number Error", failMessage.getMessage());
    }

    @Test
    void TestGenderFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 12363, 12345667, "Dog", "unemployed", 20);});
        assertEquals("Invalid Gender Error", failMessage.getMessage());
    }

    @Test
    void TestEmploymentFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 12363, 12345667, "Dog", "No", 20);});
        assertEquals("Invalid Employment type Error", failMessage.getMessage());
    }

    @Test
    void TestAgeFailure() {
        Exception failMessage = assertThrows(IllegalArgumentException.class, () -> {new Employee("Colin", 12363, 12345667, "Dog", "No", 50);});
        assertEquals("Age must be over 18", failMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}