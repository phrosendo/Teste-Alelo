package steps;

import org.junit.Test;

import entidades.Diretor;
import entidades.Filme;
import junit.framework.Assert;
import navegador.Navegador;
import page.GooglePage;
import repositorios.RepositorioDiretor;
import repositorios.RepositorioFilme;

public class PesquisaGoogle extends Navegador {
	
	RepositorioDiretor rpDiretor = new RepositorioDiretor();
	RepositorioFilme rpFilme = new RepositorioFilme();
	GooglePage googlePage = new GooglePage();
	
	Diretor diretor = new Diretor("James Marsh", "30/04/1963");
	Filme filme = new Filme("Teoria de tudo", 2014);
	
	boolean[] statusCT = new boolean[2];
	String msgDeErro;
	
	@Test
	public void pesquisaGoogle() throws Exception {
		
		try {
			rpDiretor.cadastrarDiretor(diretor);
			rpFilme.cadastrarFilme(filme);
			
			statusCT[0] = googlePage.realizarBuscaGoogle(diretor.getNome() +" "+filme.getNome());
			statusCT[1] = googlePage.qtdResultadosAprox();
			
		} catch (Exception e) {
			msgDeErro = e.getMessage();
			System.err.println(msgDeErro.toUpperCase());
		}
		
		for (int i = 0; i < statusCT.length; i++) {
			
			Assert.assertEquals(true, statusCT[i]);
		}
		
	}
}

