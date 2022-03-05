package one.digitalinnovation.gof.facade;

import subsistema2.cep.CepApi;
import subssistema1.crm.CrmService;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getUniqueInstance().recuperarCidade(cep);
		String estado = CepApi.getUniqueInstance().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
		
	}

}
