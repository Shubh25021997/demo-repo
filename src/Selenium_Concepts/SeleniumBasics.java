package Selenium_Concepts;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
//
//	import org.apache.poi.ss.usermodel.Cell;
//	import org.apache.poi.ss.usermodel.Workbook;
//	import org.apache.poi.ss.usermodel.WorkbookFactory;
//	import org.openqa.selenium.*;
//	import org.openqa.selenium.Point;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebElement;
//	import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.interactions.Actions;
//	import org.openqa.selenium.io.FileHandler;
//	import org.openqa.selenium.support.ui.Select;

	public class SeleniumBasics {
		
		public static void main (String args[]){
		
		}
		public static void method1() throws IOException{
			System.setProperty("webdriver.chrome.driver","path");
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("url");
//			Point p = new Point(1000,1000);
//			driver.manage().window().setPosition(p);
//			driver.manage().window().getSize();
//
//		WebElement element = driver.findElement(By.xpath(""));
//		element.click();
//		element.clear();
//		element.getText();
//		element.isDisplayed();
//		
//		//selecting a record
//		Select select = new Select(element);		//dont use driver object here. use webElement on which we have to select.
//			select.selectByVisibleText("sys");
//			select.selectByIndex(0);
//			select.selectByValue("sys");
//			select.deselectByVisibleText("sys");
//			List<WebElement> allOptions = select.getAllSelectedOptions();
//			WebElement option = select.getFirstSelectedOption();
//			select.deselectAll();
//			
//		//Screenshot
//			String src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
//			File source = new File(src);
//			File dest = new File("D:\\CFAO Scripts" + File.separator + "dest.jpg");
//			
//			FileHandler.copy(source, dest);
//				
////				public IInteractions takeScreenShot() throws IOException {
////					TakesScreenshot ts = (TakesScreenshot)driver;
////					String source = ts.getScreenshotAs(OutputType.BASE64);
////					ReportProvider.attachScreenshot("data:image/jpg;base64, " + source);
////					return this;
////				} -> this will not work as you are trying to convert string into File.
//
//			
//		//Parameterization
//			FileInputStream file = new FileInputStream("Path");
//			Workbook wb = WorkbookFactory.create(file);
//			Cell cell = wb.getSheet("sheet1").getRow(0).getCell(1);
//			cell.getCellType();
//			
//		//IFrame
//			driver.switchTo().frame(driver.findElement(By.xpath("")));
//			driver.switchTo().parentFrame();
//			driver.switchTo().defaultContent();
//		
//		//pop-up
//			Alert alt = driver.switchTo().alert();
//			alt.getText();
//			alt.accept();
//			//alt.dismiss();
//			
//		//mini-window
//			for (String windowHandle : driver.getWindowHandles()) {
//				driver.switchTo().window(windowHandle).getTitle().equalsIgnoreCase("");
//			}
//			Set<String> windowHandle = driver.getWindowHandles();
//			ArrayList<String> window = new ArrayList<String>(windowHandle);
//			window.get(1);
//			
//		//Action class
//			Actions act = new Actions(driver);
//		  //Mouse Events
//			act.moveToElement(element);
//			act.click(element);
//			act.contextClick(element);
//			act.doubleClick(element).perform();
//			//act.dragAndDrop(element, element2);
//			act.clickAndHold().release().build().perform();		// use build then only use perform();
//		  //KeyBoard events
//			act.sendKeys(Keys.ARROW_UP);					//use .perform() as well
//			act.sendKeys(Keys.ENTER).perform();
//			
//			


		
		
		}
	}



