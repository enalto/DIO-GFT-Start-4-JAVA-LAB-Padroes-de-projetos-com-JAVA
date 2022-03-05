package subsistema2.cep;

public class CepApi {

	private static CepApi uniqueInstance = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getUniqueInstance() {
		return uniqueInstance;
	}

	public String recuperarCidade(String cep) {
		return "Mafra";
	}

	public String recuperarEstado(String cep) {
		return "SC";
	}

}
