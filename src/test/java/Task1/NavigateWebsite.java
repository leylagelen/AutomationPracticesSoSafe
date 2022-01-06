package Task1;

import Task1.Base.BaseStepsDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateWebsite extends BaseStepsDriver {
    @Given("Open Chrome browser and search the webpage")
    public void openChromeBrowserAndSearchTheWebpage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty(DRIVER_TYPE,DRIVER_PATH);
        driver = new ChromeDriver(options);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @When("User clicks Women tab")
    public void userClicksWomenTab() {
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
    }

    @And("User clicks Dresses tab")
    public void userClicksDressesTab() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")));
        element.click();
    }

    @And("User clicks T-shirts tab")
    public void userClicksTShirtsTab() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")));
        element.click();
    }

    @When("User clicks Search area and enters products name")
    public void userClicksSearchAreaAndEntersProductsName() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("search_query_top")));
        element.sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
    }
    @Given("Open Chrome browser and opens product url")
    public void openChromeBrowserAndOpensProductUrl() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty(DRIVER_TYPE,DRIVER_PATH);
        driver2 = new ChromeDriver(options);
        driver2.get(PRODUCT_URL);
        driver2.manage().window().maximize();
    }

    @When("User select product and adds to my cart")
    public void userSelectProductAndAddsToMyCart() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
        element.click();
    }

    @And("User clicks Proceed to checkout button on popup")
    public void userClicksProceedToCheckoutButtonOnPopup() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")));
        element.click();
    }

    @And("User clicks Proceed to checkout button on my cart")
    public void userClicksProceedToCheckoutButtonOnMyCart() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")));
        element.click();
    }

    @And("User enter password and email and clicks sign in button")
    public void userEnterPasswordAndEmailAndClicksSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        element.sendKeys("deneme3@deneme.com");
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        element2.sendKeys("Leyla4540.");
        driver2.findElement(By.id("SubmitLogin")).click();

    }

    @And("User clicks Proceed to checkout button on address screen")
    public void userClicksProceedToCheckoutButtonOnAddressScreen() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")));
        element.click();
    }

    @And("User clicks Terms of service and Proceed to checkout button")
    public void userClicksTermsOfServiceAndProceedToCheckoutButton() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-cgv")));
        element.click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button")));
        element2.click();
    }

    @And("User clicks Pay by Check button")
    public void userClicksPayByCheckButton() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("cheque")));
        element.click();
    }

    @And("User clicks I confirm my order button")
    public void userClicksIConfirmMyOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver2,20);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button")));
        element.click();
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[1]")));
        element1.isDisplayed();
    }

    @Then("Browser close itself")
    public void browserCloseItself() {
        driver.quit();
    }

    @Then("Second Browser close itself")
    public void secondBrowserCloseItself() {
        driver2.quit();
    }
}

