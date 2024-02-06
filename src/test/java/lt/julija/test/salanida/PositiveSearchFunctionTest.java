package lt.julija.test.salanida;

import lt.julija.page.salanida.AccountLoginPage;
import lt.julija.page.salanida.AddNewAccountAddressPage;
import lt.julija.page.salanida.PositiveSearchFunctionPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveSearchFunctionTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String email = "julija.demoqa@gmail.com";
        String password = "SalanidaVilnius";
        PositiveSearchFunctionPage.open("https://salanida.lt/en/account/login?return_url=%2Faccount",8);
        PositiveSearchFunctionPage.clickOnButtonAcceptCookies();
        PositiveSearchFunctionPage.refreshWebPage(7);
        PositiveSearchFunctionPage.enterEmail(email);
        PositiveSearchFunctionPage.enterPassword(password);
        PositiveSearchFunctionPage.clickOnButtonLogin();
    }

    @Test
    public void testPositiveInputSearch(){

        String item = "WHITE MOHAIR";
        String expectedResult = "MELODY MOHAIR JUMPER WHITE";
        String actualResult;
        PositiveSearchFunctionPage.clickOnSearchElement();
        PositiveSearchFunctionPage.enterItemName(item);
        actualResult = PositiveSearchFunctionPage.readItemName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
