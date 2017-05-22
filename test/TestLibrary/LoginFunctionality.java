
package TestLibrary;

import ConnectDB.ConnectDB;
import Service.Service;
import TestDriver.TestDriver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginFunctionality {  @BeforeClass
    public static void setUpClass(){

    }
    
    
    @Test
    public void testLogin() {
        ArrayList<String> userName=null;
        ArrayList<String> password=null;
        TestDriver test=new TestDriver();
        userName=test.getUsernameLogin();
        password=test.getPasswordLogin();
        Service instance = new Service();
        boolean expResult = true;
        for(int i=0;i<userName.size();i++){
            boolean result = instance.login(userName.get(i), password.get(i));
        System.out.println(result);
        assertEquals("Failed Login test case"+i,expResult, result);
        
        }
        
    }
    @Test
      public void UsernameExceptiontestLogin() {
          ArrayList<String> userName=null;
        ArrayList<String> password=null;
        TestDriver test=new TestDriver();
        userName=test.getUsernameLogin();
        password=test.getPasswordLogin();
        Service instance = new Service();
        boolean expResult = false;
        for(int i=0;i<userName.size();i++){
            boolean result = instance.login(test.getEmptyValue(), password.get(i));
        System.out.println(result);
        assertEquals("Failed Login test case"+i,expResult, result);
        } 
      }
      @Test
       public void PasswordExceptiontestLogin() {
               
        ArrayList<String> userName=null;
        ArrayList<String> password=null;
        TestDriver test=new TestDriver();
        userName=test.getUsernameLogin();
        password=test.getPasswordLogin();
        Service instance = new Service();
        boolean expResult = false;
        for(int i=0;i<userName.size();i++){
            boolean result = instance.login(userName.get(i), test.getEmptyValue());
        System.out.println(result);
        assertEquals("Failed Login test case"+i,expResult, result);
        } 
       
    }
        @Test
       public void UsernamePasswordExceptiontestLogin() {

         ArrayList<String> userName=null;
        ArrayList<String> password=null;
        TestDriver test=new TestDriver();
        userName=test.getUsernameLogin();
        password=test.getPasswordLogin();
        Service instance = new Service();
        boolean expResult = false;
        for(int i=0;i<userName.size();i++){
            boolean result = instance.login(test.getEmptyValue(), test.getEmptyValue());
        System.out.println(result);
        assertEquals("Failed Login test case"+i,expResult, result);
        }

       }
       @Test
           public void InvalidUsernamePasswordtestLogin() {
                ArrayList<String> userName=new ArrayList();
        ArrayList<String> password=new ArrayList();
        TestDriver test=new TestDriver();
        Service instance = new Service();
        userName.add(test.invalidUsername());
        password.add(test.invalidPassword());
        boolean expResult = false;
        boolean result = instance.login(userName.get(0), password.get(0));
        assertEquals("Failed Login test case"+userName.get(0),expResult, result);
           }
            
        @Test
        public void loginTest(){
        Service instance = new Service();
        TestDriver test=new TestDriver();
        boolean expResult = true;
        boolean result = instance.login(test.validUsername(), test.validPassword());
        System.out.println(result);
        assertTrue("Failed Login test case", result);
        
    }
}
