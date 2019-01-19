import livraria.Carrinho;
import livraria.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrincipalTest {

    @Test
    public void testarCarrinhoCasoExemplo() {

        Livro livro1 = new Livro("Primeiro livro", 42);
        Livro livro2 = new Livro("Segundo livro", 42);
        Livro livro3 = new Livro("Terceiro livro", 42);
        Livro livro4 = new Livro("Quarto livro", 42);
        Livro livro5 = new Livro("Quinto livro", 42);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionaNoCarrinho(livro1, 2);
        carrinho.adicionaNoCarrinho(livro2, 2);
        carrinho.adicionaNoCarrinho(livro3, 2);
        carrinho.adicionaNoCarrinho(livro4, 1);
        carrinho.adicionaNoCarrinho(livro5, 1);

        assertEquals(268.8, carrinho.calcularCarrinho());

    }

    @Test
    public void testarCarrinhoCasoExemplo2() {

        Livro livro1 = new Livro("Primeiro livro", 42);
        Livro livro2 = new Livro("Segundo livro", 42);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionaNoCarrinho(livro1, 5);
        carrinho.adicionaNoCarrinho(livro2, 2);

        assertEquals(247.8, carrinho.calcularCarrinho());

    }

    @Test
    public void testarCarrinhoCasoExemplo3() {

        Livro livro1 = new Livro("Primeiro livro", 42);
        Livro livro2 = new Livro("Segundo livro", 42);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionaNoCarrinho(livro1, 5);
        carrinho.adicionaNoCarrinho(livro2, 2);

        assertEquals(247.8, carrinho.calcularCarrinho());

    }
}
