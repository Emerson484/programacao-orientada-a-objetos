package pratica2;

import javax.swing.JOptionPane;

public class AppCalculadora {
	public static void main(String []args) {
		Calculadora cal= new Calculadora();
		int x;
		int y;
		
		String aux=JOptionPane.showInputDialog("digite um numero x");
		x=Integer.parseInt(aux);
		
		y= Integer.parseInt(JOptionPane.showInputDialog("digite um numero y"));
		
		System.out.println("a soma e "+cal.somar(x,y));
		System.out.println("a subtracao e e "+cal.subtrair(x,y));
		System.out.println("a multiplicacao e "+cal.multiplicar(x,y));
		System.out.println("a divisao e "+cal.dividir(x,y));
	}

}
