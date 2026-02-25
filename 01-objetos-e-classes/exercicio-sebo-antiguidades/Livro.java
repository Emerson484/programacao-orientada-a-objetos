/*O sebo Antiguidades comercializa (compra e vende) livros usados e deseja controlar o estoque,
realizar vendas e manter o cadastro de clientes. Sobre os livros, é importante saber título, autores,
editora, ano, número de páginas, preço, etc. O sebo possui dois tipos de clientes: os que compram
livros e os que vendem livros para ele. 
Modele as classes livro e cliente para o sebo Antiguidades .
 Defina atributos e métodos para as classes;
 Encapsule o estado dos objetos;
 Defina construtores;
 Defina os métodos set e get necessários;
 Definir um método para calcular o preço que o livro será vendido pelo sebo;
 Escreva um programa principal para testar as classes.*/

package teoricas3;

public class Livro {
    private String titulo;
    private String[] autores;
    private String editora;
    private int ano;
    private int numeroPaginas;
    private double precoCompra;
    private double precoVenda;

    // Construtor
    public Livro(String titulo, String[] autores, String editora, int ano, int numeroPaginas, double precoCompra) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.numeroPaginas = numeroPaginas;
        this.precoCompra = precoCompra;
        this.precoVenda = calcularPrecoVenda();
    }

    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
        this.precoVenda = calcularPrecoVenda(); // Atualiza o preço de venda
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    // Método para calcular o preço de venda
    private double calcularPrecoVenda() {
        // Lógica para calcular o preço de venda com base no preço de compra
        return precoCompra * 1.75; // Exemplo: preço de venda é 75% maior que o preço de compra
    }
}

