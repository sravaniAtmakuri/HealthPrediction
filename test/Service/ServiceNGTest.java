/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import bean.Appointment;
import bean.DoctorBean;
import bean.LoginBean;
import bean.PatientBean;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author vamsikrishna
 */
public class ServiceNGTest {
    
    public ServiceNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of login method, of class Service.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String userName = "";
        String password = "";
        Service instance = new Service();
        boolean expResult = false;
        boolean result = instance.login(userName, password);
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        ArrayList expResult = null;
        ArrayList result = instance.searchDoctors(location, gender);
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        ArrayList expResult = null;
        ArrayList result = instance.getAllAppointedPatient(docEmail);
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult, 0.0);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
