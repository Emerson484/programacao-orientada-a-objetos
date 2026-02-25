package teoricas3;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean clienteComprador; // true se o cliente compra, false se vende

    // Construtor
    public Cliente(String nome, String endereco, String telefone, boolean clienteComprador) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.clienteComprador = clienteComprador;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(boolean clienteComprador) {
        this.clienteComprador = clienteComprador;
    }
}
