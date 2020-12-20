package service;

public class CriacaoModel {
	private String nomeRemetente;
	private String nomeDestinatario;
	private String cepRemetente;
	private String cepDestinatario;
	private Double pesoPacote;
	
	public CriacaoModel(String nomeRemetente, String nomeDestinatario, String cepRemetente, String cepDestinatario,
			Double pesoPacote) {
		this.nomeRemetente = nomeRemetente;
		this.nomeDestinatario = nomeDestinatario;
		this.cepRemetente = cepRemetente;
		this.cepDestinatario = cepDestinatario;
		this.pesoPacote = pesoPacote;
	}

	public String toStr() {
		String text = "Objeto criado: \nRemetente: " + nomeRemetente + " | CEP: " + cepRemetente + 
				"\nDestinatario: " + nomeDestinatario + " | CEP: " + cepDestinatario + 
				"\nPacote: " + pesoPacote + " g";
		
		return text;
	}
	
	public String getNomeRemetente() {
		return nomeRemetente;
	}
	public void setNomeRemetente(String nomeRemetente) {
		this.nomeRemetente = nomeRemetente;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	public String getCepRemetente() {
		return cepRemetente;
	}
	public void setCepRemetente(String cepRemetente) {
		this.cepRemetente = cepRemetente;
	}
	public String getCepDestinatario() {
		return cepDestinatario;
	}
	public void setCepDestinatario(String cepDestinatario) {
		this.cepDestinatario = cepDestinatario;
	}
	public Double getPesoPacote() {
		return pesoPacote;
	}
	public void setPesoPacote(Double pesoPacote) {
		this.pesoPacote = pesoPacote;
	}
}
