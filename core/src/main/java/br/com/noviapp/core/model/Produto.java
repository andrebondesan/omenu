package br.com.noviapp.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 132375432L;
	
	private long id;
	private String nome;
	private Date dataCadastro;
	private ValorProduto valor;
	private Menu menu;
	
	public Produto(){
		//nothing
	}
	
	public Produto(String nome, ValorProduto valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
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
	 * @return the valor
	 */
	@OneToOne
	@NotNull
	public ValorProduto getValor() {
		if (this.valor == null) {
			this.valor = new ValorProduto();
		}
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(ValorProduto valor) {
		this.valor = valor;
	}
	
	public BigDecimal obterValorFinal () {
		return this.getValor().getValor();
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

	/**
	 * @return the menu
	 */
	@ManyToOne
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public String toJson () {
		return Util.toJson(this);
	}
}
