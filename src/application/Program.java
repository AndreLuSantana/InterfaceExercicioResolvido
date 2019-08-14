package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.services.ContratoServico;
import model.services.ServicoPayPal;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/mm/aaaa): ");
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor do Contrato: ");
		Double valorContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Informe o número e parcelas: ");
		int numeroParcelas = sc.nextInt();
		sc.nextLine();
		
		ContratoServico contratoServico = new ContratoServico(new ServicoPayPal());
		contratoServico.processarContrato(contrato, numeroParcelas);
		
		System.out.println("Parcelamentos: ");
		
		for(Parcelamento x : contrato.getParcelamentos()) {
			
			System.out.println(x.ToString());
		}
		
		
		sc.close();
	}

}
