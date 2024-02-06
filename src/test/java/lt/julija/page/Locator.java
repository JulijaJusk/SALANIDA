package lt.julija.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Salanida {

        public static By buttonManageAddresses = By.xpath("//a[@class='Button Button--primary']");
        public static By buttonAddNewAddresses = By.xpath("");

        public static class AccountLogin {

            public static By buttonAcceptCookies = By.xpath("//*[@id=\"ba-cookie-dismiss\"]");
            public static By inputEmail = By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
            public static By inputPassword = By.xpath("//input[@type='password']");
            public static By buttonLogin = By.xpath("//*[@id=\"customer_login\"]/button");
            public static By paragraphReadAccountName = By.xpath("//p[@class='AccountAddress']");
        }
    }
}
