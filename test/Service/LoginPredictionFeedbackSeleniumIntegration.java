
package Service;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LoginPredictionFeedbackSeleniumIntegration {
     public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {
            DesiredCapabilities dc = DesiredCapabilities.firefox();
            dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
            WebDriver driver = new FirefoxDriver(dc);
            driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");
            driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("johnbill");
            driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("johnbill");
            driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
            Thread.sleep(1000);
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).sendKeys("fever");
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).clear();
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).sendKeys("headache");
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).clear();
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).sendKeys("cough");
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).clear();
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).sendKeys("vomiting");
             driver.findElement(By.xpath("/html/body/section/div/form/div/input[6]")).sendKeys("34");
             Thread.sleep(1000);
             driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();
             driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[3]/a")).click();
             driver.findElement(By.xpath("//*[@id='submitFeedback']")).sendKeys("Disease prediction is sensiible");
             driver.findElement(By.xpath("//*[@id=\'contact\']/div/div/form/div/div[2]/button")).click();
             driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul[2]/li/a")).click();
         
}catch(Exception e){
    
}
     }
}