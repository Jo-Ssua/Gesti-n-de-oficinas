import org.example.model.Department;
import org.example.model.Office;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class DepartmentTest {

    Department department1 = new Department();

    @Before
    public void setUp(){
        department1.addOffice("1asad", 1);
        department1.addOffice("2fdsf", 2);
        department1.addOffice("2.2fwfw", 21);

    }




    @Test
    public void testAddOffice(){
        department1.addOffice("1", 1);
        assertEquals("1",department1.searchOffice("1").getCode() );
        department1.addOffice("2", 2);
        assertEquals("2", department1.searchOffice("2").getCode() );
        department1.addOffice("3", 2);
        assertEquals("3", department1.searchOffice("3").getCode() );

    }

    @Test
    public void testSearchOffice(){

        assertEquals(1, department1.searchOffice("1asad").getFloor() );
        assertEquals(2, department1.searchOffice("2fdsf").getFloor());


    }

    @Test
    public void testRemoveEvenFloors(){
        department1.removeEvenFloors();
        assertNull("No se encontraron oficinas", department1.searchOffice("2fdsf"));
        assertEquals(1,department1.searchOffice("1asad").getFloor() );
        assertEquals(21,department1.searchOffice("2.2fwfw").getFloor() );

    }




    
}
