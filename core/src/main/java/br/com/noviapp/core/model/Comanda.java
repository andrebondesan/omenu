package br.com.noviapp.core.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comanda implements Serializable {

	private static final long serialVersionUID = 1398776232L;
	
	private long id;
	private Restaurante restaurante;
	private Cliente cliente;
	private Date dataAbertura;
	private Date dataFechamento;
	private String numeroMesa;
	private List<Pedido> pedidos;
	private BigDecimal total;
	private boolean estaPaga;
	private Usuario responsavelAbertura;
	
	
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
	 * @return the restaurante
	 */
	@ManyToOne
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
	 * @return the cliente
	 */
	@ManyToOne
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
	 * @return the numeroMesa
	 */
	public String getNumeroMesa() {
		return numeroMesa;
	}
	/**
	 * @param numeroMesa the numeroMesa to set
	 */
	public void setNumeroMesa(String numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	/**
	 * @return the dataAbertura
	 */
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataAbertura() {
		return dataAbertura;
	}
	/**
	 * @param dataAbertura the dataAbertura to set
	 */
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	/**
	 * @return the dataFechamento
	 */
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataFechamento() {
		return dataFechamento;
	}
	/**
	 * @param dataFechamento the dataFechamento to set
	 */
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	/**
	 * @return the pedidos
	 */
	@OneToMany(mappedBy="comanda")
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	/**
	 * @param produtos the produtos to set
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	/**
	 * @return the estaPaga
	 */
	public boolean isEstaPaga() {
		return estaPaga;
	}
	/**
	 * @param estaPaga the estaPaga to set
	 */
	public void setEstaPaga(boolean estaPaga) {
		this.estaPaga = estaPaga;
	}
	/**
	 * @return the responsavelAbertura
	 */
	@OneToOne
	public Usuario getResponsavelAbertura() {
		return responsavelAbertura;
	}
	/**
	 * @param responsavelAbertura the responsavelAbertura to set
	 */
	public void setResponsavelAbertura(Usuario responsavelAbertura) {
		this.responsavelAbertura = responsavelAbertura;
	}
	
	public String toJson () {
		return Util.toJson(this);
	}
	
}
