
package TestLibrary;

import Service.Service;
import TestDriver.TestDriver;
import bean.Appointment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GetAllAppointedPatientSize {
     @Test
    public void GetPatientListSize(){
        try {
            ArrayList<String> expectedResultPatientName=new ArrayList<String>();
            ArrayList<Appointment> actualResultPatientName=new ArrayList<Appointment>();
            
            GetAllAppointedPatientTest test=new GetAllAppointedPatientTest();
            ResultSet rs;
            TestDriver tst=new TestDriver();
            rs=tst.GetAllAppointedPatientDrEmail();
            
            
            
            Service service=new Service();
            while(rs.next()){
                expectedResultPatientName=test.GetAllAppointedPatientDetails(rs.getString("docUserName"));
                System.out.println("inside the while loop");
                 System.out.println("doc email is:"+rs.getString("docUserName"));
                actualResultPatientName= service.getAllAppointedPatient(rs.getString("docUserName"));
                System.out.println("actual result value:"+actualResultPatientName.get(0));
              }
            for(int i=0; i<expectedResultPatientName.size();i++){
                System.out.println("expected result values:"+expectedResultPatientName.get(i));
            }
            System.out.println("actual size is: "+actualResultPatientName.size());
             assertEquals("failed",expectedResultPatientName.size(),actualResultPatientName.size());
            
        } catch (SQLException ex) {
            Logger.getLogger(GetAllAppointedPatientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
