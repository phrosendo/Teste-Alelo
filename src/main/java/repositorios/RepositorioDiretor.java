package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Diretor;

public class RepositorioDiretor implements IDiretor {

	List<Diretor> listaDiretor = new ArrayList<Diretor>();
	
	public void cadastrarDiretor(Diretor diretor) throws Exception {
		try {
			listaDiretor.add(diretor);
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro ao tentar cadastrar um Diretor !");
		}
	}

}
