package Task1.Base;

import org.openqa.selenium.WebDriver;

public class BaseStepsDriver {
    public static final String DRIVER_PATH = "Driver/chromedriver";
    public static final String DRIVER_TYPE = "webdriver.chrome.driver";
    public final String BASE_URL = "http://automationpractice.com/";
    public final String PRODUCT_URL = "http://automationpractice.com/index.php?id_product=1&controller=product";
    public WebDriver driver;
    public WebDriver driver2;


}
