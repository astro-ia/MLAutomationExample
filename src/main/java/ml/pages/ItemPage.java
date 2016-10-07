package ml.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage {

	protected static final int EXPLICIT_WAIT_TIME = 15000;

	
	@FindBy(xpath = ".//*[@id='productInfo']/fieldset[1]/article/strong")
    private WebElement price;
	
	 
	
	public WebElement waitElement(WebElement element, WebDriver myDriver) {
	        
	    	return new WebDriverWait(myDriver, EXPLICIT_WAIT_TIME).until(ExpectedConditions.visibilityOf(element));
	    
	    }
	
	
	public String getPrice(WebDriver myDriver){
			
		   WebElement e = waitElement(this.price,myDriver);
		   String price= e.getText();
		   
		   System.out.println(price);
		
		return price;
	}
	

	
	
}
