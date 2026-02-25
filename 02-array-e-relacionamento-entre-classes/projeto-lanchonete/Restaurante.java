package pratica4;


import java.util.Scanner;

//⦁	Implemente a classe principal com as seguintes opções 
public class Restaurante{
    public static String menu(){
    return "Escolha uma opção:\n"
            + "1 - Cadastrar produto\n"
            + "2 - Fazer pedido\n"
            + "3 - Inserir itens\n"
            + "4 - Calcular valor do pedido\n"
            + "5 - Comparar produto\n" //comprar produtos para lanchonete
            + "0 - sair";
}

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int op;
	    final int NUM_PRODUTOS = 10;
	    Produto produtos[] = new Produto[NUM_PRODUTOS];
	    Pedido pedidos[]= new Pedido[10];
	    Item itens[]=new Item[10];
	    int contProduto=0;
	    int contPedido=0;
	    int contItens=0;
	    
	    System.out.println(menu());
	    op = teclado.nextInt();
	
	    while (op!=0){
	        switch (op){
	        //Cadastrar produto
	            case 1:{
	                System.out.println("Digite o nome do produto");
	                String nome = teclado.next();
	                
	                Produto p = new Produto (nome);
	                
	                System.out.println("Digite o preco do produto");
	                Double preco=teclado.nextDouble();
	                
	                p.setValor(preco);
	                
	                produtos[contProduto]=p;
	                contProduto++;
	                System.out.println("Produto cadastrado: \n"+p.imprimir()+"\n");
	                
	                break;
	            }
	            //Fazer pedido(reabastecer)
	            case 2:{
	                
	           
	                System.out.println("Digite a data do pedido");
	                String data = teclado.nextLine();
	                teclado.nextLine();
	                
	                Pedido pedido1=new Pedido(data);
	                pedidos[contPedido]=pedido1;
	               
	                System.out.println("pedido criado com sucesso");
	                contPedido++;
	                System.out.println("o codigo e:"+pedido1.getCodigo());
	                break;
	            }
	            // inserir item
	            case 3:{
	            	// verficar se existe o codigo do pedido
	            	Pedido pedidoEscolhido=null;
	            	System.out.println("Digite o codigo do pedido");
	                int codigo = teclado.nextInt();
	                
	            	for(int i=0;i<contProduto;i++) {
	            		if(pedidos[i].getCodigo()==codigo){
	            			pedidoEscolhido=pedidos[i];
	            			System.out.println("codigo encontrado");
	            		}
	            		    
	            	}
	            	
	            	//imprimir lista de produtos
	            	System.out.println("escolha um produto");
	            	for(int i=0;i<contProduto;i++) {
	            		System.out.println(produtos[i].imprimir());
	            		
	            	}
	            	// pedir qual produto vai querer
	            	Produto produtoEscolhido=null;
	            	
	            	System.out.println("qual produto vc deseja?");
	            	int numProduto = 0;
	            	for(int i=0;i<contProduto;i++) {
	            		if(produtos[i].getCodigo()==numProduto) {
	            			produtoEscolhido=produtos[i];
	            			
	            		}
	            		
	            	}
	            	// pedir a quantidade do produto
	            	System.out.println("quantos produto vc deseja?");
	            	int quantidade=teclado.nextInt();
	            	
	            	// criar e adicionar item
	            	Item item1=new Item(produtoEscolhido);
	            	item1.setQuantidade(quantidade);
	            	
	            	pedidoEscolhido.inserirItem(item1);
	            	
	            	produtoEscolhido.venderProduto(quantidade);
	            	
	            	
	            	
	                break;	
	            }
	        }
	        System.out.println(menu());
	        op = teclado.nextInt();
	    }
	}
}
	


