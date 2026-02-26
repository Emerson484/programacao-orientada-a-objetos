package pratica_10.atividade1;
//import java.util.InputMismatchException;
import java.util.Scanner;
public class AppCalculadora{
  public static void main(String[] args) {
	  try{
		    Scanner ler = new Scanner(System.in);
	    	int x, y;
	    	Calculadora c = new Calculadora();
	    	System.out.println("Digite o primeiro número: ");
	    	x = ler.nextInt();
	    	System.out.println("Digite o segundo número: ");
	    	y = ler.nextInt();
	    	System.out.println("Soma: " + c.somar(x, y));
	    	System.out.println("Subtração: " + c.subtrair(x, y));
	    	System.out.println("Multiplicação: " + c.multiplicar(x, y));
	    	System.out.println("Divisão: " + c.dividir(x, y));
	    	ler.close();
	  }catch (Exception ex){
		System.out.println(ex.getMessage());
	 /* } catch (ArithmeticException e){
			 System.out.println(e.toString());
	  } catch (InputMismatchException e){
			 System.out.println("Entrada invalida ");	*/
		
	  }
	  
	 
	 
  }
}
/*2- Execute a classe AppCalculadora com asentradas abaixo. Quais exceções são lançadas?
a) x=20 y=a  java.util.InputMismatchException(inconpatiblidade de entrada,a variavel esperava receber um int
mas recebe um char)
b) x=10.0 y=2  nao aparece excecao
c) x=10 y=0  java.lang.ArithmeticException: / by zero (erro ao dividir por zero)*/

/*3- Altere o código da classe AppCalculadora para tratar as exceções identificadas (try/catch).
Utilize os métodos getMessage(), printStackTrace() e toString()*/

/*4- Altere os catch como mostrados abaixo e teste com as entradas da questão 1. O que acontece? Por que?
 os catch para excecao aritimetica e incopatibilidade de entada nao serao "alcancados" pois Exeption funciona como excecao generica,ou seja qualquer
  excecao sera capturada e tratada pelo catch que tem essa excecao o que faz com que os outros catch seja alcancados*/
