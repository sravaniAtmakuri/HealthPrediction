
package Service;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PatientLoginMyProfile {
      static String driverPath="C:\\Users\\vamsikrishna\\Desktop\\Selenium\\IEDriverServer_x64_2.52.0\\";
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {

DesiredCapabilities dc = DesiredCapabilities.firefox();


dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");

  driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("johnbill");
         driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("johnbill");
            Thread.sleep(4000);
         driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
        
               Thread.sleep(4000);
          driver.findElement(By.xpath(" //*[@id=\'navbar-collapse\']/ul/li[1]/a")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div/div[2]/div/a")).click();
          driver.findElement(By.xpath("//*[@id=\'patientProfileEdit\']/div/div/div[2]/table/tbody/tr[6]/td[2]/input")).sendKeys("Harrison, Newark,NJ");
          Thread.sleep(4000);
             driver.findElement(By.xpath("//*[@id=\'patientProfileEdit\']/div/div/div[2]/div/input")).click();
             Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\'my-navbar\']/ul[2]/li/a")).click(); 
          
          
          
          
    
}catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}