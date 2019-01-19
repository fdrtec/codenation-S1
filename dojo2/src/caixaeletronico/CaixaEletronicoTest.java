package caixaeletronico;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CaixaEletronicoTest {

    private CaixaEletronico caixaEletronico;

    @Before
    public void setUp(){
        caixaEletronico = new CaixaEletronico();
    }

    @Test
    public void sacaZero(){

        Map<Integer, Integer> notas = caixaEletronico.sacaValor(0);



        assertEquals(new Integer(0), notas.get(100));
        assertEquals(new Integer(0), notas.get(50));
        assertEquals(new Integer(0), notas.get(20));
        assertEquals(new Integer(0), notas.get(10));
        System.out.println(notas);

        /*
        assertEquals(0, notas.get(50));
        assertEquals(0, notas.get(20));
        assertEquals(0, notas.get(10));
        */
    }
}
