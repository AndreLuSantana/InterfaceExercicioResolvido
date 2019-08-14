package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelamento {

	private	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVencimento;
	private Double valorParcela;
	
	public Parcelamento(Date dataVencimento, Double valorParcela) {
		
		this.dataVencimento = dataVencimento;
		this.valorParcela = valorParcela;
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}
	

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public String ToString() {
		
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", valorParcela);
	}
	
}
