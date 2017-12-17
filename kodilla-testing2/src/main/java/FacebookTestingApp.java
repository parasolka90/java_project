import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String FACEBOOK_URL = "https://www.facebook.com/";
    public static final String FIRSTNAME = "//input[@name=\"firstname\"]";
    public static final String LASTNAME = "//input[@name=\"lastname\"]";
    public static final String EMAIL1 = "//input[@name=\"reg_email__\"]";
    public static final String EMAIL2 = "//input[@name=\"reg_email_confirmation__\"]";
    public static final String PASSWORD = "//input[@name=\"reg_passwd__\"]";
    public static final String SELECT_MONTH = "//select[@id=\"month\"]";
    public static final String SELECT_DAY = "//select[@id=\"day\"]";
    public static final String SELECT_YEAR = "//select[@id=\"year\"]";
    public static final String RADIO = "//input[@name=\"sex\" and @value=\"2\"]";
    public static final String SUBMIT = "//button[@name=\"websubmit\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(FACEBOOK_URL);

        while (!driver.findElement(By.xpath(FIRSTNAME)).isDisplayed());
        WebElement firstName = driver.findElement(By.xpath(FIRSTNAME));
        firstName.sendKeys("Jon");

        WebElement lastName = driver.findElement(By.xpath(LASTNAME));
        lastName.sendKeys("Snow");

        WebElement email1 = driver.findElement(By.xpath(EMAIL1));
        email1.sendKeys("pizzaMail1ff3FB@gmail.com");

        while (!driver.findElement(By.xpath(EMAIL2)).isDisplayed());
        WebElement email2 = driver.findElement(By.xpath(EMAIL2));
        email2.sendKeys("pizzaMail1ff3FB@gmail.com");

        WebElement password = driver.findElement(By.xpath(PASSWORD));
        password.sendKeys("FbPizzaP4ssword");

        WebElement selectMonthEl = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(selectMonthEl);
        selectMonth.selectByIndex(3);

        WebElement selectDayEl = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(selectDayEl);
        selectDay.selectByIndex(3);

        WebElement selectYearEl = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(selectYearEl);
        selectYear.selectByValue("1998");

        WebElement radioButton = driver.findElement(By.xpath(RADIO));
        radioButton.click();

        WebElement submitButton = driver.findElement(By.xpath(SUBMIT));
        submitButton.click();
    }
}