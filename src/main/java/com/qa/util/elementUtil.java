package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;
import com.mchange.io.FileUtils;

public abstract class elementUtil {

	private WebDriver driver;
	private static WebDriver wdScreenshot;
	private WebDriverWait wait ;
    
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public elementUtil(WebDriver driver) {
		this.driver = driver;
		wdScreenshot = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	}
	
    public elementUtil(Browser browser) {
    	
		if(browser == Browser.CHROME) {
			
			driver = new ChromeDriver();
		}
		else if(browser == Browser.EDGE){
			driver.manage().window().maximize();
			driver= new EdgeDriver();
		}
		else if(browser == Browser.FF){
			driver.manage().window().maximize();
			driver= new EdgeDriver();
		}
		wdScreenshot = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	}

    public void  goToWebSite(String string) {
    	driver.manage().window().maximize();
       	driver.get(string);
    }
    
    public void clearText(By locator) {
    	driver.findElement(locator).clear();
    }
    
	public void clickOn(By locator) {
		WebElement element =	 wait.until(ExpectedConditions.elementToBeClickable(locator));
    	element.click();
    }
    
     public void enterTextInto(By locator,String textToEnter) {
   	  //  WebElement element = driver.findElement(locator);
          WebElement element =	 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    	 WebElement element = driver.findElement(locator);
   	     element.clear();
    	 element.sendKeys(textToEnter);
     }
     
     public void VerifyIcons(By locator) {
    	 WebElement element =	 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	 element.isDisplayed();
 	}
    
     public void enterKeyInto(By locator,Keys key) {
    	 WebElement element = driver.findElement(locator);
    	 element.sendKeys(key);
     }
     
    public void  selectFromDropDown(By Dropdownlocator ,String value){
    	clickOn(Dropdownlocator);
		By locator = By.xpath("//span[contains(text(), ' "+Dropdownlocator+"\')]/..");
		clickOn(locator);
     }
     
     public void PauseFor(long time) throws InterruptedException {
    	 Thread.sleep(time);
     }
	
     public void clickUsingjavascript(By locator) {
    	 JavascriptExecutor jse =  (JavascriptExecutor)driver;
    	 jse.executeScript("arguments[0].click", locator);
     }
     
     public String verifyTagname(By locator) {
  
 		 WebElement tagname = driver.findElement(locator);
 		return tagname.getTagName();
	}
      
     public void selectElementFromDropDown(By locators,String visibleText) {
    	 WebElement dropdown =  driver.findElement(locators);
    	 Select select =new Select(dropdown);
    	 select.selectByVisibleText(visibleText);	
	}
     
     
     
    public boolean verifyelementDisplayed(By locator) {
   	 return driver.findElement(locator).isDisplayed();
   	   }
	
    public String getVisibleText(By locator) {
    	 WebElement element =	 wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	 
         String elements =  element.getText();
        System.out.println(elements);
         return elements;
    }
    
    public int Count(By locator) {
		return driver.findElements(locator).size();
	   }
    
    public List<WebElement> findElements(By locator) {
    	return driver.findElements(locator);
     }
    
    public void findElement(By locator) {
    	 driver.findElements(locator);
     }
    
//    public ArrayList<GlobalDetailsPojo> getTableData(By tableLocator,By cell) {
//    	List<WebElement>rowlist = findElements(tableLocator);
//    	List<WebElement> cellList;
//    	GlobalDetailsPojo globalDetailsPojo;
//		ArrayList<GlobalDetailsPojo> dataList = new ArrayList<>();
//    	for(WebElement row : rowlist) {
//			cellList = row.findElements(cell);
//		    globalDetailsPojo = new GlobalDetailsPojo(cellList.get(0).getText(), cellList.get(1).getText(), cellList.get(2).getText(), cellList.get(3).getText(), cellList.get(4).getText(), cellList.get(5).getText(), cellList.get(6).getText());
//		    dataList.add(globalDetailsPojo);
//		}
//    	return dataList;
//    }
    
    public List< String> getALLVisibleText(By locator) {
    	List<WebElement> elementList = driver.findElements(locator);
    	List<String> dataList = new ArrayList<>();
		for(WebElement e : elementList) {
			dataList.add(e.getText());
		}
		System.out.println(dataList);
		return dataList;
    }
    
    public static void takeScreenShot(String fileName) {
    	TakesScreenshot screenshot = (TakesScreenshot)wdScreenshot;
    	File f = screenshot.getScreenshotAs(OutputType.FILE);
    	File scrFile = new File(System.getProperty("user.dir")+"//screenshots//"+fileName+".png");
    	try {
			org.apache.commons.io.FileUtils.copyFile(f, scrFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void clickElementWhenVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait for up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();
    }
    
    public String getCurrentUrl() {
    	return driver.getCurrentUrl();
    }
    
    public void tearDown() {
    	driver.close();;
    }
}
