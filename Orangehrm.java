import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\eclipse\\ChromeDriver for selenium\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        Thread.sleep(5000);
        
        // Scroll to the "30-Day Free Trial" button
        WebElement button = driver.findElement(By.xpath("//button[text()='30-Day Free Trial']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        Thread.sleep(3000);
        
        // Click on the button using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        Thread.sleep(3000);
        
        // Locate the button by class name
        WebElement button1 = driver.findElement(By.xpath("/html/body/nav/div/div[2]/div[2]/ul/li[1]/a/button"));
        Thread.sleep(3000);
        // Click the button
        button1.click();
       
        Thread.sleep(3000);
        // Enter Full Name
        WebElement fullName = driver.findElement(By.name("FullName"));
        Thread.sleep(2000);
        fullName.sendKeys("SAKTHIVEL MURUGAN S");
        Thread.sleep(3000);
        // Enter Email
        WebElement email = driver.findElement(By.id("Form_getForm_Email"));
        Thread.sleep(2000);
        email.sendKeys("21ecb23@karpagamtech.ac.in");
        Thread.sleep(3000);
        // Enter Company Name
        WebElement companyName = driver.findElement(By.id("Form_getForm_CompanyName"));
        Thread.sleep(2000);
        companyName.sendKeys("KarpagamTech");
        Thread.sleep(3000);
        // Expand the Country dropdown
        WebElement dropdown = driver.findElement(By.id("Form_getForm_Country"));
        Thread.sleep(2000);
        dropdown.click();
        Thread.sleep(3000);
        
        // Scroll to and select India from the dropdown
        WebElement indiaOption = driver.findElement(By.xpath("//option[@value='India']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", indiaOption);
        Thread.sleep(3000);
        indiaOption.click();
        Thread.sleep(3000);
        // Enter Phone Number
        WebElement phoneNo = driver.findElement(By.id("Form_getForm_Contact"));
        Thread.sleep(3000);
        phoneNo.sendKeys("8903564432");
        Thread.sleep(3000);
        // Locate the reCAPTCHA checkbox by class name
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]"));
        Thread.sleep(3000);
        // Click the checkbox
        checkbox.click();
        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}
