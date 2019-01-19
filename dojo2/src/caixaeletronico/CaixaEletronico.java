package caixaeletronico;

import java.util.HashMap;
import java.util.Map;

public class CaixaEletronico {

    private  Map<Integer, Integer> dispensador;

    public Map<Integer, Integer> sacaValor(Integer valor){

        Map<Integer, Integer> dispensador = new HashMap<>();

        dispensador.put(100, valor / 100);

        valor = valor % 100;
        dispensador.put(50, valor / 50);

        valor = valor % 50;
        dispensador.put(20, valor / 20);

        valor = valor % 20;
        dispensador.put(10, valor / 10);

        return dispensador;
    }
}
