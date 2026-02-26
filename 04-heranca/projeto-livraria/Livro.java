package pratica7;
/*3 - Implemente a classe Livro. Lembre que a classe Livro é subclasse de Produto. 
⦁	Defina os atributos pagina e autor	
*/

public class Livro extends Produto {
	private int pagina;
	private String autor;
	
//Implemente um construtor que inicializa os atributos com os valores passados como parâmetros. Lembre de chamar o construtor de Produto.   
	public Livro(String nome,String autor,int pagina,double preco){
		super(nome,preco);//usei o super pra chamar o construtor da classe mae
		this.pagina=pagina;
		this.autor=autor;
	}

	//Implemente os métodos getter e setter
	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
//Defina o método ehGrande na classe livro. Um livro é grande quando tem mais de 200 páginas.
    public boolean ehGrande() {
    	if(pagina>200) {
    		return true;
    	}else {
    		return false;
    	}
    }
//Defina o método toString na classe livro, este método deve retornar uma string com os dados do produto e os dados do livro. (Use o comando super) 
    @Override //indicar que estou modificando o metodo da classe mae/superclasse
     public String toString() {
    	 return super.toString()+ // usei o super pra chamar o metodo da classe mae
    	 "quantidade de paginas:"+pagina+"\n"+
    			 "autor"+autor+"\n";
    			 
     }
}
