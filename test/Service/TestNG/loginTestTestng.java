
package Service.TestNG;

//import Service.*;

import ConnectDB.ConnectDB;
import Service.Service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import ConnectDB.ConnectDB;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import org.junit.AfterClass;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.fail;
//import org.junit.BeforeClass;
//import org.junit.Test;

 @Parameters({"USERNAME" ,"PASSWORD"})
public class loginTestTestng {
   
    
    @Test
    public void loginTest(String USERNAME, String PASSWORD){
       
       Service instance = new Service();
       boolean result = instance.login(USERNAME, PASSWORD);
       System.out.println("Result is : "+ result);
       
        
    }
}
    
    