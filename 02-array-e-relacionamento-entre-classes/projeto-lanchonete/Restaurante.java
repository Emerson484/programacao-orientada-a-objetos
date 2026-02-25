package pratica4;



import java.util.Scanner;

public class Principal2{
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
		int opcao=1;
		Scanner teclado = new Scanner(System.in);
        final int NUM_PRODUTOS = 10;
        Produto produtos[] = new Produto[NUM_PRODUTOS];
        int contProduto=0;
        Pedido pedidos[] = new Pedido[NUM_PRODUTOS];
        int contPedido=0;
        
        do {
        	System.out.println(menu());
        	opcao=teclado.nextInt();
        	 switch (opcao){
             case 1:{	//cadastrar produto
                 System.out.println("Digite o nome do produto");
                 String nome = teclado.next();
                 Produto p = new Produto (nome);
                 
                 System.out.print("Digite o preco do produto: R$");
                 double valor = teclado.nextDouble();
                 p.setValor(valor);
                 
                 produtos[contProduto]=p;
                 contProduto++;
                 System.out.println("Produto cadastrado: \n"+p.imprimir()+"\n");
                 break;
             }
             
             case 2:{
            	 Pedido novo = new Pedido("25/04/2025");
            	 pedidos[contPedido]=novo;
            	 contPedido++;
            	 System.out.println("Pedido numero "+novo.getCodigo()+" foi criado");
            	 break;
             }
             
             case 3:{	//inserir itens
            	 char resp='s';
            	 
            	 
            		//pede pra a pessoa digitar o codigo do pedido que vai comprar 
                	 System.out.println("Digite o codigo do pedido:");
                	 int codigo = teclado.nextInt();
                	 
                	 //cria um pedido vazio
                	 Pedido pedidoEscolhido = null;
                	 //passeia pelo vetor de pedidos ate encontrar aquele que tem o codigo igual ao que vc pediu
                	 for(int i=0; i<contPedido; i++) {
                		 if(codigo==pedidos[i].getCodigo()) {
                			pedidoEscolhido = pedidos[i];	//quando encontra faz o objeto pedidoEscolhido receber esse pedido
                		 }
                	 }
                	 
                	 //se encontrou o pedido
                	 if(pedidoEscolhido!=null) {
                		 while(resp!='n') {
	                		 //imprimir a listinha com todos os produtos cadastrados
	                		 String impressao="Escolha um produto para ser inserido: \n";
	                    	 for(int i=0; i<contProduto; i++) {
	                    		 impressao+=produtos[i].imprimir()+"\n";
	                    	 }
	                    	 System.out.println(impressao);
	                    	 
	                    	 //usuario diz qual produto ele vai inserir
	                    	 int numProduto = teclado.nextInt();
	                    	 Produto produtoEscolhido=null;
	                    	 
	                    	 //passeia pelo vetor de produtos até encontrar o produto correspondente ao codigo que vc pediu
	                    	 for(int i=0; i<contProduto; i++) {
	                    		 if(numProduto==produtos[i].getCodigo()) {
	                    			 produtoEscolhido = produtos[i];	//quando encontra faz o objeto produtoEscolhido receber esse produto
	                    			 break;
	                    		 }
	                    	 }
	                    	 
	                    	 //se encontrou esse produto
	                    	 if(produtoEscolhido!=null) {
	                    		 //usuario informa quanto do produto ele vai comprar
	                    		 System.out.println("Digite a quantidade que se deseja comprar:");
	                        	 int quantidadeProduto = teclado.nextInt();
	                        	 //cria novo item
	                        	 Item novoItem = new Item(produtoEscolhido);
	                        	 novoItem.setQuantidade(quantidadeProduto);
	                        	 
	                        	 pedidoEscolhido.inserirItem(novoItem);
	                        	 produtoEscolhido.venderProduto(quantidadeProduto);
	                        	 System.out.println("Quer inserir um outro produto (s/n)");
	                        	 resp = teclado.next().charAt(0);
	                    	 } else {
	                    		 System.out.println("Produto nao encontrado");
	                    		 break;
	                    	 }
                		 }
                	 }else {
                		 System.out.println("Pedido nao encontrado");
                	 }
            	 
            	 break;
             }
             case 4:{
            	 System.out.println("Digite o codigo do pedido:");
            	 int codigo = teclado.nextInt();
            	 
            	 //cria um pedido vazio
            	 Pedido pedidoEscolhido = null;
            	 //passeia pelo vetor de pedidos ate encontrar aquele que tem o codigo igual ao que vc pediu
            	 for(int i=0; i<contPedido; i++) {
            		 if(codigo==pedidos[i].getCodigo()) {
            			pedidoEscolhido = pedidos[i];	//quando encontra faz o objeto pedidoEscolhido receber esse pedido
            		 }
            	 }
            	 
            	 if(pedidoEscolhido!=null) {
            		 System.out.print("Valor total: R$"+pedidoEscolhido.calcularTotalPedido()+"\n");
            	 }
            	 break;
             }
             case 5:{
            	//imprimir a listinha com todos os produtos cadastrados
        		 String impressao="Escolha um produto para ser inserido: \n";
            	 for(int i=0; i<contProduto; i++) {
            		 impressao+=produtos[i].imprimir()+"\n";
            	 }
            	 System.out.println(impressao);
            	 
            	 //usuario diz qual produto ele vai inserir
            	 int numProduto = teclado.nextInt();
            	 Produto produtoEscolhido=null;
            	 
            	 //passeia pelo vetor de produtos até encontrar o produto correspondente ao codigo que vc pediu
            	 for(int i=0; i<contProduto; i++) {
            		 if(numProduto==produtos[i].getCodigo()) {
            			 produtoEscolhido = produtos[i];	//quando encontra faz o objeto produtoEscolhido receber esse produto
            		 }
            	 }
            	 
            	 if(produtoEscolhido!=null) {
            		 System.out.println("Digite quantas unidades do produto ");
            		 int quantidade = teclado.nextInt();
            		 produtoEscolhido.comprarProduto(quantidade);
            		 System.out.println("Tem "+ produtoEscolhido.getEstoque()+" no estoque agora");
            	 }
            	 
            	 break;
             }
             case 0:{
            	 break;
             }
             default:{
            	 System.out.println("Opcao invalida :(");
             }
         }
        	
        }while(opcao!=0);
	}
	
}

/* */
