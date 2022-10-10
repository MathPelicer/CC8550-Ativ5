import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

import core.PapelMoeda;
import core.Troco;

public class TrocoTest {
    @Test
    public void checkSuccessTrocoContructor() {
        int valor = 1234;

        Troco troco = new Troco(valor);

        Assert.assertNotNull(troco);
    }

    @Test
    public void checkSuccessTrocoIteratorConstructor() {
        int valor = 1234;

        Troco troco = new Troco(valor);
        Iterator<PapelMoeda> trocoIterator = troco.getIterator();

        Assert.assertNotNull(trocoIterator);
    }

    @Test
    public void checkQuantityOfBankNotesInTroco() {
        int valor = 1287;

        Troco troco = new Troco(valor);
        Iterator<PapelMoeda> trocoIterator = troco.getIterator();

        ArrayList<Integer> bankNotes = new ArrayList<>();

        while (trocoIterator.hasNext()) {
            PapelMoeda papelMoeda = trocoIterator.next();
            bankNotes.add(papelMoeda.getQuantidade());
        }

        ArrayList<Integer> expectedChange = new ArrayList<>();
        expectedChange.add(12);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);
        expectedChange.add(1);

        Assert.assertEquals(bankNotes, expectedChange);
    }

    @Test
    public void checkTrocoWithOnlyBankNote100() {
        int valor = 500;

        Troco troco = new Troco(valor);
        Iterator<PapelMoeda> trocoIterator = troco.getIterator();

        ArrayList<Integer> bankNotes = new ArrayList<>();

        while (trocoIterator.hasNext()) {
            PapelMoeda papelMoeda = trocoIterator.next();
            bankNotes.add(papelMoeda.getQuantidade());
        }

        ArrayList<Integer> expectedChange = new ArrayList<>();
        expectedChange.add(5);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);

        Assert.assertEquals(bankNotes, expectedChange);
    }

    @Test
    public void checkInvalidBankNote() {
        int valor = 1;
        Troco troco = new Troco(valor);
        Iterator<PapelMoeda> trocoIterator = troco.getIterator();

        ArrayList<Integer> bankNotes = new ArrayList<>();

        while (trocoIterator.hasNext()) {
            PapelMoeda papelMoeda = trocoIterator.next();
            bankNotes.add(papelMoeda.getQuantidade());
        }

        ArrayList<Integer> expectedChange = new ArrayList<>();
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);
        expectedChange.add(0);

        Assert.assertEquals(bankNotes, expectedChange);
    }

    // Todo: test all bank notes
    // same way as tested above to 100 bank note

}