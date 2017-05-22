
package Service;

import bean.LoginBean;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class InsertPatientLoginDetailsTest {
    
//     @Test
//    public void testInsertPatientLoginDetailsPKCons() {
//        System.out.println("insertPatientLoginDetails");
//        LoginBean obj = new LoginBean();
//        obj.setUserName("james");
//        obj.setPassword("Sravani91");
//        obj.setType(2);
//        Service instance = new Service();
//        int expResult = 0;
//        int result = instance.insertPatientLoginDetails(obj);
//        assertEquals("Failed to insert patient details into login table due to violating primary key constraint"+result,expResult, result);
//        
//        
//    }
    @Test
    public void testInsertPatientLoginDetailsPass() {
        System.out.println("insertPatientLoginDetails");
        LoginBean obj = new LoginBean();
        obj.setUserName("Vamsi");
        obj.setPassword("Sravani91");
        obj.setType(2);
        Service instance = new Service();
        int expResult = 1;
        int result = instance.insertPatientLoginDetails(obj);
        assertEquals("Failed to insert patient details into login table "+result,expResult, result);
        
        
    }
    
}
