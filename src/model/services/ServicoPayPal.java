package model.services;

public class ServicoPayPal implements PagamentoOnLine{

	private static final double PORCENTAGEM_PAGAMENTO = 0.02;
	private static final double JUROS_MENSAIS = 0.01;
	
	
	@Override
	public double taxaPagamento(double valorParcela) {
		
		return valorParcela * PORCENTAGEM_PAGAMENTO;
	}

	@Override
	public double juros(double valorParcela, int meses) {
		
		return valorParcela*JUROS_MENSAIS*meses;
	}

	
}
