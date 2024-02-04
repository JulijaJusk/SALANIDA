package lt.julija.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Salanida {
        public static class AccountLogin {

            public static By buttonAcceptCookies = By.xpath("/html/body/div[2]/div");
            public static By inputEmail = By
                    .xpath("/html/body/div[8]/main/div/section/div/div/form[2]/div[1]");
            public static By inputPassword = By.xpath("//input[@type='password']");
        }
    }
}
