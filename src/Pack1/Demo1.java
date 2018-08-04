public class Demo1
{
	public static void main (String[] args) throws InterruptedException
	{
	System.setProperty("webdrive.gecko.driver", "./softwares/geckodriver.exe");
	
	//Step 1
	WebDriver driver=new FirefoxDriver();
	
	//Step 2
	driver.get("https://www.bluestone.com/");
	
	//Step 3
	driver.findElement(By.id("open-label")).click();
	
	//Step 4
	driver.findElement(By.id("name")).sendKeys("Santosh223");
	
	//Step 5
	driver.findElement(By.id("email")).sendKeys("santosh1234@gmail.com");
	
	//Step 6
	driver.findElement(By.id("container_4_4")).sendKeys("7412689630");
	
	//Step 7
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//Step 8
	//driver.findElement(By.id());
	
	}
}