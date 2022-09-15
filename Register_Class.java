package Login_Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Class {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\SoftwareDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("gender-male")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("FirstName")).sendKeys("Palash");
        Thread.sleep(1000);
        driver.findElement(By.id("LastName")).sendKeys("Panchal");
        Thread.sleep(1000);
       // driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > form > div:nth-child(1) > div.form-fields > div.inputs.date-of-birth > div > select.valid")).sendKeys("2");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("2");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > form > div:nth-child(1) > div.form-fields > div.inputs.date-of-birth > div > select:nth-child(2)")).sendKeys("February");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1986");
        Thread.sleep(1000);
        //driver.findElement(By.id("//input[@id='Email']")).sendKeys("palash2286@gmail.com");
        driver.findElement(By.id("Email")).sendKeys("palash2286@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys("palash22");
        Thread.sleep(1000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("palash22");
        Thread.sleep(1000);
        driver.findElement(By.id("register-button")).click();

    }
}
