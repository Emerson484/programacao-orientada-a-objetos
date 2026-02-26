/*Na produção de bens e serviços é necessário pagar impostos. Eles geralmente tem
um tipo, uma alíquota (percentual utilizado para calcular o valor a ser pago por
determinado tributo) e um valor,crie um sistema baseado nisso*/

package pratica9.atividade2;
//- Criar a classe CalculaTritubo que tem uma lista de tributáveis

import java.util.ArrayList;
public class CalculaTributo {
	private ArrayList <ITributavel> listaDeTributos=new ArrayList<>();

	// Implemente o método adicionar tributo que recebe com parâmetro um ITributavel e adiciona a lista
	public void adicionarTributo(ITributavel tributavel) {
		listaDeTributos.add(tributavel);
	}
	
	// Implemente o método calculaTotalTributo que retorna o valor totalarrecadado com os tributáveis*/
	public double calculaTotalTributo() {
		double totalArrecadado=0;
		for(ITributavel I:listaDeTributos) {
			totalArrecadado+=I.getValorImposto();
		}
		return totalArrecadado;
	}
}
