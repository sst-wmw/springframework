import br.com.wmw.spring.domain.Cliente;
import br.com.wmw.spring.domain.Produto;


public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(1, "Richard");
		System.out.println(cliente.toString());

		System.out.println();

		Produto produto = new Produto(1, "iPhone 5s", 2800d);
		System.out.println(produto.toString());

	}

}
