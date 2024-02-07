package lt.julija.test.salanida;

import lt.julija.page.salanida.AddItemIntoCartPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemIntoCartTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AddItemIntoCartPage.open("https://salanida.lt/en", 8);
        AddItemIntoCartPage.clickOnButtonAcceptCookies();
    }

    @Test
    public void testAddSpecificSizeItemIntoCart() {
        String category = "MOHAIR";
        String sizeToSelect = "L-XL";
        String expectedResult = "L-XL";
        String actualResult = null;

        AddItemIntoCartPage.clickOnSearchElement();
        AddItemIntoCartPage.enterItemName(category);
        AddItemIntoCartPage.addFirstProductIntoCart();
        AddItemIntoCartPage.selectSize(sizeToSelect);
        AddItemIntoCartPage.clickOnButtonAddToCart();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
