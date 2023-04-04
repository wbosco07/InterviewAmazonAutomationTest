package PageObject;


import org.testng.annotations.Test;

import AmazonTest.PageObjects;
import Utilities.Methods;


public class Test01 extends Methods {

	PageObjects init = new PageObjects();
	@Test
	public void testingSteps() {
		sendText(init.searchInput, "Gel pen");
		init.searchButton.click();
		assertsAndClickLastProduct(init.suggestedProducts, "gel"); 
		wait(3);
		asserts(init.lastProductTitle, "pen");
		wait(3);
		init.searchButton.click();
		select(init.dropDownSorts, init.dropDownSort, "Price: Low to High");
		clickLowestPriceItem(init.suggestedProducts, 0);
		select(init.dropDownSorts, init.quantityDropDown, "2");
		wait(5);
		init.addToCartButton.click();
		init.cartButton.click();
		wait(4);
		init.emptyCartButton.click();
		wait(3);
		asserts(init.removedMessage, "was removed from Shopping Cart.");
	}		
}
