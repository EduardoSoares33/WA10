package wa10;

import java.time.LocalDate;

public class Documento extends BaseEntity{
	
	private String nomeArquivo;
	private String caminhoArquivo;
	private LocalDate dataEnvio;
	private Usuario proprietario;
	private TipoDocumento tipoDocumento;
	
	public Documento(Long id, String nomeArquivo, String caminhoArquivo, LocalDate dataEnvio, Usuario proprietario, TipoDocumento tipoDocumento) {
		super(id);
		this.nomeArquivo = nomeArquivo;
		this.caminhoArquivo = caminhoArquivo;
		this.dataEnvio = dataEnvio;
		this.proprietario = proprietario;
		this.tipoDocumento = tipoDocumento;
	}
	
	public Long getIdDocumento() {
		return super.getId();
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getCaminhoArquivo() {
		return caminhoArquivo;
	}

	public void setCaminhoArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Usuario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Usuario proprietario) {
		this.proprietario = proprietario;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}
