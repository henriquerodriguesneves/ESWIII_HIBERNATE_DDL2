package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	@Id
	@Column(name = "id_funcionario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int idFuncionario;
	
	@Column(name = "nome_funcionario", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "dt_nascimento")
	@NotNull
	private LocalDate dtNasc;
	
	@Column(name = "salario")
	private double salario;
	
	@Column(name = "telefone", length = 11)	
	private String telefone;
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", dtNasc=" + dtNasc + ", salario="
				+ salario + ", telefone=" + telefone + "]";
	}
	
	

}
