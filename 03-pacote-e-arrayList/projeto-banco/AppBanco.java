//objetivo: refatorar o projeto Banco com arrayList
//pacote
package visao;

// importacoes
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Conta;
import modelo.Cliente;

public class AppBanco
{
    public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar cliente\n"+
                "2 - Cadastrar conta \n"+
                "3 - Depositar \n"+
                "4 - Sacar \n"+
                "5 - Consultar saldo\n" +
                "6 - Remover cliente\n" +
                "7 - Remover conta\n" +
                "8 - Listar cliente\n" +
                "9 - Listar contas\n" +
                "0 - para sair";
    }

    public static void main(String[] args) {
    	
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();
      
        int op;
        
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op!=0){
            switch (op){
                case 1:{//cadastrar cliente
                    String nome;
                    long cpf;
                    nome = JOptionPane.showInputDialog("Digite o nome do cliente");
                    cpf = Long.parseLong(JOptionPane.showInputDialog("digite o CPF"));
                    Cliente c = new Cliente(nome, cpf);
                    clientes.add (c);
                    JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso \n" + c.imprimir());
                    break;
                }
                case 2:{//cadastrar conta
                    long cpf;
                    cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF"));
                    Conta conta = null;
                    for (Cliente cliente : clientes){
                        if (cliente.getCpf()==cpf){
                            conta = new Conta(cliente);
                            contas.add(conta);
                            break;
                        }
                    }
                    if(conta!=null) {
                    	 JOptionPane.showMessageDialog(null,"Conta cadastrada com sucesso\n" + conta.imprimir());
                    }else {
                    	JOptionPane.showMessageDialog(null,"conta nao cadastrada");
                    }
                    	
                    break;
                }
                case 3:{//depositar
                	int numConta=0;
                	double valorDepositar=0;
                	
                	numConta=Integer.parseInt(JOptionPane.showInputDialog("digite o numero da conta que voce deseja depositar"));
                	for(int i=0;i<contas.size();i++) {
                		if(contas.get(i).getNumeroConta()==numConta) {
                			JOptionPane.showMessageDialog(null, "conta encontrada"+"\n");
                			valorDepositar=Double.parseDouble(JOptionPane.showInputDialog("quanto voce deseja depositar?"));
                			contas.get(i).depositar(valorDepositar);
                			JOptionPane.showMessageDialog(null, "valor depositado!"+"\n");
                		}
                	}
                    
                    break;
                }
                case 4: {//sacar
                    int numConta;
                    double valor;
                    numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
                    for (Conta c: contas){
                        if (numConta == c.getNumeroConta()){
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                            if (c.sacar(valor))
                                JOptionPane.showMessageDialog(null,"Saque reallizado com sucesso");
                            else
                                JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                            break;
                        }
                    }
                    break;
                }
                case 5: {//consultar saldo
                    int numConta;
                    numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
                    for (Conta c: contas){
                        if (numConta == c.getNumeroConta()){
                            JOptionPane.showMessageDialog(null, "Saldo da conta\n" + c.imprimir());
                            break;
                        }
                    }
                    break;
                }
                case 6: {//remover cliente
                    long cpf;
                    cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente que será removido"));
                    for (int i=0; i<clientes.size(); i++){
                        if (clientes.get(i).getCpf()==cpf){
                            clientes.remove(clientes.get(i));
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Cliente removido com sucesso\n");
                    break;
                }
                case 7: {//remover conta
                	int numConta=Integer.parseInt(JOptionPane.showInputDialog("digite o numero da conta que sera removida"));
                	for(int i=0;i<contas.size();i++) {
                		if(contas.get(i).getNumeroConta()==numConta) {
                			contas.remove(contas.get(i));
                			break;
                		}
                		
                	}
                	JOptionPane.showMessageDialog(null, "conta removida com sucesso!");

                    break;
                }
                case 8:{// listar cliente
                    String listaClientes = "";
                    for (Cliente c: clientes){
                        listaClientes += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog (null, listaClientes);
                    break;
                }
                case 9: {// listar conta
                	String listaContas="";
                	
                	for(int i=0;i<contas.size();i++) {
                		listaContas+=contas.get(i).imprimir()+"\n";
                	}
                	JOptionPane.showMessageDialog(null, listaContas);
                    break;
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
       
    }
}
