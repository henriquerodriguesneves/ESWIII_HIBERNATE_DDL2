package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario{
	
	@Column(name = "hr_entrada")
	private LocalDate hr_ent;
	
	@Column(name = "hr_saida")
	private LocalDate hr_sai;
	
	@Column(name = "email_atendente", length = 150)
	private String email;
	
	public LocalDate getHr_ent() {
		return hr_ent;
	}
	public void setHr_ent(LocalDate hr_ent) {
		this.hr_ent = hr_ent;
	}
	public LocalDate getHr_sai() {
		return hr_sai;
	}
	public void setHr_sai(LocalDate hr_sai) {
		this.hr_sai = hr_sai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Atendente [hr_ent=" + hr_ent + ", hr_sai=" + hr_sai + ", email=" + email + "]";
	}
	
	

}
