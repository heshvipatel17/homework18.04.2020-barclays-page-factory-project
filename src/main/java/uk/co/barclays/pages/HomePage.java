package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {

    By bankDropDownLink = By.linkText("Bank");
    By borrowDropDownLink = By.linkText("Borrow");
    By loginLink = By.linkText("Log In");

    public void mouseHoverOnBankDropDownLink() {
        mouseHoverToElement(bankDropDownLink);
    }

    public void mouseHoverAndClickOnBorrowDropDownLink() {
        mouseHoverToElementAndClick(borrowDropDownLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

}
