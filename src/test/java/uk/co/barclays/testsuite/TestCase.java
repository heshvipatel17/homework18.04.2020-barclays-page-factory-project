package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class TestCase extends TestBase {
    HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldHoverOnBankLink() {
        homepage.mouseHoverOnBankDropDownLink();
    }

    @Test
    public void verifyUserShouldMouseHoverAndClickOnBorrowDropDownLink() {
        homepage.mouseHoverAndClickOnBorrowDropDownLink();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
    }

}
