package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class TestCase extends TestBase {
    HomePage homepage = new HomePage();

    @Test(priority = 0, groups = {"Sanity","Regression"})
    public void verifyUserShouldHoverOnBankLink() {
        homepage.mouseHoverOnBankDropDownLink();
    }

    @Test(priority = 1, groups = {"Smoke","Regression"})
    public void verifyUserShouldMouseHoverAndClickOnBorrowDropDownLink() {
        homepage.mouseHoverAndClickOnBorrowDropDownLink();
    }

    @Test(priority = 2, groups = {"Regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
    }

}
