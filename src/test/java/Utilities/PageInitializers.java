package Utilities;


import AmazonTest.PageObjects;

public class PageInitializers{
	public static PageObjects po;
	
	public static void init() {
		po = new PageObjects();
	}
}
