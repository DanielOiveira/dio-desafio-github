package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarClientes();
	
	Cliente buscarClientePorId(Long id);
	
	void inserirCliente(Cliente cliente);
	
	void atualizarCliente(Long id, Cliente cliente);
	
	void deletarCliente(Long id);

}
