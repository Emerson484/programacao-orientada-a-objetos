package teoricas3;

public class SeboDeLivros {
    public static void main(String[] args) {
        // Criando um livro
        String[] autoresLivro1 = {"Autor 1", "Autor 2"};
        Livro livro1 = new Livro("Livro A", autoresLivro1, "Editora X", 2020, 300, 50.0);

        // Criando clientes
        Cliente cliente1 = new Cliente("Cliente A", "Rua Y, 123", "11 99999-9999", true); // Cliente comprador
        Cliente cliente2 = new Cliente("Cliente B", "Rua Z, 456", "11 88888-8888", false); // Cliente vendedor

        // Exibindo informações
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Preço de venda: R$" + livro1.getPrecoVenda());

        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Cliente comprador: " + cliente1.isClienteComprador());

        System.out.println("Cliente: " + cliente2.getNome());
        System.out.println("Cliente comprador: " + cliente2.isClienteComprador());
    }
}
