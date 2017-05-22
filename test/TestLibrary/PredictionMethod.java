
package TestLibrary;

import Service.Service;
import TestDriver.TestDriver;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PredictionMethod {
  
    public PredictionMethod() {
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
    public void testPrediction() {
        TestDriver testDriver = new TestDriver();
        ArrayList<String> symptom1 = new ArrayList<String>();
        ArrayList<String> symptom2 = new ArrayList<String>();
        ArrayList<String> symptom3 = new ArrayList<String>();
        ArrayList<String> symptom4 = new ArrayList<String>();
        ArrayList<String> symptom5 = new ArrayList<String>();
        ArrayList<String> ageGroup = new ArrayList<String>();
        Service instance = new Service();

        ArrayList<String> expectedResult = new ArrayList<String>();
        try {
            ResultSet result = testDriver.getSymptomTable();
            while (result.next()) {
                symptom1.add(result.getString("Symptom1"));
                symptom2.add(result.getString("Symptom2"));
                symptom3.add(result.getString("Symptom3"));
                symptom4.add(result.getString("Symptom4"));
                symptom5.add(result.getString("Symptom5"));
                ageGroup.add(result.getString("AgeGroup"));
            }

            //expected result set
            ResultSet diseaseNames = testDriver.getDiseaseForGivenSymptoms();
            while (diseaseNames.next()) {
                expectedResult.add(diseaseNames.getString("DiseaseName"));
            }

        } catch (Exception e) {

        }
        ArrayList<String> diseaseNameList = new ArrayList<String>();
        for (int i = 0; i < symptom1.size(); i++) {
            ArrayList predictedDiseases = instance.prediction(symptom1.get(i), symptom2.get(i),
                    symptom3.get(i), symptom4.get(i), symptom5.get(i), ageGroup.get(i));
            
            String result = structResult(predictedDiseases, symptom2.get(i), symptom3.get(i), symptom4.get(i), symptom5.get(i));
            assertEquals("Failed Prediction test case. Expected disaese:" + expectedResult.get(i)
                    + " Actual disease: " + result, expectedResult.get(i), result);

           
        }
        
    }


    public String structResult(ArrayList<String> result, String symptom2, String symptom3, String symptom4, String symptom5) {
        String message = "";
        for (int i = 0; i < result.size(); i++) {
            if (symptom2.equalsIgnoreCase("null") && symptom3.equalsIgnoreCase("null") && symptom4.equalsIgnoreCase("null") && symptom5.equalsIgnoreCase("null")) {
                message = result.get(0) + message;
                break;
            } else if (symptom3.equalsIgnoreCase("null") && symptom4.equalsIgnoreCase("null") && symptom5.equalsIgnoreCase("null")) {
                message = result.get(0) + message;
                break;
            } else if (symptom4.equalsIgnoreCase("null") && symptom5.equalsIgnoreCase("null")) {
                message = result.get(0) + message;
                break;
            } else if (symptom5.equalsIgnoreCase("null")) {
                message = result.get(0) + message;
                break;
            }
            message = result.get(0) + message;
        }
        return message;
    }

    
    
}

