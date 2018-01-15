package br.com.noviapp.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends Usuario implements Serializable {

	private static final long serialVersionUID = 13223232L;
	
	private String telefone;
	private String nome;
	private List<CartaoDeCredito> cartoes;
	private List<Comanda> comandas;
	private Date dataCadastro;
	
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the nome
	 */
	@NotNull
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cartoes
	 */
	@OneToMany(mappedBy="cliente")
	public List<CartaoDeCredito> getCartoes() {
		return cartoes;
	}
	/**
	 * @param cartoes the cartoes to set
	 */
	public void setCartoes(List<CartaoDeCredito> cartoes) {
		this.cartoes = cartoes;
	}
	/**
	 * @return the comandas
	 */
	@OneToMany(mappedBy="cliente")
	public List<Comanda> getComandas() {
		return comandas;
	}
	/**
	 * @param comandas the comandas to set
	 */
	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}
	/**
	 * @return the dataCadastro
	 */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataCadastro() {
		return dataCadastro;
	}
	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String toJson () {
		return Util.toJson(this);
	}
	
}
