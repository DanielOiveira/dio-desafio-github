package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Obs: existe a possibilidade de montar a estrutura do modelo de classe através do 'jsonschema2.pojo.org', é um site que utiliza a estrutura do json, 
 * nesse caso do ViaCep para montar a classe completa.
 * 
 * @see <a href="https://www.jsonschema2.pojo.org">Ferramenta: jsonschema2.pojo.org</a>
 * @see <a href="https://www.viapcep.com.br">Ferramenta: ViaCep</a>
 * 
 * @author Daniel Oliveira
 * 
 */

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	
	@ManyToOne
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
