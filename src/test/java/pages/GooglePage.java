package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Page;

public class GooglePage extends Page {

	public WebElement retrieveSearchInput() throws Exception  {
		try {
			return driver.findElement(By.name("q"));
		} catch (Exception e) {
			throw new Exception("Não foi possível acessar o elemento do input de pesquisa do Google!");
		}
	}
	
	public WebElement retrieveButtonSearch() throws Exception {
		try {
			return driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@value='Pesquisa Google']"));
		} catch (Exception e) {
			throw new Exception("Não foi possível acessar o elemento do botão de pesquisa do Google!");
		}
	}

	public WebElement retrieveResults() throws Exception {
		try {
			return driver.findElement(By.id("result-stats"));
		} catch (Exception e) {
			throw new Exception("Não foi possível acessar o elemento dos resultados aproximados!");
		}
	}
}
