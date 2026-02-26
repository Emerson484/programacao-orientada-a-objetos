/* Uma clínica veterinária deseja controlar as consultas de cada animal, uma consulta é realizada por um
médico veterinário. As consultas são tem um preço(valor). Durante uma consulta pode ser realizado vários
procedimentos no animal (Ex.: exame de sangue, aplicação de medicamento, tosa, etc). Cada
procedimento tem um preço. O valor total a ser pago é o valor da consulta mais os valores dos
procedimentos realizados.*/
package pratica6;
import java.util.ArrayList;

public class Consulta {
	private int codigo;
	private static int cont;
	private String nomeAnimal;
	private String medico;
	private String data;
	private double valorConsultal;
	private ArrayList <Procedimento>procedimentos=new ArrayList<>();
	
    
	//construtor
	Consulta(String nomeAnimal,String medico,String data,double valorConsultal){
		//this.codigo=codigo;
		codigo=cont++;
		this.nomeAnimal=nomeAnimal;
		this.medico=medico;
		this.data=data;
		this.valorConsultal=valorConsultal;
		//this.procedimentos=procedimentos;
	}
	//metodos get eset
	public int getCodigo(){
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal=nomeAnimal;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico=medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data=data;
	}
	public double getValorConsultal() {
		return valorConsultal;
	}
	public void setValorConsultal(double valorConsultal) {
		this.valorConsultal=valorConsultal;
	}
	public ArrayList<Procedimento>getProcedimentos(){
		return procedimentos;
	}
	public void setProcedimentos(ArrayList<Procedimento>procedimentos) {
		this.procedimentos=procedimentos;
	}
	//inserirProcedimento(): método que recebe como parâmetro um procedimento e adiciona na lista de procedimentos
	public void inserirProcedimento(Procedimento novoProcedimento) {
		procedimentos.add(novoProcedimento);
	}
	//removerProcedimento(): método que recebe como parâmetro um procedimento e remove da lista de procedimentos
	public void removerProcedimento(Procedimento novoProcedimento) {
		procedimentos.remove(novoProcedimento);
	}
	//calcularValorTotal(): método que retorna o valor correspondente a consulta somado aos valores dos procedimentos realizados na consulta
	public double calcularTotal() {
		double valorTotal=valorConsultal;
		for(Procedimento p:procedimentos) {
			valorTotal+=p.getValor();
		}
		
		return valorTotal;
	}
	//imprimir(): método que retorna os dados da consulta com string. Exemplo:
	public String imprimir() {
		String informacoes="";
			informacoes+="consulta:"+codigo+"\n"+
					"animal:"+nomeAnimal+"\n"+
					"nome do medico:"+medico+"\n"+
					"data: "+data+"\n"+
					"valor da consulta:"+valorConsultal+"\n";
			informacoes+="procedimentos:";
			
			 for(Procedimento p:procedimentos) {
				 informacoes+=p.imprimir()+"\n";
			 }
			 informacoes+="valor total:"+calcularTotal();
					
					
					 
		
		return informacoes;
	}
}
