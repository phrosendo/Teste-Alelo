package repositorios;

import java.util.ArrayList;
import java.util.List;
import entidades.Filme;

public class RepositorioFilme implements IFilme {

	List<Filme> listaDeFilmes = new ArrayList<Filme>();

	public boolean cadastrarFilme(Filme filme) {
		try {
			listaDeFilmes.add(filme);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
