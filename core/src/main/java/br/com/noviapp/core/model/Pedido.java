package br.com.noviapp.core.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1322232L;
	
	private long id;
	private Comanda comanda;
	private List<Produto> produtos;
	private Date dataEHoraPedido;
	private String observacoes;
	
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
	 * @return the comanda
	 */
	@ManyToOne
	@NotNull
	public Comanda getComanda() {
		return comanda;
	}
	/**
	 * @param comanda the comanda to set
	 */
	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}
	/**
	 * @return the produtos
	 */
	@OneToMany
	@NotNull
	public List<Produto> getProdutos() {
		return produtos;
	}
	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	/**
	 * @return the dataEHoraPedido
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	public Date getDataEHoraPedido() {
		return dataEHoraPedido;
	}
	/**
	 * @param dataEHoraPedido the dataEHoraPedido to set
	 */
	public void setDataEHoraPedido(Date dataEHoraPedido) {
		this.dataEHoraPedido = dataEHoraPedido;
	}
	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public String toJson () {
		return Util.toJson(this);
	}
}
