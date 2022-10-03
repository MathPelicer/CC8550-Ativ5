package tests;

import org.junit.Assert;
import org.junit.Test;

import ticketmachine.core.PapelMoeda;

public class TrocoTest {
    @Test
    public void checkSuccessContructor() {
        int valor = 10;
        int quantidade = 1;

        PapelMoeda papelMoeda = new PapelMoeda(valor, quantidade);
        Assert.assertEquals(papelMoeda.getValor(), valor);
        Assert.assertEquals(papelMoeda.getQuantidade(), quantidade);
    }
}