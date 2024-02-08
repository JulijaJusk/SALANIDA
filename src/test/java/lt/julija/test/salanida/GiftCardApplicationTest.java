package lt.julija.test.salanida;

import lt.julija.page.salanida.GiftCardApplicationPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardApplicationTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        String category = "MOHAIR";
        String sizeToSelect = "L-XL";

        GiftCardApplicationPage.open("https://salanida.lt/en", 8);
        GiftCardApplicationPage.clickOnButtonAcceptCookies();
        GiftCardApplicationPage.clickOnSearchElement();
        GiftCardApplicationPage.enterItemName(category);
        GiftCardApplicationPage.addFirstProductIntoCart();
        GiftCardApplicationPage.selectSize(sizeToSelect);
        GiftCardApplicationPage.clickOnButtonAddToCart();
    }

    @Test
    public void testGiftCardPaymentMethodUsingInvalidCode() {
        String invalidCodeInput = "NOT VALID";
        String expectedResult = "Enter a valid discount code or gift card";
        String actualResult = "";

        GiftCardApplicationPage.clickOnCheckboxTermsAndCoditions();
        GiftCardApplicationPage.clickOnButtonCheckout();
        GiftCardApplicationPage.enterInvalidGiftCode(invalidCodeInput);
        GiftCardApplicationPage.clickOnButtonApply();
        actualResult = GiftCardApplicationPage.readRejectionMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
