package Questao_3;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado();
		
		e1.cadastrar("Donatella", "Dragma", 3500);
		e2.cadastrar("Dante", "Legend", 2500);
		
		System.out.println("==== EMPREGADOS =====");
		e1.mostrarEmpregado();
		System.out.print("\n");
		e2.mostrarEmpregado();
		
		e1.aumento();
		e2.aumento();
		
		System.out.println("\nOs empregados receberam um aumento de 10%!\n");
		
		System.out.println("===== EMPREGADOS =====");
		e1.mostrarEmpregado();
		System.out.print("\n");
		e2.mostrarEmpregado();
	}
}
