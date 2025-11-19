package wa10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
	
	private String senhaHash;
	private String tipoUsuario;
	
	public Usuario(String cpf, String senhaHash, String tipoUsuario) {
		super(cpf);
		this.senhaHash = senhaHash;
		this.tipoUsuario = tipoUsuario;
	}
	
	@Override
	public String getTipoUsuario() {
		return this.tipoUsuario;
	}
	
	public boolean realizarLogin(String cpf, String senha) {
		return this.getCpf().equals(cpf) && this.senhaHash.equals(hashSenha(senha));
	}
	
	public void enviarDocumento() {
		System.out.println("Documento enviado.");
	}
	
	public File baixarDocumento() {
		System.out.println("Baixando Documento...");
		return new File("documento.pdf");
	}
	
	public void editarEnvio() {
		System.out.println("Edição de envio realizada.");
	}
	
	public void removerEnvio() {
		System.out.println("Envio removido.");
	}
	
	public List<Documento> visualizarDocumentosEnviados(){
		System.out.println("Listando documentos enviados.");
		return new ArrayList<>();
	}
	
	private String hashSenha(String senha) {
		return String.valueOf(senha.hashCode());
	}
}
