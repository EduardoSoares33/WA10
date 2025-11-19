package wa10;

public abstract class Pessoa {
	private String cpf;
	
	public Pessoa(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public abstract String getTipoUsuario();

}
