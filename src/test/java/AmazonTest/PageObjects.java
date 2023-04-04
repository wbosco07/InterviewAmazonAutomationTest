package AmazonTest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class PageObjects{
	public PageObjects() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(@id, 'twotabsearchtextbox')]")
	public WebElement searchInput;
	@FindBy(xpath = "//*[contains(@id, 'nav-search-submit-button')]")
	public WebElement searchButton;
	@FindBy(xpath = "//*[contains(@class, 'a-size-base-plus a-color-base a-text-normal')]")
	public List<WebElement> suggestedProducts;
	@FindBy (xpath = "//*[contains(@class,'a-size-large product-title-word-break')]")
	public WebElement lastProductTitle;
	@FindBy(id = "a-autoid-0" )
	public WebElement dropDownSort;
	@FindBy (xpath = "//*[contains(@class,'a-dropdown-item')]")
	public List<WebElement> dropDownSorts;
	@FindBy (id = "a-autoid-0-announce")
	public WebElement quantityDropDown;
	@FindBy (id = "atc-declarative")
	public WebElement addToCartButton;
	@FindBy (id = "nav-cart")
	public WebElement cartButton;
	@FindBy (xpath = "//*[contains(@class,'a-size-small sc-action-delete')]//input")
	public WebElement emptyCartButton;
	@FindBy (xpath = "//*[contains(text(),'removed from')]")
	public WebElement removedMessage;
	
	
	
}
