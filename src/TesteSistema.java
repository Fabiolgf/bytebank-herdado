
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Cliente c = new Cliente();
		c.setSenha(1234);
		
		Administrador a = new Administrador();
		a.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(c);
		si.autentica(a);
	}
}
