package Task2;

import Task2.Base.BaseStepsDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class SoSafeTestCases extends BaseStepsDriver {
    @Given("Open Chrome browser and search the SoSafe web page")
    public void openChromeBrowserAndSearchTheSoSafeWebPage() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty(DRIVER_TYPE,DRIVER_PATH);
        driver = new ChromeDriver(options);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @When("User clicks on the Demo navigation button")
    public void userClicksOnTheDemoNavigationButton() {
        driver.findElement(By.id("CookieBoxSaveButton")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[1]/div[2]/div/nav[1]/ul/li[4]/a")).click();
    }

    @And("User sees E-learning, Phishing and Analytics demo icons")
    public void userSeesELearningPhishingAndAnalyticsDemoIcons() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[3]/div/div[2]/div/div[2]/span/a/img")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[3]/div/div[3]/div/div[2]/span/a/img")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[3]/div/div[4]/div/div[2]/span/a/img")).isDisplayed();
    }

    @And("User clicks E-learning demo icon")
    public void userClicksELearningDemoIcon() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[3]/div/div[2]/div/div[2]/span/a/img")).click();
    }

    @And("User sees E-learning demo request content is being displayed")
    public void userSeesELearningDemoRequestContentIsBeingDisplayed() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[5]/div/div[6]/div/div[2]/a/span")).isDisplayed();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[5]/div/div[7]/div/div[2]/a/span")).isDisplayed();

    }

    @And("User clicks the E-learning demo button")
    public void userClicksTheELearningDemoButton() throws InterruptedException {
        WebElement eLearning = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[5]/div/div[6]/div/div[2]/a/span"));
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",eLearning);
        Thread.sleep(5000);
        eLearning.click();

    }

    @And("User fills data to form")
    public void userFillsDataToForm() {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("hs-form-iframe-0"));
        driver.findElement(By.name("email")).sendKeys("deneme3@deneme.com");
        driver.findElement(By.name("firstname")).sendKeys("Arya");
        driver.findElement(By.name("lastname")).sendKeys("Stark");
        driver.findElement(By.name("phone")).sendKeys("31453456252");
        driver.findElement(By.name("company")).sendKeys("Winter fell LLC");
        driver.findElement(By.name("jobtitle")).sendKeys("CEO");
        driver.findElement(By.name("numemployees")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select/option[3]")).click();
        driver.findElement(By.xpath("/html/body/div/form/div[10]/div[2]/input")).click();
    }

    @Then("User sees confirmation message")
    public void userSeesConfirmationMessage() {
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div[1]/div/div/div/div[1]/h1[2]")).isDisplayed();
    }

    @Then("Browser close itself after case")
    public void browserCloseItselfAfterCase() {
        driver.close();
    }
}
