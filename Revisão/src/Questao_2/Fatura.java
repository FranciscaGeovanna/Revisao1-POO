package Questao_2;

public class Fatura {
	String num;
	String descricao;
	int quantItem;
	double precoItem;
	
	public void cadastrar(String num, String descricao, int quantItem, double precoItem) {
		this.num = num;
		this.descricao = descricao;
		this.precoItem = precoItem;
		this.quantItem = quantItem;
	}
	
	public void mostrarFatura() {
		System.out.println("Número: " + num + "\nDescrição: " + descricao + "\nPreço: " + precoItem +
		"\nQuantidade: " + quantItem);
	}
	
	public void totalFatura() {
		double valor = this.quantItem * this.precoItem;
		System.out.println("\nTOTAL DA SUA FATURA: ");
		System.out.println(valor);
	}
}
