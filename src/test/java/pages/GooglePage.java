package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Page;

public class GooglePage extends Page {

	public WebElement retrieveSearchInput() {
		return driver.findElement(By.name("q"));
	}
	
	public WebElement retrieveButtonSearch() {
		return driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@value='Pesquisa Google']"));
	}

	public WebElement retrieveResults() {
		return driver.findElement(By.id("result-stats"));
	}

}
