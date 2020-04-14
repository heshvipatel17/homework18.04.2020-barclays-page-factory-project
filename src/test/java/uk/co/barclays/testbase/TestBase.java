package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;
import uk.co.barclays.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    //object creation
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    //getting "baseUrl" & "browser" values from config.properties
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");



    //open browser
    @BeforeMethod (groups = {"Sanity","Smoke","Regression"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    //close browser
    @AfterMethod (groups = {"Sanity","Smoke","Regression"})
    public void closeBrowser() {
        driver.quit();
    }
}


