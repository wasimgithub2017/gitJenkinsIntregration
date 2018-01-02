package testingCT;
/*
Author Wasim
*/	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.Test;


	public class TestingDevOpsCT 
	{
	
		@Test
		//public static void main(String args[])
		public void JenkinksTest()
			{
			
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "O:\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.ie.driver", "O:\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			System.out.println("Hi,Welcome to my 1st CT program");
			System.out.println("Intergration GIT -Jenkins");
			driver.navigate().to("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("1234");
			driver.findElement(By.name("loginbutton")).click();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.quit();
			
			}
		}
	
