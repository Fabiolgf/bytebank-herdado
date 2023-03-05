
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		// aqui esta herdando os atributos da classe mae funcionario por causa do extends
		g1.setNome("Lucianne");
		g1.setCpf("123.456.789-00");
		g1.setSalario(5000);		
				
		System.out.println("Nome da Gerente: " + g1.getNome());
		System.out.println("Cpf da Gerente: " + g1.getCpf());
		System.out.println("Salario da Gerente: " + g1.getSalario());

		//aqui esta criando uma variavel e comparando "=" com a outra		
		g1.setSenha(12345);		
		boolean autenticou = g1.autentica(12345);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
