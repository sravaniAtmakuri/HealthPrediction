
package TestLibrary;

import Service.Service;
import TestDriver.TestDriver;
import bean.LoginBean;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InsertPatientLoginTest {
     @Test
    public void testInsertPatientLoginDetailsPKCons() {
        System.out.println("insertPatientLoginDetails");
        TestDriver test=new TestDriver();
        LoginBean obj;
        obj=test.getLoginTable();
        System.out.println("Login Bean values are: "+obj.getUserName()+" "+obj.getPassword()+" "+obj.getType());
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertPatientLoginDetails(obj);
        assertEquals("Failed to insert patient details into login table due to violating primary key constraint"+result,expResult, result);
        
        
    }
    
}
