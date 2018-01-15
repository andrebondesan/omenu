package br.com.noviapp.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class ValorProduto implements Serializable {

	private static final long serialVersionUID = 132329875555L;
	
	private long id;
	private Produto produto;
	private BigDecimal valor;
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
	 * @return the produto
	 */
	@OneToOne
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * @return the valor
	 */
	@NotNull
	public BigDecimal getValor() {
		if (this.valor == null) {
			this.valor = new BigDecimal("0");
		}
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	/**
	 * @return the dataCadastro
	 */
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
	
	@Override
	public String toString() {
		return this.getValor().toString();
	}
	
	public String toJson () {
		return Util.toJson(this);
	}

}
