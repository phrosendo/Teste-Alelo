package entidades;

public class Filme {

	private String nome;
	private int anoLancamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public Filme(String nome, int anoLancamento){
		
		setNome(nome);
		setAnoLancamento(anoLancamento);
	}
}
