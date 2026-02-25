// criar metodos para fazer as operacoes de uma calculadora
package pratica2;

public class Calculadora {
    // método somar
    public int somar (int n1, int n2){
        return n1+n2;
    }
    // método subtrair
    public int subtrair (int n1, int n2){
        return n1-n2;
    }
    // metodo multiplicar
    public int multiplicar (int n1,int n2) {
    	return n1*n2;
    }
    // metodo dividir
    public double dividir (double n1,double n2) {
    	if(n2==0) {
    		System.out.println("nao pode dividir por zero");
    		return -1;
    	}else {
    		return n1/n2;
    	}
    	
    }
}
