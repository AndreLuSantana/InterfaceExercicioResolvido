package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ContratoServico {

	private PagamentoOnLine pagamentoOnLine;

	public ContratoServico(PagamentoOnLine pagamentoOnLine) {
		
		this.pagamentoOnLine = pagamentoOnLine;
	}

	public PagamentoOnLine getPagamentoOnLine() {
		return pagamentoOnLine;
	}

	public void setPagamentoOnLine(PagamentoOnLine pagamentoOnLine) {
		this.pagamentoOnLine = pagamentoOnLine;
	}
	
	public void processarContrato(Contrato contrato, int meses) {
		
		double parcelaBase = contrato.getValorTotal()/meses;
		
		for (int i = 1; i <= meses; i++) {
			
			Date data = addMeses(contrato.getData(), i);
			double atualizaParcela = parcelaBase + pagamentoOnLine.juros(parcelaBase, i);
			double parcelaReal = atualizaParcela + pagamentoOnLine.taxaPagamento(atualizaParcela);
			contrato.addParcelamento(new Parcelamento(data, parcelaReal));
		}
	}
	
	private Date addMeses(Date data, int n) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
