package tests;

import org.junit.Assert;
import org.junit.Test;

import ticketmachine.core.TicketMachine;
import ticketmachine.exception.PapelMoedaInvalidaException;

public class TicketMachineTest {

    @Test
    public void chackTicketMachineConstructorSuccess() {
        int ticketPrice = 5;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        Assert.assertNotNull(ticketMachine);
    }

    @Test
    public void checkInsertBankNoteSuccess() {
        int valor = 10;

        TicketMachine ticketMachine = new TicketMachine(valor);

        try {
            ticketMachine.inserir(20);
        } catch (Exception e) {

        }

        int saldoExpected = 20;

        Assert.assertEquals(saldoExpected, ticketMachine.getSaldo());
    }

    @Test
    public void checkInsertBankNoteException() {
        int valor = 10;
        String message = "";
        TicketMachine ticketMachine = new TicketMachine(valor);

        try {
            ticketMachine.inserir(1);
        } catch (PapelMoedaInvalidaException e) {
            message = e.getMessage();
        }

        Assert.assertEquals(message, "Papel moeda inválido");
    }

    @Test
    public void checkPrintSuccess() {
        int valor = 10;
        TicketMachine ticketMachine = new TicketMachine(valor);
        String printTicketMachine = "";
        try {
            ticketMachine.inserir(30);
            printTicketMachine = ticketMachine.imprimir();
        } catch (Exception e) {

        }

        String result = "*****************\n";
        result += "*** R$ " + "20,00 ****\n";
        result += "*****************\n";

        Assert.assertEquals(result, printTicketMachine);
    }
}