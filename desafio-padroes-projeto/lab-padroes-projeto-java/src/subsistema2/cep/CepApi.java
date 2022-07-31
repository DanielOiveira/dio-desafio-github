package subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Campos do Jordão";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}

}
