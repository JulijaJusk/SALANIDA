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

}
