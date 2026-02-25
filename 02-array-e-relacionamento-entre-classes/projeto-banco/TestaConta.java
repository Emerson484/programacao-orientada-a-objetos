package pratica4;

import java.util.Scanner;

public class TestaConta {
	

	public static String menu(){
		return "Digite:\n" +
		"1 - Criar conta \n"+
		"2 - Depositar \n"+
		"3 - Sacar \n"+
		"4 - Consultar saldo:\n"+
		"5 - Imprimir dados da conta\n" +
		"6 - Cadastrar cliente\n" +
		"7 - tranferir\n" +
		"0 - para sair";
		
		}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int contConta=0;
		int contCliente=0;
		Conta [] contas=new Conta[10];
		Cliente [] clientes=new Cliente[10];
		int numero=0,number=0;
		double saque=0,deposito=0,transferencia=0;
		int resposta=0;
		//System.out.println(menu());
		//int resposta=teclado.nextInt();
		//teclado.nextLine();
		
		do {
			System.out.println(menu());
			resposta=teclado.nextInt();
			teclado.nextLine();
			switch(resposta) {
	    //criar conta
		case 1:
			 System.out.println("digite o nome de cliente");
			 String responder=teclado.nextLine();
			 
			 boolean encontarCliente=false;
			 for(int i=0;i<clientes.length;i++) {
				 if(clientes[i]!=null && clientes[i].getNome().equals(responder)) {
					 Conta conta1=new Conta(clientes[i]);
					 contas[contConta]=conta1;
					 contConta++;
					 encontarCliente=true;
					 System.out.println("conta criada!");
					 System.out.println("o numero e:"+contas[contConta-1].getNumero());
					 /* o indice de clientes e diferente de contas pois ,ex o cliente pode ta na posicao 3 e a cont  vai ser criada na posicao 0,pq
					  *  e a primeira conta criada e  ao uar contas[3] vai imprimir outra conta*/
				 }
			 }
			 if(! encontarCliente) {
				 System.out.println("cliente nao encontrado");
			 }
			
			
			
			break;
			
	   //depositar	
       case 2:
    	   System.out.println("digite o numero da conta");
    	   numero=teclado.nextInt();
    	   
    	   boolean contaEncontrada=false;
    	   
    	   for(int i=0;i<contConta;i++) {
    		   if(contas[i].getNumero()==numero) {
    			   System.out.println("quanto vc quer depositar?");
    			   deposito=teclado.nextDouble();
    			   contas[i].depositar(deposito);
    			   System.out.println("valor depositado!");
    			   contaEncontrada=true;
    		   }
    	   }
    	   if(!contaEncontrada) {
    		   System.out.println("conta nao encontrada");
    	   }
       	
			
			break;
		
	    //sacar
        case 3:
        	   System.out.println("digite o numero da conta");
        	   numero=teclado.nextInt();
        	   boolean contaEncontrada1=false;
        	   
        	   for(int i=0;i<contConta;i++) {
        		   if(contas[i].getNumero()==numero) {
        			   contaEncontrada1=true;
        			   System.out.println("quanto vc quer sacar?");
        			   saque=teclado.nextDouble();
        			   if(contas[i].sacar(saque)) {
        				   System.out.println("saque realizado");
        			   }else {
        				   System.out.println("pobre!");
        			   }
        			   
        		   }
        	   }
        	   if(!contaEncontrada1) {
        		   System.out.println("conta nao encontrada");
        	   }
			
			break;
		
	    //Consultar saldo
        case 4:
           System.out.println("digite o numero da conta");
      	   numero=teclado.nextInt();
      	   boolean contaEncontrada2=false;
	        	for(int i=0;i<contConta;i++) {
	     		   if(contas[i].getNumero()==numero) {
	     			  contaEncontrada2=true;
	     			  System.out.println("o saldo e: "+contas[i].getSaldo());
	     		   }
	        	}
	        	 if(!contaEncontrada2) {
	        		   System.out.println("conta nao encontrada");
	        	   }
			break;
		
	    //Imprimir dados da conta
        case 5:
           System.out.println("digite o numero da conta");
      	   numero=teclado.nextInt();
	        	for(int i=0;i<contConta;i++) {
	      		   if(contas[i].getNumero()==numero) {
	      			 System.out.println(contas[i].imprimirConta());
	      		   }
	         	}
			
			break;
			
        case 6:
       	 // pedir info
       	 System.out.println("digite o seu nome");
       	 String nome=teclado.nextLine();
       	 
       	 System.out.println("digite o seu cpf");
       	 Long cpf=teclado.nextLong();
       	 teclado.nextLine();
       	 
       	 System.out.println("digite o seu endereco");
			 String endereco=teclado.nextLine();
			 
		 //criar o objeto
	     Cliente cliente1=new Cliente(nome,cpf,endereco);
		 clientes[contCliente]=cliente1;
		 contCliente++;
		 System.out.println("cliente cadastrado!");
		 break;
		
		//tranferir
        case 7:{
        	   System.out.println("digite o numero da sua conta");
        	   numero=teclado.nextInt();
        	   Conta contaTranferir=new Conta();
        	   Conta contaReceber=new Conta();
        	   
        	   //verificar se a primeira conta existe
  	        	for(int i=0;i<contConta;i++) {
  	      		   if(contas[i].getNumero()==numero) {
  	      			  contaTranferir=contas[i];
  	      		   }
  	      		}	
  	      		
  	      		//verificar se a segunda conta existe
  	           System.out.println("digite o numero da conta que vai receber");
          	   number=teclado.nextInt();
          	   
  	  	        for(int j=0;j<contConta;j++) {
  	  	      	   if(contas[j].getNumero()==number) {
  	  	      			 contaReceber=contas[j];
  	  	      		}
  	  	         }
  	  	        	
  	      	    System.out.println("quanto vc deseja tranferir?");
  	      	    transferencia=teclado.nextDouble();
  	      	    teclado.nextLine();
  	      	    contaTranferir.transferir(contaReceber,transferencia );
  	      		break;
  	        	
        }
		 
        case 0:{
        	System.out.println("saindo do programa!");
        	break;
        }
        
        default:{
        	System.out.println("opcao invalida!");
        	break;
        	
        }
        
	   }	
			
      }while(resposta!=0);
	  teclado.close();
   }
}

