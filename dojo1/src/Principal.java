import livraria.Carrinho;
import livraria.Livro;

public class Principal {



    public static void main(String[] args) {

        Livro livro1 = new Livro("Primeiro livro", 42);
        Livro livro2 = new Livro("Segundo livro", 42);
        Livro livro3 = new Livro("Terceiro livro", 42);
        Livro livro4 = new Livro("Quarto livro", 42);
        Livro livro5 = new Livro("Quinto livro", 42);
        Livro livro6 = new Livro("Sexto livro", 42);
        Livro livro7 = new Livro("Sétimo livro", 42);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionaNoCarrinho(livro1, 2);
        carrinho.adicionaNoCarrinho(livro2, 2);
        carrinho.adicionaNoCarrinho(livro3, 2);
        carrinho.adicionaNoCarrinho(livro4, 1);
        carrinho.adicionaNoCarrinho(livro5, 1);

        System.out.println(carrinho.calcularCarrinho());

    }

}
