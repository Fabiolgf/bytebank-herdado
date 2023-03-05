
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Gerente();
		
		f1.setNome("Fabio");
		f1.setCpf("111.222.333-44");
		f1.setSalario(5000);
		
		System.out.println("Nome funcionario: " + f1.getNome());
		System.out.println("Cpf funcionario: " + f1.getCpf());
		System.out.println("Salario funcionario: " + f1.getSalario());
		
		
	}

}
