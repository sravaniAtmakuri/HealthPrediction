
package Service;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ForgotpwdFeedback {
     static String driverPath="C:\\Users\\vamsikrishna\\Desktop\\Selenium\\IEDriverServer_x64_2.52.0\\";
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {

DesiredCapabilities dc = DesiredCapabilities.firefox();


dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");

        
      driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/span[2]/a")).click();
     driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("rty");
      driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("rty1");
       driver.findElement(By.xpath("//*[@id=\'Confirmpassword\']")).sendKeys("rty1");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
         
           driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("rty");
         driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("rty1");
            Thread.sleep(4000);
         driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
          Thread.sleep(4000);
          driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[3]/a")).click();
           driver.findElement(By.xpath("//*[@id=\'submitFeedback\']")).sendKeys("Nice prediction");
           Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\'contact\']/div/div/form/div/div[2]/button")).click();
             Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul[2]/li/a")).click();
          
      
         
    
}catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


    

