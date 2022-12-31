package steps;

import org.junit.Test;

import browser.Page;
import functionalities.GoogleFunctionality;
import junit.framework.Assert;
import utils.Constants;

public class GoogleStep extends Page {

	GoogleFunctionality googleFunctionality = new GoogleFunctionality();
	boolean statusCT;

	@Test
	public void pesquisaGoogle() throws Exception {

		try {
			googleFunctionality.googleSearch(Constants.NOME_DO_DIRETOR + " " + Constants.NOME_DO_FILME);
			System.out.println(googleFunctionality.approximateResults());
			statusCT = true;
		} catch (Exception e) {
			statusCT = false;
			System.err.println("ERRO: " + e.getMessage());
		}

		Assert.assertEquals(true, statusCT);
	}
}
