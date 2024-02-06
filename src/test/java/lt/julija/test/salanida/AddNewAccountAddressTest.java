package lt.julija.test.salanida;

import lt.julija.page.salanida.AccountLoginPage;
import lt.julija.page.salanida.AddNewAccountAddressPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    @Test
    public void testAddNewAccountAddress(){

        String city = "City";
        String expectedResult = "Vilnius";
        String actualResult;
        AddNewAccountAddressPage.clickOnButtonManageAddresses();
        AddNewAccountAddressPage.clickOnButtonAddANewAddress();
        AddNewAccountAddressPage.enterCity(city);
        AddNewAccountAddressPage.clickOnElementSetDefault();
        AddNewAccountAddressPage.clickOnButtonAddANewAddress2();
        actualResult = AddNewAccountAddressPage.readAddressCity();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
