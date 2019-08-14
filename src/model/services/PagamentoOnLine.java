package model.services;

public interface PagamentoOnLine {

	double taxaPagamento(double valorParcela);
	double juros(double valorParcela, int meses);
}
