package Utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Methods {

	public void sendText(WebElement element, String text) {
	        element.sendKeys(text);
	    }
	public void assertsAndClickLastProduct(List<WebElement> suggestedProducts, String text) {
		// Initialize soft assertions
        SoftAssert softAssert = new SoftAssert();
        // Loop through the suggested products and validate that they contain "Gel pen" (ignoring case)
        WebElement lastProduct = null;

        // Loop through the suggested products and validate that they contain "Gel pen" (ignoring case)
        for (WebElement product : suggestedProducts) {
            String productName = product.getText().toLowerCase();
            softAssert.assertTrue(productName.contains(text), "Product does not contain 'Gel pen': " + productName);
            lastProduct = product; // Update last product element
        }
        // Assert all soft assertions
        softAssert.assertAll();
     // Click on the last suggested product
        if (lastProduct != null) {
            lastProduct.click();
        }
	}
	public void asserts(WebElement element, String text) {
		Assert.assertTrue(element.getText().toLowerCase().trim().contains(text.toLowerCase().trim()));
	}
	
	public void navigateBack() {
		Driver.getDriver().navigate().back();
	}
	
	public void wait(int time) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void select(List<WebElement> elements, WebElement element, String text) {
		element.click();
		wait(2);
		for(WebElement el : elements) {
			if(el.getText().trim().contains(text)) {
				el.click();
				break;
			}
		}
		
	}
	public void clickLowestPriceItem(List<WebElement> elements, int index) {
		wait(2);
		elements.get(index).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
