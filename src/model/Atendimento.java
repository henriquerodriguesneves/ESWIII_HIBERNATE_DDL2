package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atendimento")
public class Atendimento {
	
	@Id
	@Column(name = "data_atendimento")
	private LocalDate data;

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Atendimento [data=" + data + "]";
	}
	
	

}
