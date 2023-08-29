package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	private Actions act;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	 	
	}
	
	public  void doSendKeys(By locator, String value)  {
		if(value==null) {
			System.out.println("Value can not be null while using sendkeys method");
		//throw new FrameworkException("VALUECANNOTBENULL");
			
			
		}
		
		getElement(locator).sendKeys(value);

	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	public  String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is ===>"+eleText);
		return eleText;
	}
	public  boolean checkElementIsDisplayed(By locator) {
		return getElement (locator).isDisplayed();}
	
	public  String getElementAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public WebElement getLinkEleByText(String LinkText) {
		return driver.findElement(By.linkText(LinkText));
		
	}

	public  WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		}catch (NoSuchElementException e) {
			System.out.println("getting element exception...plz check your locator again");
			e.printStackTrace();
			try {
				Thread.sleep(2000);
				}catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			element= driver.findElement(locator);
		}
         return element ;
	}

	public  int getElementsCount (By locator) {
		return getElements(locator).size();
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public  List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty());
			eleTextList.add(text);			}
		return eleTextList;
	}
	
	public  void doSearch(By searchLocator, By seacrchSuggLocator, String searchkey, String suggName ) throws InterruptedException {
   	doSendKeys(searchLocator, searchkey);
   	 Thread.sleep(4000);
		List<WebElement> suggList = 
		getElements(seacrchSuggLocator);
		System.out.println(suggList.size());
		for(WebElement e: suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("suggName")) {
				e.click();
				break;
			}
			
		}
	
	}
	

//***********************************DROP DOWN UTILS********************************

public  void doSelectDropDownByIndex(By locator, int index) {
	
	if(index<0) {
		System.out.println("please pass the positive index");
		return;}
	Select select= new Select(getElement(locator));
	select.selectByIndex(index);
	}
 public  void doSelectDropDownByVisibleText(By locator, String visibleText) {
	
	if(visibleText==null) {
		System.out.println("please pass the right visibleText and it can not be null");
		return;}
	Select select= new Select(getElement(locator));
	select.selectByVisibleText(visibleText);}
 
 public  void doSelectDropDownByValue(By locator, String value) {
		
		if(value==null) {
			System.out.println("please pass the right visibleText and it can not be null");
			return;}
		Select select= new Select(getElement(locator));
		select.selectByValue(value);}
 
 public  int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();	}
 
 
 public  List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));
		
		List<WebElement>optionList = select.getOptions();
		List<String> optionTextList = new ArrayList<String>();
		for(WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			optionTextList.add(text);
			}
		return optionTextList;}
		
	
 
public  void doSelectDropDownValue(By locator, String dropDownValue) {
	Select select = new Select(getElement(locator));
	List<WebElement> optionsList = select.getOptions();
	
    for(WebElement e: optionsList) {
    	String text = e.getText();
    	System.out.println(text);
    	if(text.equals(dropDownValue)) {
    		e.click();
    		break;
    	}
    }
}
public  void doSelectDropDownValueUsingLocator(By locator, String dropDownValue) {
	List<WebElement> optionList = getElements(locator);
	
	
    for(WebElement e: optionList) {
    	String text = e.getText();
    	System.out.println(text);
    	if(text.equals(dropDownValue)) {
    		e.click();
    		break;
    	}
    }
}
//*******************************************Action Utils*****************************************//

public  void doActionsClick(By locator) {
	act.click(getElement(locator)).perform();
}
	


public  void doActionsSendKeys(By locator, String value) {
	act.sendKeys(getElement(locator),value).perform();
	

}


public  void selectrightClickoption(By contextmenulocator, String optionValue) {
	Actions act = new Actions(driver);
	act.contextClick(getElement(contextmenulocator)).perform();
	By optionLocator = By.xpath("//*[text()='"+optionValue+"']");//use * because in future if span change and use select or something
	doClick(optionLocator);
}
/**
 * this method will handle the menu up to two level
 * @param level1MenuLocator
 * @param level2MenuLocator
 * @throws InterruptedException
 */
public  void twolevelMenuHandling (By level1MenuLocator, By level2MenuLocator) throws InterruptedException {
	
	act.moveToElement(getElement(level1MenuLocator)).perform();
	Thread.sleep(1500);
	doClick(level2MenuLocator);
}
public  void MultiLevelMenueHandle(By level1Locator,String level2,String level3,String level4 ) throws InterruptedException {
	
	act.moveToElement(getElement(level1Locator)).perform();
	Thread.sleep(1500);
	act.moveToElement(getLinkEleByText(level2)).perform();
	Thread.sleep(1500);
	act.moveToElement(getLinkEleByText(level3)).perform();
	Thread.sleep(1500);
	getLinkEleByText(level4).click();
}
public  void MultiLevelMenueHandle(By level1Locator,String level2,String level3  ) throws InterruptedException {
	
	act.moveToElement(getElement(level1Locator)).perform();
	Thread.sleep(1500);
	act.moveToElement(getLinkEleByText(level2)).perform();
	Thread.sleep(1500);
	getLinkEleByText(level3).click();
	
}
 }
    	
    

