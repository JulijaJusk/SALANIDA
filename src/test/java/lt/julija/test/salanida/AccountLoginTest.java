package lt.julija.test.salanida;

import lt.julija.page.salanida.AccountLoginPage;
import lt.julija.test.TestBase;
import org.testng.annotations.BeforeMethod;

public class AccountLoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.open("https://salanida.lt/en/account/login?return_url=%2Faccount",8);
        AccountLoginPage.clickOnButtonAcceptCookies();
        AccountLoginPage.refreshWebPage(7);
    }
}
