package pratica2;

import java.util.Scanner;

public class AppBancoQuestao2 {

    public static String menu(){
        return "Digite:\n" +
                "1 - Configurar conta \n"+
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "5 - Imprimir conta\n" +
                "6 - Transferir\n" +
                "7 - ver extrato\n"+
                "0 - para sair";
    }

    public static void main (String[] args){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        int op;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println(menu());
        op = teclado.nextInt();
        
        while (op!=0){
            switch (op){
                case 1:{//Cadastrar conta
                    System.out.print("Digite o número da conta: ");
                    int numero = teclado.nextInt();
                    teclado.nextLine();
                    String nome;
                    System.out.print("Digite o nome do cliente: ");
                    nome = teclado.next();
                    conta1 = new Conta(numero,nome);
                    System.out.println("Conta definida com sucesso!\n");
                    
                    System.out.print("Digite o número da conta: ");
                    numero = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    nome = teclado.next();
                    conta2 = new Conta(numero,nome);
                    System.out.println("Conta definida com sucesso!\n");
                    break;
                }
                case 2:{//Depositar
                    System.out.print("Digite o numero da conta: ");
                    int numConta = teclado.nextInt();
                    System.out.print("Digite o valor do deposito: ");
                    double valor = teclado.nextDouble();
                    if (numConta == conta1.getNumero()){
                        conta1.depositar(valor);
                    }
                    else{
                        if (numConta == conta2.getNumero()){
                            conta2.depositar(valor);
                        }
                        else {
                            System.out.print("\nConta inválida\n");       
                        }
                    }
                    break;
                }
                case 3:{//sacar
                	System.out.println("qual o numero da conta?");
                	int numero=teclado.nextInt();
                	
                	System.out.println("digite o valor do saque?");
                	double sacar=teclado.nextDouble();
                	
                	if(numero==conta1.getNumero()) {
                		conta1.sacar(sacar);
                	}else {
                		if(numero==conta2.getNumero()) {
                			conta2.sacar(sacar);	
                	    }else {
                		    System.out.println("\nconta invalida\n");
                	    }
                	}
                
                    
                    break;
                }
                case 4: {//Consultar saldo
                	System.out.println("qual o numero da conta?");
                	int numero=teclado.nextInt();
                	
                	if(numero==conta1.getNumero()) {
                		System.out.println("o saldo da conta e"+conta1.getSaldo());
                	}else {
                		if(numero==conta2.getNumero()) {
                			System.out.println("o saldo da conta e"+conta2.getSaldo());
                	    }else {
                		    System.out.println("\nconta invalida\n");
                	    }
                	
                  
                	}
                	 break;
                }
                case 5: {//Imprimir dados da conta
                	System.out.println("qual o numero da conta?");
                	int numero=teclado.nextInt();
                	
                	if(numero==conta1.getNumero()) {
                		System.out.println(conta1.imprimirConta());
                	}else {
                		if(numero==conta2.getNumero()) {
                    		System.out.println(conta2.imprimirConta());
                		}else {
                			System.out.println("\nconta invalida\n");
                		}
                	 }
                   break;
                }
                case 6:{
                	System.out.println("qual o numero da conta?");
                	int numero=teclado.nextInt();
                	
                	System.out.println("quanto vc quer tranferir?");
                	double quantia=teclado.nextDouble();
                	
                	if(numero==conta1.getNumero()) {
                		if(conta1.transferir(conta2,quantia)) {
                		   
                		}
                		else {
                			System.out.println("saldo insuficiente");
                		}
                	}else {
                		if(numero==conta2.getNumero()) {
                			if(conta2.transferir(conta1, quantia)) {
                				
                			}else {
                				System.out.println("saldo insuficiente");
                			}
                    		
                		}else {
                			System.out.println("\nconta invalida\n");
                		}
                	 }
                	break;
                }
                case 7:{
                	System.out.println("qual o numero da conta?");
                	int numero=teclado.nextInt();
                	
                	if(numero==conta1.getNumero()) {
                		System.out.println(conta1.extrato());
                	}else {
                		if(numero==conta2.getNumero()) {
                    		System.out.println(conta2.extrato());
                		}else {
                			System.out.println("\nconta invalida\n");
                		}
                	 }
                	break;
                }
            }
            System.out.println(menu());
            op = teclado.nextInt();
           
        }
    }
  }

