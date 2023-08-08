package team.gglive;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.*;

import java.security.PublicKey;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Base_Config {

    WebDriver driver;

    @BeforeClass
    public void configSeleniumWebdriver() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://stg.gglive.vn/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
//    @BeforeTest
//    public void beforeTestScript(){
//        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//    }
//
//    @AfterTest
//    public void afterTestScript(){
//        driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
//    }

    @AfterClass
    public void tearDown() {
        //actual automation
        driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
        driver.quit();
    }




}
