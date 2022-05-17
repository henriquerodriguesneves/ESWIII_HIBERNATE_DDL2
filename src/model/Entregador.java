package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario{
	
	@Id
	@Column(name = "num_entregador")
	private int numEntregador;
	
	@Column(name = "cnh", length = 2)
	private String cnh;
	
	public int getNumEntregador() {
		return numEntregador;
	}
	public void setNumEntregador(int numEntregador) {
		this.numEntregador = numEntregador;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	@Override
	public String toString() {
		return "Entregador [numEntregador=" + numEntregador + ", cnh=" + cnh + "]";
	}
	
}
