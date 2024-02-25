import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\eclipse\\ChromeDriver for selenium\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the ParaBank registration page
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        // Pause execution for 5 seconds (implicit wait)
        Thread.sleep(5000);

        // Find the register link by its link text
        WebElement registerLink = driver.findElement(By.linkText("Register"));

        // Pause execution for 5 seconds (implicit wait)
        Thread.sleep(5000);

        // Click on the register link
        registerLink.click();

        // Pause execution for 2 seconds (implicit wait)
        Thread.sleep(2000);

        // Find and input the first name
        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        Thread.sleep(2000);
        firstName.sendKeys("John");
        Thread.sleep(2000);

        // Find and input the last name
        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        Thread.sleep(2000);
        lastName.sendKeys("Doe");
        Thread.sleep(2000);

        // Find and input the address
        WebElement address = driver.findElement(By.id("customer.address.street"));
        Thread.sleep(2000);
        address.sendKeys("123 Main Street");
        Thread.sleep(2000);

        // Find and input the city
        WebElement city = driver.findElement(By.id("customer.address.city"));
        Thread.sleep(2000);
        city.sendKeys("Anytown");
        Thread.sleep(2000);

        // Find and input the state
        WebElement state = driver.findElement(By.id("customer.address.state"));
        Thread.sleep(2000);
        state.sendKeys("California");
        Thread.sleep(2000);

        // Find and input the zip code
        WebElement zipCode = driver.findElement(By.id("customer.address.zipCode"));
        Thread.sleep(2000);
        zipCode.sendKeys("12345");
        Thread.sleep(2000);

        // Find and input the phone number
        WebElement phoneNumber = driver.findElement(By.id("customer.phoneNumber"));
        Thread.sleep(2000);
        phoneNumber.sendKeys("555-123-4567");
        Thread.sleep(2000);

        // Find and input the SSN
        WebElement ssn = driver.findElement(By.id("customer.ssn"));
        Thread.sleep(2000);
        ssn.sendKeys("123-45-6789");
        Thread.sleep(2000);

        // Find and input the username
        WebElement username = driver.findElement(By.id("customer.username"));
        Thread.sleep(2000);
        username.sendKeys("johndoe123");
        Thread.sleep(2000);

        // Find and input the password
        WebElement password = driver.findElement(By.id("customer.password"));
        Thread.sleep(2000);
        password.sendKeys("myPassword123");
        Thread.sleep(2000);

        // Find and confirm the password
        WebElement confirmPassword = driver.findElement(By.id("repeatedPassword"));
        Thread.sleep(2000);
        confirmPassword.sendKeys("myPassword123");
    }
}
