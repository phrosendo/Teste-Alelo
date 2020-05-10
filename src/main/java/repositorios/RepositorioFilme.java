package repositorios;

import java.util.ArrayList;
import java.util.List;
import entidades.Filme;

public class RepositorioFilme implements IFilme {

	List<Filme> listaDeFilmes = new ArrayList<Filme>();

	public void cadastrarFilme(Filme filme) throws Exception {
		try {
			listaDeFilmes.add(filme);
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro ao tentar cadastrar um Filme !");
		}
	}
}
