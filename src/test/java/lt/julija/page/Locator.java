package lt.julija.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Salanida {

        public static class AccountLogin {

            public static By buttonAcceptCookies = By.xpath("//*[@id=\"ba-cookie-dismiss\"]");
            public static By inputEmail = By.xpath("//*[@id=\"customer_login\"]/div[1]/input");
            public static By inputPassword = By.xpath("//input[@type='password']");
            public static By buttonLogin = By.xpath("//*[@id=\"customer_login\"]/button");
            public static By paragraphReadAccountName = By.xpath("//p[@class='AccountAddress']");
        }

        public static class AddNewAccountAddress {

            public static By buttonManageAddresses = By.xpath("//a[@class='Button Button--primary']");
            public static By buttonAddNewAddress = By.xpath("//button[@class='Button Button--primary']");
            public static By inputCity = By.xpath("//input[@name='address[city]']");
            public static By checkDefaultAddress = By.xpath("//input[@type='checkbox']");
            public static By buttonAddANewAddress2 = By
                    .xpath("//button[@class='Form__Submit Button Button--primary Button--full']");
            public static By paragraphAddressCity = By.xpath("//p[@class='AccountAddress']");
        }

        public static class PositiveSearchFunction {

            public static By buttonSearch = By.xpath("//a[@href='/en/search']");
            public static By inputItemName = By.xpath("//input[@type='search']");
            public static By paragraphItemName = By
                    .xpath("(//a[contains(@href, 'melody-jumper-white')])[2]");
        }

        public static class AddItemIntoCart {


            public static By buttonAcceptCookies = By.xpath("");
        }
    }
}


