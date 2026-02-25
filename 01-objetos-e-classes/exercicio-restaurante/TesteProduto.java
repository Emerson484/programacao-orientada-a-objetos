package pratica2;

import java.util.Scanner;

public class TestarProduto {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String name="";
		double price=0;
		
		Produto produto1= new Produto();
		System.out.println("digite o nome do produto 1");
		name=scan.nextLine();
		produto1.nome=name;
		
		System.out.println("digite o preco produto 1");
		price=scan.nextDouble();
		scan.nextLine();
		produto1.preco=price;
		
		Produto produto2= new Produto();
		produto2.nome="refrigerante";
		produto2.preco=7.0;
		
		Pedido pedido1 = new Pedido();
		pedido1.adicionarPedido(produto1, 2);
		pedido1.adicionarPedido(produto2, 10);
		
		//pedido1.calcularTotal();
		
		System.out.println("o total do pedido foi"+pedido1.calcularTotal());
		
		scan.close();
	}

}
