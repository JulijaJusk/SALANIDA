package lt.julija.page.salanida;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

import java.util.List;

public class AddItemIntoCartPage extends PageBase {

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Salanida.AccountLogin.buttonAcceptCookies, 6);

        Common.clickOnElementByActions(Locator.Salanida.AccountLogin.buttonAcceptCookies);
    }

    public static void clickOnSearchElement() {
        Common.clickOnElement(Locator.Salanida.AddItemIntoCart.buttonSearch);
    }

    public static void enterItemName(String category) {
        Common.waitElementIsEnabledCustomised(Locator.Salanida.AddItemIntoCart.inputCategoryName, 8);
        Common.sendKeysToElement(Locator.Salanida.AddItemIntoCart.inputCategoryName, category);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void addFirstProductIntoCart() {
        Common.clickOnElement(Locator.Salanida.AddItemIntoCart.firstProduct);

    }

    public static void selectSize(String size) {
        Common.waitElementVisible(Locator.Salanida.AddItemIntoCart.allAvailableSizes, 6);
        List<String> listOfAvailableSizes = Common.getTextFromElements(Locator.Salanida
                .AddItemIntoCart.allAvailableSizes);
        int itemToSelect = 1;

        for (int i = 0; i < listOfAvailableSizes.size(); i++) {
            if (listOfAvailableSizes.get(i).equals(size)) {
                itemToSelect = i + 1;
            }
        }

        Common.clickOnElement(Locator.Salanida.AddItemIntoCart.listItemSize(itemToSelect));
    }

    public static void clickOnButtonAddToCart() {
        Common.clickOnElement(Locator.Salanida.AddItemIntoCart.buttonAddToCart);
    }

    public static String readItemName() {
        Common.waitElementVisible(Locator.Salanida.AddItemIntoCart.paragraphReadItemName, 8);
        return Common.getTextFromElement(Locator.Salanida.AddItemIntoCart.paragraphReadItemName);
    }
}

