package br.com.noviapp.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Dados do cartao de credito
 * @author andre_mbm@hotmail.com
 *
 */
@Entity
public class CartaoDeCredito implements Serializable {

	private static final long serialVersionUID = 13232L;

	private long id;
	private String nome;
	private String numero;
	private String cvv;
	private String mesExpedicao;
	private String anoExpedicao;
	private String mesValidade;
	private String anoValidade;
	private String bandeira;
	private Cliente cliente;
	private Date dataCadastro;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
	 * @return the numero
	 */
	@NotNull
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the cvv
	 */
	@NotNull
	public String getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the mesExpedicao
	 */
	@NotNull
	public String getMesExpedicao() {
		return mesExpedicao;
	}
	/**
	 * @param mesExpedicao the mesExpedicao to set
	 */
	public void setMesExpedicao(String mesExpedicao) {
		this.mesExpedicao = mesExpedicao;
	}
	/**
	 * @return the anoExpedicao
	 */
	@NotNull
	public String getAnoExpedicao() {
		return anoExpedicao;
	}
	/**
	 * @param anoExpedicao the anoExpedicao to set
	 */
	public void setAnoExpedicao(String anoExpedicao) {
		this.anoExpedicao = anoExpedicao;
	}
	/**
	 * @return the mesValidade
	 */
	@NotNull
	public String getMesValidade() {
		return mesValidade;
	}
	/**
	 * @param mesValidade the mesValidade to set
	 */
	public void setMesValidade(String mesValidade) {
		this.mesValidade = mesValidade;
	}
	/**
	 * @return the anoValidade
	 */
	@NotNull
	public String getAnoValidade() {
		return anoValidade;
	}
	/**
	 * @param anoValidade the anoValidade to set
	 */
	public void setAnoValidade(String anoValidade) {
		this.anoValidade = anoValidade;
	}
	/**
	 * @return the bandeira
	 */
	@NotNull
	public String getBandeira() {
		return bandeira;
	}
	/**
	 * @param bandeira the bandeira to set
	 */
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	/**
	 * @return the cliente
	 */
	@OneToOne
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
