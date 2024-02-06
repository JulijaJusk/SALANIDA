package lt.julija.page.salanida;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

public class AddNewAccountAddressPage extends PageBase {

    public static void refreshWebPage(int sec) {
        Common.refreshPage(sec);
    }

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Salanida.AccountLogin.buttonAcceptCookies, 6);
        Common.clickOnElement(Locator.Salanida.AccountLogin.buttonAcceptCookies);
    }

    public static void enterEmail(String email) {
        Common.waitElementVisible(Locator.Salanida.AccountLogin.inputEmail, 8);
        Common.sendKeysToElement(Locator.Salanida.AccountLogin.inputEmail, email);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enterPassword(String password) {
        Common.waitElementIsEnabledCustomised(Locator.Salanida.AccountLogin.inputPassword, 8);
        Common.sendKeysToElement(Locator.Salanida.AccountLogin.inputPassword, password);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Salanida.AccountLogin.buttonLogin);
    }

    public static void clickOnButtonManageAddresses() {
        Common.clickOnElement(Locator.Salanida.AddNewAccountAddress.buttonManageAddresses);
    }

    public static void clickOnButtonAddANewAddress() {
        Common.clickOnElement(Locator.Salanida.AddNewAccountAddress.buttonAddNewAddress);
    }

    public static void enterCity(String city) {
        Common.waitElementIsEnabledCustomised(Locator.Salanida.AddNewAccountAddress.inputCity, 8);
        Common.sendKeysToElement(Locator.Salanida.AddNewAccountAddress.inputCity, city);
    }

    public static void clickOnElementSetDefault() {
        Common.clickOnElement(Locator.Salanida.AddNewAccountAddress.checkDefaultAddress);
    }

    public static void clickOnButtonAddANewAddress2() {
        Common.clickOnElement(Locator.Salanida.AddNewAccountAddress.buttonAddANewAddress2);
    }

    public static String readAddressCity() {
        Common.waitElementVisible(Locator.Salanida.AddNewAccountAddress.paragraphAddressCity, 8);
        return Common.getTextFromElement(Locator.Salanida.AddNewAccountAddress.paragraphAddressCity);
    }
}
