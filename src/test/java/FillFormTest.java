import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FillFormTest {

	@Test
	public void simpleFillFormTest() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src//test//resources//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Open Form Webpage
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Get Form Fields
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement genderMale = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		WebElement mobile = driver.findElement(By.id("userNumber"));
		WebElement birth = driver.findElement(By.id("userEmail"));
		WebElement subjects = driver.findElement(By.id("subjectsInput"));
		WebElement hobbiesMusic = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		WebElement picture = driver.findElement(By.id("uploadPicture"));
		WebElement currentAddres = driver.findElement(By.id("currentAddress"));
		WebElement state = driver.findElement(By.id("state"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement submitBtn = driver.findElement(By.id("submit"));
		
		//Send Form Information
		firstName.sendKeys("Joaquin");
		lastName.sendKeys("Alvarez");
		email.sendKeys("joaquin.alvarez@email.com");
		genderMale.click();
		mobile.sendKeys("3334445556");
		
			//Select Birth
		birth.click();
		//birth.sendKeys(Keys.ENTER);
			//Create Subjects
		subjects.sendKeys("Math");
		subjects.sendKeys(Keys.ENTER);
		subjects.sendKeys("sci");
		subjects.sendKeys(Keys.ENTER);
		
		hobbiesMusic.click();
		picture.sendKeys(System.getProperty("user.dir") + "//src//test//resources//max-verstappen-red-bull-racing.jpg");
		currentAddres.sendKeys("Calle 00 #00 - 00");
			
//			//Select State
//		driver.switchTo().frame(driver.findElement(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0")));
//        state.click();
//        driver.findElement(By.xpath("//div[@id='state']//div[text()='Haryana']")).click();
//		
//			//Select City
//		Select selectCity = new Select(city);
//		selectCity.selectByIndex(1);
//		
//		driver.switchTo().defaultContent();
		
		//Submit Info
		firstName.sendKeys(Keys.ENTER);
//		submitBtn.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}
	
}
