package pratica_11.visao;
//No pacote visão, escreva um programa principal que permita que o usuário cadastre produto, pesquise produto e liste os produtos cadastrados.

import java.util.Scanner;
import pratica_11.controle.ControleProduto;
import pratica_11.modelo.Produto;


public class Principal {
	//menu de opcoes
	public static String menu() {
		return  "escolha uma opcao!"+"\n"+
				"1-cadastrar produto"+"\n"+
				"2-pesquisar produto"+"\n"+
				"3-listar produtos cadastrados"+"\n"+
				"0-sair"+"\n";
	}
	public static void main(String[] args) {
	  //  ArrayList <ControleProduto> Produtos = new ArrayList<>();
	    ControleProduto Controle = new ControleProduto();
	    Scanner teclado=new Scanner(System.in);
	    int resposta=1;
	    
	    do {
	    	try {System.out.println(menu());
	    	resposta=teclado.nextInt();
	    	teclado.nextLine();
	    	
	    	switch(resposta) {
	    	//cadastrar produto
	    	case 1:{
	    		System.out.println("digite o codigo do produto");
	    		int codigo=teclado.nextInt();
	    		teclado.nextLine();
	    		
	    		System.out.println("digite a descricao do produto");
	    		String descricao=teclado.nextLine();
	    		
	    		System.out.println("digite o valor do produto");
	    		double valor=teclado.nextDouble();
	    		teclado.nextLine();
	    		
	    		Controle.cadastraProduto(codigo, descricao, valor);
	    		
	    		System.out.println("produto cadatrado com sucesso!");
	    		System.out.println("codigo:"+codigo);
	    		break;	
	    	}
	    	//pesquisar produto
	    	case 2:{
	    		System.out.println("digite o codigo do produto");
	    		int codigo=teclado.nextInt();
	    		teclado.nextLine();
	    		//armazena o produto retornado pelo metodo pesquisaProduto
	    		Produto encontrouProduto=Controle.pesquisarProduto(codigo); 
	    		if(encontrouProduto != null) {
	    			System.out.println("produto encontrado!");
	    			System.out.println(encontrouProduto.toString());
	    			
	    		}else {
	    			System.out.println("produto nao encontrado!");
	    		}
	    		
	    		
	    		break;
	    	}
	    	//listar produtos cadastrados
	    	case 3:{
	    		System.out.println(Controle.listarProduto());
	    		
	    		break;
	    	}case 0:{
	    		System.out.println("saindo...");
	    		break;
	    	}default :{
	    		System.out.println("opcao invalida!");
	    	}
	    		
	    	}
	    	
	    }catch(Exception e){
	    	System.out.println("digite uma opcao valida!");
	      teclado.nextLine();
	     }
	    		
	    	
	    }while(resposta!=0);
		teclado.close();
	}

}
