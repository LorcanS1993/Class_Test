import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestPass {

    private Employee myEmployee;

    @BeforeEach
    void setUp() {
        myEmployee = new Employee("Lorcan", 123456, 1234567890L, "Male", "Part-Time", 29);
    }

    @Test
    void TestName() {
        assertEquals("Lorcan", myEmployee.getName());
    }
    @Test
    void TestPPS() {
        assertEquals(123456, myEmployee.getPPSid());
    }
    @Test
    void testPhone(){
        assertEquals(1234567890L, myEmployee.getPhone());
    }
    @Test
    void testGender() {
        assertEquals("Male", myEmployee.getGender());
        myEmployee.setGender("Female");
        assertEquals("Female", myEmployee.getGender());
    }

    @Test
    void testEmploymentStatus() {
        myEmployee.setEmploymentType("Full-Time");
        assertEquals("Full-Time", myEmployee.getEmploymentType());
        myEmployee.setEmploymentType("Part-Time");
        assertEquals("Part-Time", myEmployee.getEmploymentType());
    }

    @Test
    void testAge() {
        assertEquals(29, myEmployee.getAge());
    }

    @AfterEach
    void tearDown() {
    }
}