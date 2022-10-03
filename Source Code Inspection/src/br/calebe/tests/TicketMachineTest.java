package tests;

import org.junit.Assert;
import org.junit.Test;

import ticketmachine.core.TicketMachine;

public class TicketMachineTest {

    @Test
    public void chackTicketMachineConstructorSuccess() {
        int ticketPrice = 5;

        TicketMachine ticketMachine = new TicketMachine(ticketPrice);
        Assert.assertNotNull(ticketMachine);
    }
}