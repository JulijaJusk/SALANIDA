package lt.julija.test.salanida;

import lt.julija.page.salanida.SearchFunctionPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchFunctionTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String email = "julija.demoqa@gmail.com";
        String password = "SalanidaVilnius";
        SearchFunctionPage.open("https://salanida.lt/en/account/login?return_url=%2Faccount", 8);
        SearchFunctionPage.clickOnButtonAcceptCookies();
        SearchFunctionPage.refreshWebPage(7);
        SearchFunctionPage.enterEmail(email);
        SearchFunctionPage.enterPassword(password);
        SearchFunctionPage.clickOnButtonLogin();
    }

    @Test
    public void testSearchFunctionUsingInputWhite_Mohair() {

        String item = "WHITE MOHAIR";
        String expectedResult = "MELODY MOHAIR JUMPER WHITE";
        String actualResult;

        SearchFunctionPage.clickOnSearchElement();
        SearchFunctionPage.enterItemName(item);
        actualResult = SearchFunctionPage.readItemName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }

    @Test
    public void testSearchFunctionUsingNumbers12345() {

        String negativeInput = "12345";
        String expectedResult = "No results could be found";
        String actualResult;

        SearchFunctionPage.clickOnSearchElement();
        SearchFunctionPage.enterItemName(negativeInput);
        actualResult = SearchFunctionPage.readFoundResultMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
