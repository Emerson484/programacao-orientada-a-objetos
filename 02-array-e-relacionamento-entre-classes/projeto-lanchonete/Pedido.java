package pratica4;
	
	public class Pedido {
	    private int codigo;
	    private String data;
	    private Item[] itens;
	    private int contItem=0;
	    private static int geradorDeCodigo=0;
	    
	    public Pedido (String data){
	        this.data=data;
	        this.itens = new Item[10];
	        this.codigo=geradorDeCodigo++;
	    }
	    
	    public void inserirItem(Item i){
	        itens[contItem]=i;
	        contItem++;
	    }
	    
	    /*public double calcularTotalPedido(){
	        double total=0;
	        for (Item i: itens){
	            total+=i.calcularSubTotal();
	        }
	        return total;
	    }*/
	    public double calcularTotalPedido() {
	        double total = 0;
	        for (int i = 0; i < contItem; i++) {
	            total += itens[i].calcularSubTotal();
	        }
	        return total;
	    }


	    public int getCodigo() {
	        return codigo;
	    }

	    public String getData() {
	        return data;
	    }

	    public Item[] getItens() {
	        return itens;
	    }
	}


/*⦁	Analise a classe Pedido abaixo e copie para o seu projeto
⦁	É necessário implementar os métodos setData e setCodigo? Explique sua resposta*/
	/*não pois o valor da data ja ja é definido no  construtor pedido assim como o codigo,que é incrementado 
	 * toda vez que um objeto do tipo pedido é criado,assim para a integridade desses dados eles devem serr
	 *  imutaveis  apos a criacao do objeto pedido*/
