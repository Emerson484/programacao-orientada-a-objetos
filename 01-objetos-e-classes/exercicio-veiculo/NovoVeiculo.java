package pratica3;


public class NovoVeiculo {
    private static int quantidadeVeiculos = 0; 
    private String cor;
    private String modelo;

    // Construtor padrão
    public NovoVeiculo() {
        quantidadeVeiculos++;
    }

    // Construtor com cor e modelo
    public NovoVeiculo(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
        quantidadeVeiculos++;
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para o atributo static
    public static int getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    
    public NovoVeiculo clone() {
        return new NovoVeiculo(this.cor, this.modelo);
    }

    
    public String toString() {
        return "Cor: " + cor + "\nModelo: " + modelo;
    }
}
