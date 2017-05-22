
package Service;

import static com.sun.xml.bind.WhiteSpaceProcessor.collapse;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.xmlbeans.impl.common.XmlWhitespace.collapse;
import static org.apache.xmlbeans.impl.common.XmlWhitespace.collapse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LoginSarchDrBkApptSeleniumIntegration {

     static String driverPath="C:\\Users\\vamsikrishna\\Desktop\\Selenium\\IEDriverServer_x64_2.52.0\\";
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {
            DesiredCapabilities dc = DesiredCapabilities.firefox();
//  getPropValues();

dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");

//    driver.navigate().to();
driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("test2");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("test2");
driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
     Thread.sleep(1000);
    
     driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/a")).click();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input")).sendKeys("harrison");
          driver.findElement(By.xpath("/html/body/section/div/form/div/p/label[1]/input")).click();
           Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[3]/td[7]/a")).click();
       driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sravani");
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("fake2@yahoo.com");
       driver.findElement(By.xpath("//*[@id=\"adate\"]")).sendKeys("04/15/2017");
       driver.findElement(By.xpath("//*[@id=\"atime\"]")).sendKeys("10.00 Am");
       driver.findElement(By.xpath("//*[@id=\"bookAppointment\"]/div/div[5]/input[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bookAppointment\"]/div/div[6]/input")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[4]/a")).click();
      Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("reamus");
       driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("reamus");
       driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
     
     Thread.sleep(2000);
     
         } catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    }

    

