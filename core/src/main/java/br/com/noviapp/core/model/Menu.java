package br.com.noviapp.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Cada restaurante pode ter N menus.
 * Todos os men�s ser�o mostrados para o cliente no APP
 * 
 * @author andre_mbm@hotmail.com
 *
 */
@Entity
public class Menu implements Serializable {

	private static final long serialVersionUID = 1322332L;
	
	private long id;
	private String nome;
	private Restaurante restaurante;
	private List<Produto> produtos;
	private Date dataCadastro;
	private short posicao;
	
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
	 * @return the restaurante
	 */
	@NotNull
	@OneToOne
	public Restaurante getRestaurante() {
		return restaurante;
	}
	/**
	 * @param restaurante the restaurante to set
	 */
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	/**
	 * @return the produtos
	 */
	@NotNull
	@OneToMany(mappedBy="menu")
	public List<Produto> getProdutos() {
		if (this.produtos == null) {
			this.produtos = new ArrayList<Produto>();
		}
		return produtos;
	}
	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
	
	/**
	 * @return the posicao
	 */
	@NotNull
	public short getPosicao() {
		return posicao;
	}
	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(short posicao) {
		this.posicao = posicao;
	}
	public String toJson () {
		return Util.toJson(this);
	}
	

}
