package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	
	private List<Parcelamento> parcelamentos = new ArrayList<>();
	
	
	public Contrato(int numero, Date data, Double valorTotal) {
		
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public List<Parcelamento> getParcelamentos() {
		return parcelamentos;
	}


	public void setParcelamentos(List<Parcelamento> parcelamentos) {
		this.parcelamentos = parcelamentos;
	}

	public void addParcelamento(Parcelamento parcelamento) {
		
		parcelamentos.add(parcelamento);
	}
	
	public void removeParcelamento(Parcelamento parcelamento) {
		
		parcelamentos.remove(parcelamento);
	}
}
