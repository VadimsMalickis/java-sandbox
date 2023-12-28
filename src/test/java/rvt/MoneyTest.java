package rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rvt.exercises.Money;

public class MoneyTest {
    
    @Test
    public void moneyInitializationWorks() {
        Money money1 = new Money(12, 12);
        Money money2 = new Money(10, 25);

        assertTrue(money1.euros() == 12);
        assertTrue(money1.cents() == 12);
        assertEquals(12, money1.euros());
    }
}
