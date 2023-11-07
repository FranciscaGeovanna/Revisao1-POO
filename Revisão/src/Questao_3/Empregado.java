package Questao_3;

public class Empregado {
	String nome;
	String sobrenome;
	double salarioM;
	
	public void cadastrar(String nome, String sobrenome, double salarioM) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioM = salarioM;
	}
	
	public void mostrarEmpregado() {
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nSalário Mensal: " + salarioM);
		double salarioA = 12 * this.salarioM;
		System.out.println("Salário Anual: " + salarioA);
	}
	
	public void aumento() {
		salarioM = this.salarioM + (this.salarioM * 0.10);
	}
}
