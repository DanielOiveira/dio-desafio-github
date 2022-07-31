package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.repository.ClienteRepository;
import one.digitalinnovation.gof.repository.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository repository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Autowired
	ViaCepService viaCepService;

	@Override
	public Iterable<Cliente> buscarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente buscarClientePorId(Long id) {
		Optional<Cliente> cliente= repository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserirCliente(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizarCliente(Long id, Cliente cliente) {
		Optional<Cliente> clienteBancoDados = repository.findById(id);
		
		if(clienteBancoDados.isPresent()) {
			salvarClienteComCep(cliente);
		}
		
	}

	@Override
	public void deletarCliente(Long id) {
		repository.deleteById(id);
		
	}
	
	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		repository.save(cliente);
	}

}
