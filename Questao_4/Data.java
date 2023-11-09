package Questao_4;

import java.text.DateFormatSymbols;

public class Data {
	int mes;
	int dia;
	int ano;
	
	public void cadastrar(int dia, int mes, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public void displayData() {
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}
	
	public void mesPorExtenso(int mes) {
		String nomeMes = new DateFormatSymbols().getMonths()[mes - 1];
		System.out.println(dia + " de " + nomeMes + " de " + ano);
	}
}
