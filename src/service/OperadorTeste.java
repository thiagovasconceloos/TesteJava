package service;

public class OperadorTeste {

	public OperadorTeste() {
		
	}
	
	public ResponseService criaEntrega(String nomeIndividuoRemetente, String nomeIndividuoDestinatario, String cepIndividuoRemetente, String cepIndividuoDestinatario, String pesoPacote) {
		ResponseService retorno = new ResponseService();
		
		if(nomeIndividuoDestinatario.isEmpty() || nomeIndividuoDestinatario == null) {
			retorno.setErrorMessage("Nome Individuo Destinatário incorreto");
			retorno.setStatus(400);
			
			return retorno;
		}
		else if(nomeIndividuoRemetente.isEmpty() || nomeIndividuoRemetente == null) {
			retorno.setErrorMessage("Nome Individuo Remetente incorreto");
			retorno.setStatus(400);
			
			return retorno;
		}
		else if(cepIndividuoDestinatario.isEmpty() || cepIndividuoDestinatario == null || cepIndividuoDestinatario.length() != 8) {
			retorno.setErrorMessage("CEP Individuo Destinatario incorreto");
                        retorno.setStatus(400);
			
			return retorno;
	         }
                 else if(cepIndividuoRemetente.isEmpty() || cepIndividuoRemetente == null || cepIndividuoRemetente.length() != 8) {
			retorno.setErrorMessage("CEP Individuo Remetente incorreto");
			retorno.setStatus(400);
			
			return retorno;
		}
		else if(pesoPacote.isEmpty() || pesoPacote == null || Double.parseDouble(pesoPacote) < 0.1d) {
			retorno.setErrorMessage("Peso Pacote incorreto");
			retorno.setStatus(400);
			
			return retorno;
		}
		else {
			retorno.setStatus(200);
			CriacaoModel criacao = new CriacaoModel(nomeIndividuoRemetente, nomeIndividuoDestinatario, cepIndividuoRemetente, cepIndividuoDestinatario, Double.parseDouble(pesoPacote));
			
			retorno.setResponseString(criacao.toStr());
			
			return retorno;
		}
	}
}
