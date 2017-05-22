
package Service;

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


public class PredictionSeleniumIntegration {
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
driver.findElement(By.xpath("//*[@id=\'userName\']")).sendKeys("test2");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("test2");
driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[3]/input")).click();
//     Thread.sleep(100);
//     driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).sendKeys("fever");
//     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).sendKeys("headache");
//     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).sendKeys("cough");
//     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).sendKeys("vomiting");
//     driver.findElement(By.xpath("/html/body/section/div/form/div/input[6]")).sendKeys("34");
//     Thread.sleep(100);
//     driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();

ExcelUtils.setExcelFile(Constant.path_TestData+Constant.file_TestData,"Sample");
ArrayList<String>data;
for(int i=1;i<=3;i++){
   data= new ArrayList<String>();
    data.add(ExcelUtils.getCellData(i, 0));
        data.add(ExcelUtils.getCellData(i, 1));
            data.add(ExcelUtils.getCellData(i, 2));
                data.add(ExcelUtils.getCellData(i, 3));
                    data.add(ExcelUtils.getCellData(i, 4));
                        data.add(ExcelUtils.getCellData(i, 5));
                        System.out.println("data value is  "+data.get(i));
//String sym1 = ExcelUtils.getCellData(1, 0);
//String sym2 = ExcelUtils.getCellData(1, 1);       
//String sym3 = ExcelUtils.getCellData(1, 2);
//String sym4 = ExcelUtils.getCellData(1, 3);
//String sym5 = ExcelUtils.getCellData(1, 4);
//String sym6 = ExcelUtils.getCellData(1, 5);
  driver.findElement(By.xpath("/html/body/section/div/form/div/input[1]")).sendKeys(data.get(0));
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[2]")).sendKeys(data.get(1));
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[3]")).sendKeys(data.get(2));
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[4]")).sendKeys(data.get(3));
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[5]")).clear();
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[5]")).sendKeys(data.get(4));
     driver.findElement(By.xpath("/html/body/section/div/form/div/input[6]")).sendKeys(""+data.get(5));

          Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/section/div/form/div/button")).click();
     String yourtext=driver.findElement(By.xpath("/html/body/section/div/form/h1")).getText();
    String [] split=yourtext.split("\"");
    String diseaseText=split[1];
     System.out.println("your text is:"+diseaseText);
     
     ExcelUtils.setCellData(diseaseText, i, 6);

}

   

System.out.println("Successfully opened the website www.Store.Demoqa.com");
        } catch (Exception ex) {
            Logger.getLogger(PredictionSeleniumIntegration.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
}
