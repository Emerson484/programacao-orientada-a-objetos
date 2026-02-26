package pratica7;
/*⦁Defina a classe LivroDidatico que tem Livro como superclasse. 
Um livro didático pode ser de matemática, português, programação, etc. Por isso, esta classe tem o atributo string disciplina;*/

public class LivroDidatico extends Livro{
	private String disciplina;
	
	//Defina um construtor para a classe;
    public LivroDidatico(String autor,String nome,int pagina,double preco,String disciplina){
		super(autor,nome,pagina,preco);
		this.disciplina=disciplina;
	}
	//Implemente os getters e setters necessários;
    public String getDisciplina() {
    	return disciplina;
    }
    public void setDisciplina(String disciplina) {
    	this.disciplina=disciplina;
    }
	//Implemente o método ehCaro. Um livro didático é considerado caro se custar mais de R$ 200,00. 
    public boolean ehcaroLivro() {
    	if(super.getPreco()>200) {
    		return true;
    	}else {
    		return false;
    	}
    }
	//Implemente o método toString. Este método deve retornar uma String com todos os dados do livro.
    @Override
    public String toString() {
    	return super.toString()+"\n"+
                    "disciplina"+disciplina;
    }


}
