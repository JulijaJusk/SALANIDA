package lt.julija.test.salanida;

import lt.julija.page.salanida.AccountLoginPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountLoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.open("https://salanida.lt/en/account/login?return_url=%2Faccount",8);
        AccountLoginPage.clickOnButtonAcceptCookies();
        AccountLoginPage.refreshWebPage(7);
    }

    @Test
    public void testEnterValidLoginDetails(){
        String email = "julija.demoqa@gmail.com";
        String password = "SalanidaVilnius";
        String expectedResult = "";
        String actualResult;

        AccountLoginPage.enterEmail(email);
        AccountLoginPage.enterPassword(password);
        AccountLoginPage.clickOnButtonLogin();
        actualResult = AccountLoginPage.readAccountName();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
