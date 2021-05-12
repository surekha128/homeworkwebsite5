package browserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxXcart {
    public static void main(String[] args) {
        String baseurl=" https://www.x-cart.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        String title = driver.getTitle();
        System.out.println(title);
        boolean verifyTitle = title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");
        boolean verifyTitleContains= title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContains);
        System.out.println(title.length());
    }
}
