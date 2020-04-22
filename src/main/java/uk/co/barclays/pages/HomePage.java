package uk.co.barclays.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Bank")
    WebElement _bankDropDownLink;

    @FindBy(linkText = "Borrow")
    WebElement _borrowDropDownLink;

    @FindBy(linkText = "Log In")
    WebElement _loginLink;

    public void mouseHoverOnBankDropDownLink() {
        Reporter.log("Click on Bank link " + _bankDropDownLink.toString() + "<br>");
        mouseHoverToElement(_bankDropDownLink);
        log.info("Click on Bank link " + _bankDropDownLink.toString());
    }

    public void mouseHoverAndClickOnBorrowDropDownLink() {
        Reporter.log("Click on borrow link " + _borrowDropDownLink.toString() + "<br>");
        mouseHoverToElementAndClick(_borrowDropDownLink);
        log.info("Click on borrow link " + _borrowDropDownLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.log("Click on login link " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("Click on login link " + _loginLink.toString());
    }

}
