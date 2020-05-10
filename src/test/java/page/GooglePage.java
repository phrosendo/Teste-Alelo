package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import navegador.Navegador;

public class GooglePage extends Navegador {

	

	public boolean realizarBuscaGoogle(String pesquisa) throws Exception {
		
		boolean statusCT = false;
		
		try {
			
			WebElement inputDePesquisa = driver.findElement(By.name("q"));
			WebElement botaoPesquisaGoogle = driver.findElement(By.name("btnK"));
			System.out.println("[Passo 2]: Informar o Diretor e Filme e clicar no botão Pesquisa Google.");
			inputDePesquisa.sendKeys(pesquisa);
			botaoPesquisaGoogle.click();
			statusCT = true;
			
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro ao tentar pesquisar o Diretor e o Filme !");
		}
		
		return statusCT;
	}

	public boolean qtdResultadosAprox() throws Exception {
		
		boolean statusCT = false;
		String resultado;
		
		try {
			
			System.out.println("[Passo 3]: Recuperar mensagem de resultados aproximados, para a busca realizada.");
			WebElement resultadoAprox = driver.findElement(By.id("result-stats"));
			resultado =  resultadoAprox.getText();
			System.out.println(resultado);
			statusCT = true;
			
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro ao tentar encontrar o elemento: result-stats ! ");
		}
		return statusCT;
	}

}
