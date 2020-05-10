package repositorios;

import java.util.ArrayList;
import java.util.List;

import entidades.Diretor;

public class RepositorioDiretor implements IDiretor {

	List<Diretor> listaDiretor = new ArrayList<Diretor>();
	
	public boolean cadastrarDiretor(Diretor diretor) {
		try {
			listaDiretor.add(diretor);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
