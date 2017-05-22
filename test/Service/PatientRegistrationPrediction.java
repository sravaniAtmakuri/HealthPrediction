
package Service;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PatientRegistrationPrediction {
      static String driverPath="C:\\Users\\vamsikrishna\\Desktop\\Selenium\\IEDriverServer_x64_2.52.0\\";
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {

DesiredCapabilities dc = DesiredCapabilities.firefox();


dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");
driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/span[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("demo@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'address\']")).sendKeys("NJ harrison");
        driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div[4]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'age\']")).sendKeys("25");
        driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("demo5");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("demo5");
        driver.findElement(By.xpath("//*[@id=\'confirmpassword\']")).sendKeys("demo5");
        driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div[9]/input")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("demo5");
         driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("demo5");
         driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
         Thread.sleep(6000);
         driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).sendKeys("fever");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).sendKeys("headache");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).sendKeys("cough");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).sendKeys("vomiting");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[6]")).sendKeys("34");
     Thread.sleep(6000);
       driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click(); 
        Thread.sleep(6000);
       driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[4]/a")).click();
         
    
}catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

