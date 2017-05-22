/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author parikshit
 */

import Utility.Constant;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.bouncycastle.asn1.x500.style.RFC4519Style.dc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utility.ExcelUtils;

public class myProfile {
    
   
  
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
     
        try {
            DesiredCapabilities dc = DesiredCapabilities.firefox();
//  getPropValues();
      //  String log4jConfPath = "/path/to/log4j.properties";
        

dc.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
//System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe" );
WebDriver driver = new FirefoxDriver(dc);
driver.get("http://localhost:8080/HealthPrediction/loginPage.jsp");

//    driver.navigate().to();
driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/span[1]/a")).click();

driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/span/a")).click();
     Thread.sleep(100);
     
     ExcelUtils.setExcelFile(Constant.path_TestData+Constant.file_TestData,"Sample");

     
    String name = ExcelUtils.getCellData(1,0);
    String email = ExcelUtils.getCellData(1,1);       
    String address = ExcelUtils.getCellData(1,2);
   
    String Age = ExcelUtils.getCellData(1,3);
    String username = ExcelUtils.getCellData(1,4);
    String password = ExcelUtils.getCellData(1,5);
    String Cpassword = ExcelUtils.getCellData(1,6);
    
     driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
     driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
     driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(address);
     driver.findElement(By.xpath("//*[@id=\"patientReg\"]/div/div[4]/input[1]")).click();
     driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys(Age);
     driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(username);
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
     driver.findElement(By.xpath("//*[@id=\"confirmpassword\"]")).sendKeys(Cpassword);
    
    
    
     Thread.sleep(100);
     
     driver.findElement(By.xpath("//*[@id=\"patientReg\"]/div/div[9]/input[@class=\'btn btn-block btn-lg btn-primary']")).click();
     
     ExcelUtils.setCellData("Pass",1, 7);
     
  
     driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(username);
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
     driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
     Thread.sleep(100);
     
     driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();
        
   
         } catch (Exception ex) {
           
            
        }

    }
    
}
