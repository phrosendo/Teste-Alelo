package functionalities;

import pages.GooglePage;

public class GoogleFunctionality {

	GooglePage googlePage = new GooglePage();

	public void googleSearch(String search) throws Exception{
		googlePage.retrieveSearchInput().sendKeys(search);
		googlePage.retrieveButtonSearch().click();
	}

	public String approximateResults() throws Exception {
		return googlePage.retrieveResults().getText();
	}
}
