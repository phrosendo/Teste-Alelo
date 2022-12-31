package functionalities;

import pages.GooglePage;

public class GoogleFunctionality {

	GooglePage googlePage = new GooglePage();
	
	public void googleSearch(String search) throws Exception {
		
		if(googlePage.retrieveSearchInput().isDisplayed()) {
			googlePage.retrieveSearchInput().sendKeys(search);
		}else {
			throw new Exception("O elemento não está disponível para realizar a pesquisa!");
		}
		if(googlePage.retrieveButtonSearch().isDisplayed()) {
			googlePage.retrieveButtonSearch().click();
		}else {
			throw new Exception("O botão de pesquisa não está disponível para o click!");
		}
		
	}

	public String approximateResults() throws Exception {
		
		if(googlePage.retrieveResults().isDisplayed()) {
			return googlePage.retrieveResults().getText();
		}else {
			throw new Exception("Não foi possível recuperar os resultados aproximados!");
		}
	}
}
