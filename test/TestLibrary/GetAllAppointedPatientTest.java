
package TestLibrary;

import ConnectDB.ConnectDB;
import Service.Service;
import TestDriver.TestDriver;
import bean.Appointment;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class GetAllAppointedPatientTest {
    
    @Test
    public void GetPatientList(){
        try {
            ArrayList<String> expectedResultPatientName=new ArrayList<String>();
            ArrayList<Appointment> actualResultPatientName=new ArrayList<Appointment>();
            
            GetAllAppointedPatientTest test=new GetAllAppointedPatientTest();
            ResultSet rs;
            ResultSet finalresult;
            TestDriver tst=new TestDriver();
            rs=tst.GetAllAppointedPatientDrEmail();
           
            
            Service service=new Service();
            while(rs.next()){
                expectedResultPatientName=test.GetAllAppointedPatientDetails(rs.getString("docUserName"));
            System.out.println("Expected result is :"+expectedResultPatientName.get(0));
            System.out.println("Expected result is :"+expectedResultPatientName.get(0));
                actualResultPatientName= service.getAllAppointedPatient(rs.getString("docUserName"));
              }
             for(int i=0;i<actualResultPatientName.size();i++){
                 System.out.println("Expected result is :"+expectedResultPatientName.get(i));
            System.out.println("Actual result is :"+actualResultPatientName.get(i).getName());
                 assertEquals("failed",expectedResultPatientName.get(i),actualResultPatientName.get(i).getName());
             }
        } catch (SQLException ex) {
            Logger.getLogger(GetAllAppointedPatientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     public ArrayList GetAllAppointedPatientDetails(String rs){
        ResultSet result=null;
        Connection connection;
        Statement statement;
        String query;
        ArrayList<String>patientName=new ArrayList<String>();
        try {
            connection = ConnectDB.connectToDB();
            statement = connection.createStatement();
            
                System.out.println("inside the rs next for doc email");
            query="SELECT name,gender,age,date,time,email FROM appointment WHERE docUserName='"+rs+"'";
           
            System.out.println("Query is:"+query);
            result= statement.executeQuery(query);
            while(result.next()){
               patientName.add(result.getString("name"));
                
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(TestDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    return patientName;
}
//      @Test
//    public void testGetAllAppointedPatientNullValue() {
//        System.out.println("getAllAppointedPatient");
//        ArrayList<String> docEmail=new ArrayList<String>();
//        TestDriver test=new TestDriver();
//        docEmail=test.EmptyDocEmail(); 
//        Service instance = new Service();
//        Appointment patientInfo = new Appointment();
//  
//        ArrayList<Appointment> result = instance.getAllAppointedPatient(docEmail.get(0));
//          
//        assertNull("List should be null", result);
//       
//        
//    }
}
