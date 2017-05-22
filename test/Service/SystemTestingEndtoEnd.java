
package Service;

import Utility.Constant;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.ExcelUtils;




public class SystemTestingEndtoEnd {
    
    static String driverPath="C:\\Users\\vamsikrishna\\Desktop\\Selenium\\IEDriverServer_x64_2.52.0\\";
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {
            //     DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
//     dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//     System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
//     WebDriver driver = new InternetExplorerDriver(dc);
//
DesiredCapabilities dc = DesiredCapabilities.firefox();
//  getPropValues();

dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");

//    driver.navigate().to();
driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("rty");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("rty");
driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
     Thread.sleep(100);
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).sendKeys("fever");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).sendKeys("headache");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).sendKeys("cough");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).sendKeys("vomiting");
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[6]")).sendKeys("34");
     Thread.sleep(3000);
     driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[1]/a")).click();
      Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div/div[2]/div/a")).click();
      driver.findElement(By.xpath("//*[@id=\'patientProfileEdit\']/div/div/div[2]/table/tbody/tr[3]/td[2]/input")).clear();
     driver.findElement(By.xpath("//*[@id=\'patientProfileEdit\']/div/div/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("28");
     driver.findElement(By.xpath("//*[@id=\'patientProfileEdit\']/div/div/div[2]/div/input")).click();
     Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\'my-navbar\']/ul[1]/li[2]/a")).click();
      driver.findElement(By.xpath("//*[@id=\'submitFeedback\']")).sendKeys("Good nice APPlication"); 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'contact\']/div/div/form/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul[1]/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/form/div/input")).sendKeys("harrison");
         driver.findElement(By.xpath("/html/body/section/div/form/div/p/label[1]/input")).click();
         Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/fieldset/table/tbody/tr[4]/td[7]/a")).click();
         driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("rty");
          driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("rty@gmail.com");
           driver.findElement(By.xpath("//*[@id=\'adate\']")).sendKeys("05/01/2017");
            driver.findElement(By.xpath("//*[@id=\'atime\']")).sendKeys("10.00 AM");
             driver.findElement(By.xpath("//*[@id=\'bookAppointment\']/div/div[5]/input[1]")).click();
              Thread.sleep(3000);
              driver.findElement(By.xpath("//*[@id=\'bookAppointment\']/div/div[6]/input")).click();
              Thread.sleep(3000);
              driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[4]/a")).click();
               Thread.sleep(3000);
               driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("johnmax");
              driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("johnmax");
             driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
           Thread.sleep(3000);
             driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul[2]/li/a")).click();
                Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/span[1]/a")).click();
         driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("demo@gmail.com");
        driver.findElement(By.xpath("//*[@id=\'address\']")).sendKeys("NJ harrison");
         driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div[4]/input[2]")).click();
          driver.findElement(By.xpath("//*[@id=\'age\']")).sendKeys("25");
        driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'confirmpassword\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'patientReg\']/div/div[9]/input")).click();
         Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/span[2]/a")).click();
          driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("demo");
        driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("demo1");
        driver.findElement(By.xpath("//*[@id=\'Confirmpassword\']")).sendKeys("demo1");
         Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
          
        

}catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}

    

