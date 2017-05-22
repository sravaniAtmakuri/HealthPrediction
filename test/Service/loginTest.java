
package Service;

import ConnectDB.ConnectDB;
import bean.PatientBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;

 
public class loginTest {
    @BeforeClass
    public static void setUpClass(){

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   
    
    @Test
    public void loginTest(){
        Service instance = new Service();
        boolean expResult = true;
        boolean result = instance.login("rty", "rty");
        System.out.println(result);
        assertTrue("Failed Login test case", result);
        
    }
    
    
    
    
    @Test
    public void InvalidUsernamePasswordtestLogin() {
               
       Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.login("xxxx", "yyyy");
        System.out.println(result);
        assertEquals("Failed Login test case",expResult, result);
       
    }
     @Test
    public void UsernameExceptiontestLogin() {
               
       Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.login("", "rty");
        System.out.println(result);
        assertEquals("Failed Login test case",expResult, result);
       
    }
     @Test
    public void PasswordExceptiontestLogin() {
               
       Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.login("rty", "");
        System.out.println(result);
        assertFalse("Failed Login test case", result);
       
    }
  
        @Test
       public void UsernamePasswordExceptiontestLogin() {

          Service instance = new Service();
          boolean expResult =false;
           boolean result = instance.login("", "");
           System.out.println(result);
           assertFalse("Failed Login test case", result);

       }
       @Test
    public void testPfind_RQ21_3() {
        System.out.println("Test Case: testPfind_RQ21_3 started");
        //with all symptoms
        String s1 = "Tiredness";
        String s2 = "Lack of Energy";
        String s3 = "Lack Of Sleep";
        String s4 = "Dizziness";
        String s5 = "Muscle Weakness";
        String age_group = "TEEN";
        String disease = "Fatigue";
        Service serviceInstance=new Service();
        double probability = serviceInstance.pfind(s1, s2, s3, s4, s5, age_group, disease);
        
        
        boolean actualResult = (probability>0 || probability<1)? true:false;
        
        assertFalse("Test Case: testPfind_RQ21_3 failed.", actualResult);
    }
   
}
