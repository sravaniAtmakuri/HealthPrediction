
package Service;

import bean.Appointment;
import bean.DoctorBean;
import bean.LoginBean;
import bean.PatientBean;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServiceTest {
    
    public ServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testLogin() {
        System.out.println("login");
        String userName = "";
        String password = "";
        Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.login(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPatient method, of class Service.
     */
    @Test
    public void testInsertPatient() {
        System.out.println("insertPatient");
        PatientBean obj = null;
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertPatient(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDoctor method, of class Service.
     */
    @Test
    public void testInsertDoctor() {
        System.out.println("insertDoctor");
        DoctorBean obj = null;
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertDoctor(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDoctors method, of class Service.
     */
    @Test
    public void testSearchDoctors() {
        System.out.println("searchDoctors");
        String location = "";
        String gender = "";
        Service instance = new Service();
        ArrayList<DoctorBean> expResult = null;
        ArrayList<DoctorBean> result = instance.searchDoctors(location, gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatientProfile method, of class Service.
     */
    @Test
    public void testUpdatePatientProfile() {
        System.out.println("updatePatientProfile");
        PatientBean obj = null;
        String userName = "";
        Service instance = new Service();
        int expResult = 0;
        int result = instance.updatePatientProfile(obj, userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedback method, of class Service.
     */
    @Test
    public void testFeedback() {
        System.out.println("feedback");
        String feedback = "";
        String username = "";
        Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.feedback(feedback, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrievePatientData method, of class Service.
     */
    @Test
    public void testRetrievePatientData() {
        System.out.println("retrievePatientData");
        String userName = "";
        Service instance = new Service();
        PatientBean expResult = null;
        PatientBean result = instance.retrievePatientData(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPatientLoginDetails method, of class Service.
     */
    @Test
    public void testInsertPatientLoginDetails() {
        System.out.println("insertPatientLoginDetails");
        LoginBean obj = null;
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertPatientLoginDetails(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertDoctorLoginDetails method, of class Service.
     */
    @Test
    public void testInsertDoctorLoginDetails() {
        System.out.println("insertDoctorLoginDetails");
        LoginBean obj = null;
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertDoctorLoginDetails(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class Service.
     */
    @Test
    public void testGetUserType() {
        System.out.println("getUserType");
        String Username = "";
        String password = "";
        Service instance = new Service();
        LoginBean expResult = null;
        LoginBean result = instance.getUserType(Username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Service.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String Username = "";
        Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.checkUserName(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePassword method, of class Service.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("updatePassword");
        String username = "";
        String password = "";
        Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.updatePassword(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAppointedPatient method, of class Service.
     */
    @Test
    public void testGetAllAppointedPatient() {
        System.out.println("getAllAppointedPatient");
        String docEmail = "";
        Service instance = new Service();
        ArrayList<Appointment> expResult = null;
        ArrayList<Appointment> result = instance.getAllAppointedPatient(docEmail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prediction method, of class Service.
     */
    @Test
    public void testPrediction() {
        System.out.println("prediction");
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String age = "";
        Service instance = new Service();
        ArrayList expResult = null;
        ArrayList result = instance.prediction(a, b, c, d, e, age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pfind method, of class Service.
     */
    @Test
    public void testPfind() {
        System.out.println("pfind");
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String age_group = "";
        String disease = "";
        double expResult = 0.0;
        double result = Service.pfind(s1, s2, s3, s4, s5, age_group, disease);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAppointmentDetails method, of class Service.
     */
    @Test
    public void testInsertAppointmentDetails() {
        System.out.println("insertAppointmentDetails");
        Appointment obj = null;
        Service instance = new Service();
        int expResult = 0;
        int result = instance.insertAppointmentDetails(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientAge method, of class Service.
     */
    @Test
    public void testGetPatientAge() {
        System.out.println("getPatientAge");
        String UserName = "";
        Service instance = new Service();
        PatientBean expResult = null;
        PatientBean result = instance.getPatientAge(UserName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoctorEmail method, of class Service.
     */
    @Test
    public void testGetDoctorEmail() {
        System.out.println("getDoctorEmail");
        String UserName = "";
        Service instance = new Service();
        String expResult = "";
        String result = instance.getDoctorEmail(UserName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
