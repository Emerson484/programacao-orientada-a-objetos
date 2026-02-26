package pratica6;

public class Procedimento {
	private int  codigoProcedimento;
	private String descricaoProcedimento;
	private double valor;
	private static int cont=0;
	
	// construtor
	Procedimento(String descricaoProcedimento,double valor){
		//this.codigoProcedimento=codigoProcedimento;
		codigoProcedimento=cont++;
		this.descricaoProcedimento=descricaoProcedimento;
		this.valor=valor;
	}
	public Procedimento() {
		
	}
    //metodos get e set
	public int getCodigoProcedimento() {
		return codigoProcedimento;
	}
	public void setCodigoProcedimento (int codigoProcedimento) {
		this.codigoProcedimento=codigoProcedimento;
	}
	public String getDescricaoProcedimento() {
		return descricaoProcedimento;
	}
	public void setDescricaoProcedimento(String descricaoProcedimento) {
		this.descricaoProcedimento=descricaoProcedimento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor=valor;
	}
	
	// metodo imprimir
	public String imprimir() {
		return "codigoProcedimento:"+codigoProcedimento+"\n"+
				"descricaoProcedimento"+descricaoProcedimento+"\n"+
		        "valor"+valor+"\n";
	}
}
