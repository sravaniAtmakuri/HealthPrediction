
package Service;

import bean.Appointment;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class GetAllAppointedPatientTest {
//  @Test
//    public void testGetAllAppointedPatientSize() {
//        System.out.println("getAllAppointedPatient");
//        String docEmail = "john@test.com";
//        
//        Service instance = new Service();
//        Appointment patientInfo = new Appointment();
//    //    ArrayList<Appointment> expResult = patientInfo;
//        ArrayList<Appointment> result = instance.getAllAppointedPatient(docEmail);
//        assertTrue("size is: "+result.size(),result.size()==2);
//        
//        
//    }   
//    @Test
//    public void testGetAllAppointedPatientAttributes() {
//        System.out.println("getAllAppointedPatient");
//        String docEmail = "john@test.com";
//        
//        Service instance = new Service();
//        Appointment patientInfo = new Appointment();
//  
//        ArrayList<Appointment> result = instance.getAllAppointedPatient(docEmail);
//      
//       assertEquals(result.get(1).getName(),"John Bill");
//        assertEquals(result.get(0).getName(),"Sukhpreet Kaur");
//        
//    }
    
     @Test
    public void testGetAllAppointedPatientNullValue() {
        System.out.println("getAllAppointedPatient");
        String docEmail = "sravani@test.com";
        
        Service instance = new Service();
        Appointment patientInfo = new Appointment();
  
        ArrayList<Appointment> result = instance.getAllAppointedPatient(docEmail);
          
        assertNull("List should be null", result);
       
        
    }
    
    
    
    
}
