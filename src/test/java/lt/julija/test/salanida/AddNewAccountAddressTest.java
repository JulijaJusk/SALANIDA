package lt.julija.test.salanida;

import lt.julija.page.salanida.AccountLoginPage;
import lt.julija.page.salanida.AddNewAccountAddressPage;
import lt.julija.test.TestBase;
import org.testng.annotations.BeforeMethod;

public class AddNewAccountAddressTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String email = "julija.demoqa@gmail.com";
        String password = "SalanidaVilnius";
        AddNewAccountAddressPage.open("https://salanida.lt/en/account/login?return_url=%2Faccount",8);
        AddNewAccountAddressPage.clickOnButtonAcceptCookies();
        AddNewAccountAddressPage.refreshWebPage(7);
        AddNewAccountAddressPage.enterEmail(email);
        AddNewAccountAddressPage.enterPassword(password);
        AddNewAccountAddressPage.clickOnButtonLogin();

    }
}
