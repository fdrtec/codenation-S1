package livraria;

import java.util.HashMap;
import java.util.Map;

public class Carrinho {

    Map<Livro, Integer> itens;

    public Carrinho() {
        this.itens = new HashMap<>();
    }

    public void adicionaNoCarrinho(Livro livro, int quantidade) {
        itens.put(livro, itens.getOrDefault(livro,0)+quantidade);
    }

    public void adicionarUmNoCarrinho(Livro livro) {
        this.adicionaNoCarrinho(livro, 1);
    }

    public double calcularCarrinho() {
        double valor = 0;

        for (Map.Entry<Livro, Integer> entry : this.itens.entrySet())
        {
             valor += entry.getValue() * entry.getKey().getValor() * (1 - getDesconto(entry.getValue()));

        }

        return valor;
    }

    private Double getDesconto(Integer value) {

        double desconto = 0;
        switch (value) {
            case 1: desconto = 0;
            case 2:
                 desconto = 0.05;
                 break;
            case 3: desconto = 0.10;
                break;
            case 4: desconto = 0.15;
            break;
            default: desconto = 0.20;
            break;
        }

        return desconto;


    }

}
