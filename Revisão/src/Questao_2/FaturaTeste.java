package Questao_2;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura f1 = new Fatura();
		
		f1.cadastrar("123", "Vela aromática", 2, 29.50);
		f1.mostrarFatura();
		
		f1.totalFatura();
	}

}
