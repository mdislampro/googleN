package google;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class mainPage {

	public WebDriver driver;

	@Test
	public void a() throws InterruptedException {

		driver= new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		Actions action=new Actions(driver);


		WebElement app=driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		WebElement frm=driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frm);

		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		app=driver.findElement(By.xpath("//a[@class='gb_A gb_Fc']"));
		app.click();
		frm=driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frm);
		WebElement nws=driver.findElement(By.xpath("//span[text()='News']"));

		nws.click();
		
		

		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).sendKeys("Bangladesh");
		/*driver.switchTo().defaultContent();
		Thread.sleep(3000);

		 app=driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
			//app.click();
			frm=driver.findElement(By.xpath("//iframe[@name='app']"));
			driver.switchTo().frame(frm);
			driver.findElement(By.xpath("//span[text()='Shopping']")).click();
		 */


		Set<String>listOfWind=driver.getWindowHandles();
		Iterator<String> it = listOfWind.iterator();
		String mainWin=it.next();
		String nwsWin=it.next();
		//String gmal=it.next();
		
		
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		driver.switchTo().window(mainWin);
		WebElement src=driver.findElement(By.name("q"));
		src.sendKeys("New York");
		src.sendKeys(Keys.ENTER);
		driver.switchTo().window(nwsWin);
		WebElement nsrc=driver.findElement(By.xpath("//input[@aria-label='Search for topics, locations & sources']"));
		nsrc.sendKeys("Donald J trump");
		nsrc.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		app=driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		frm=driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frm);
			WebElement mail=driver.findElement(By.xpath("//span[text()='Gmail']"));
			action.click(mail).build().perform();
			


		//String child=it.next();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().window(mainWin);
		Thread.sleep(3000);

		driver.switchTo().defaultContent();


		app=driver.findElement(By.xpath("//div[@class='gb_I gb_bd gb_Z']"));
		app.click();
		frm=driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frm);
		WebElement utb =driver.findElement(By.xpath("//span[text()='YouTube']"));
		utb.click();
		
		String ytub=it.next();
		
		
		
		
		//driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().window(mainWin);
		Thread.sleep(3000);

		driver.switchTo().defaultContent();


		WebElement app1=driver.findElement(By.xpath("//a[@class='gb_A gb_Fc']"));
		action.click(app1).build().perform();
		Thread.sleep(3000);

	 frm=driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frm);
		Thread.sleep(3000);
		WebElement shp =driver.findElement(By.xpath("//span[@class='MrEfLc']"));
		action.click(shp).build().perform();
			
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().window(ytub);
		WebElement ysrc=driver.findElement(By.xpath("//input[@role='combobox']"));
		ysrc.sendKeys("Our Universe");
		ysrc.sendKeys(Keys.ENTER);
	}	
	@Test
	public void cls() {

		driver.quit();
	}

}
