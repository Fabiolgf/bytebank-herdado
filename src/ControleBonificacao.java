
public class ControleBonificacao {

	double soma;
	
	public double getSoma() {
		return this.soma;
	}
	
	public void registra(Funcionario f) {
			this.soma += f.getBonificacao();
	}
	
	
}
