package Maven1.M1;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Project2Elements {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NITHIN RAJ\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/");
		
		Thread.sleep(2000);
		WebElement Elements = driver.findElement(By.xpath("//div/h5[text()='Elements']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Elements);
        Elements.click();
        Thread.sleep(2000);
        
        
        WebElement Textbox = driver.findElement(By.id("item-0"));
        Textbox.click();
        
        WebElement fullname = driver.findElement(By.id("userName"));
		fullname.sendKeys("Nithin");
		Thread.sleep(1000);
		
		WebElement UserEmail = driver.findElement(By.id("userEmail"));
		UserEmail.sendKeys("nithinrohinirahan@gmail.com");
		Thread.sleep(1000);
		
		WebElement Address = driver.findElement(By.id("currentAddress"));
		Address.sendKeys("Rohini "
				+ "Vadackal P O"
				+ "Alappuzha");
		Thread.sleep(1000);
		
		WebElement PAddress = driver.findElement(By.id("permanentAddress"));
		PAddress.sendKeys("Rohini "
				+ "Vadackal P O"
				+ "Alappuzha");
		Thread.sleep(1000);
		
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Submit);
        Submit.click();
        Thread.sleep(1000);
        
        
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
        checkbox.click();
        
        Thread.sleep(1000);
        WebElement home = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/label/span[3]"));
        home.click();

        Thread.sleep(1000);
        WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
        radiobutton.click();
        
        Thread.sleep(1000);
        WebElement yes = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/label"));
        yes.click();
        
        Thread.sleep(1000);
        WebElement webtables = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[4]/span"));
        webtables.click();
        
        Thread.sleep(1000);
        WebElement add = driver.findElement(By.id("addNewRecordButton"));
        add.click();
        
        WebElement Firstname = driver.findElement(By.id("firstName"));
        Firstname.sendKeys("Nithin");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("Raj");
		Thread.sleep(1000);
		
		WebElement useemail = driver.findElement(By.id("userEmail"));
        useemail.sendKeys("nithinrohinirajan@gmail.com");
		Thread.sleep(1000);
		
		WebElement userage = driver.findElement(By.id("age"));
        userage.sendKeys("35");
		Thread.sleep(1000);
		
		WebElement salary = driver.findElement(By.id("salary"));
        salary.sendKeys("35000");
		Thread.sleep(1000);
		
		WebElement departmen = driver.findElement(By.id("department"));
        departmen.sendKeys("Operations");
		Thread.sleep(1000);
		
		WebElement buttons = driver.findElement(By.id("submit"));
        buttons.click();
    	Thread.sleep(1000);
		
	
        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[5]/span"));
        button.click();
    	Thread.sleep(1000);
    	
    	
    	WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
    	Actions actions = new Actions(driver);
    	actions.doubleClick(doubleClickBtn).perform();
        Thread.sleep(1000);
        
        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
        Actions act = new Actions(driver);
        act.contextClick(rightclick).perform();
        Thread.sleep(1000);
        
        
        //driver.findElement(By.cssSelector("Click Me")).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement hello = wait.until(
        //ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        
        
        WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",clickme);
    	clickme.click();
        Thread.sleep(2000);
        
        WebElement links = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[6]/span"));
        links.click();
    	Thread.sleep(2000);
    	
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",links);
		WebElement simple = driver.findElement(By.xpath("//a[@id='simpleLink']"));
		String mainWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		simple.click();
		Thread.sleep(2000);
		for (String windowHandle : driver.getWindowHandles())
		{
			if (!windowHandle.equals(mainWindow)) {
				Thread.sleep(2000);
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		driver.close();
		Thread.sleep(2000);
		 driver.switchTo().window(mainWindow);
		 Thread.sleep(2000);
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",links);
        WebElement dyna = driver.findElement(By.xpath("//a[@id='dynamicLink']"));
        String mainWindoww = driver.getWindowHandle();
        Thread.sleep(2000);
        dyna.click();
        Thread.sleep(2000);
		for (String windowHandle : driver.getWindowHandles())
		{
			if (!windowHandle.equals(mainWindoww)) {
				Thread.sleep(2000);
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(mainWindow);
		Thread.sleep(1000);
		  WebElement created = driver.findElement(By.id("created"));
		  created.click();
		  Thread.sleep(2000);
		  
		
		  WebElement nocontent = driver.findElement(By.id("no-content"));
		  nocontent.click(); Thread.sleep(2000);
		 
		  WebElement moved = driver.findElement(By.id("moved"));
		  moved.click();
		  Thread.sleep(2000);
		  
		  WebElement badreq = driver.findElement(By.id("bad-request"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",badreq);
		  badreq.click();
		  Thread.sleep(2000);
		  
		  WebElement unauthor = driver.findElement(By.id("unauthorized"));
		  unauthor.click();
		  Thread.sleep(2000);
		  
		  WebElement forbidden = driver.findElement(By.id("forbidden"));
		  forbidden.click();
		  Thread.sleep(2000);
		  
		  WebElement invalid = driver.findElement(By.id("invalid-url"));
		  invalid.click();
		  Thread.sleep(2000);
		  
		  WebElement broken = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[7]/span"));
		  broken.click();
		  Thread.sleep(2000);
		  
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",broken);
		  
		  WebElement valid = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/a[1]"));
		  valid.click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  Thread.sleep(2000);
		  driver.switchTo().window(mainWindow);
		 
		  WebElement invalidlink = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/a[2]"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",invalidlink);
		  invalidlink.click();
		  Thread.sleep(1000);
		  driver.navigate().back();
		  
		  
		  Thread.sleep(2000);
		  WebElement upload = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/div/ul/li[8]/span"));
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",upload);
		  Thread.sleep(2000);
		  upload.click();
		  Thread.sleep(2000);
		  
		  
		  WebElement download = driver.findElement(By.id("downloadButton"));
		  Thread.sleep(2000);
		  download.click();
		  
		  WebElement uploadBtn = driver.findElement(By.id("uploadFile"));
		  uploadBtn.sendKeys("C:\\Users\\NITHIN RAJ\\Desktop\\2x1_SuperMarioHub_image1600w.jpg");
		  Thread.sleep(2000);
		  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",uploadBtn);
		  
		  WebElement properties = driver.findElement(By.id("item-8"));
		  Thread.sleep(2000);
		  properties.click();
		  
		 
		  Thread.sleep(6000);
		  
		  
		  
		  
		  Thread.sleep(6000);
	  
		  
        
        driver.quit();
	}
	

}


